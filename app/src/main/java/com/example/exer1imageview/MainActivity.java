package com.example.exer1imageview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button btn;

    Random rand = new Random();
    ImageView imageView;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        imageView = findViewById(R.id.imageView);

    }

    public void lol(View view) {
        x = rand.nextInt(3)+1;
        btn.setText(""+x);
        if (x==1){
            imageView.setImageResource(R.drawable.one);
        }
        if (x==2){
            imageView.setImageResource(R.drawable.two);
        }
        if (x==3){
            imageView.setImageResource(R.drawable.three);
        }


    }

}