package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ca1 {
    public final org.telegram.ui.Components.v00 a;
    public kg.f b;
    public final int c;
    public final /* synthetic */ da1 d;

    public ca1(da1 da1Var, int i10) {
        this.d = da1Var;
        this.c = i10;
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(da1Var.getContext());
        v00Var.c = true;
        TextPaint textPaint = new TextPaint(1);
        v00Var.e = textPaint;
        v00Var.f = new Paint(1);
        Paint paint = new Paint(1);
        v00Var.h = paint;
        Paint paint2 = new Paint(1);
        v00Var.n = paint2;
        v00Var.w = AndroidUtilities.dp(35.0f);
        v00Var.x = AndroidUtilities.dp(22.0f);
        v00Var.y = AndroidUtilities.dp(8.0f);
        v00Var.E = AndroidUtilities.dp(3.5f);
        v00Var.F = new RectF();
        v00Var.G = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.a = v00Var;
        v00Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        da1Var.h.addView(v00Var);
        da1Var.n.add(this);
    }
}
