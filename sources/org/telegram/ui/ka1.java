package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ka1 {
    public final org.telegram.ui.Components.s00 a;
    public lg.f b;
    public final int c;
    public final /* synthetic */ la1 d;

    public ka1(la1 la1Var, int i10) {
        this.d = la1Var;
        this.c = i10;
        org.telegram.ui.Components.s00 s00Var = new org.telegram.ui.Components.s00(la1Var.getContext());
        s00Var.c = true;
        TextPaint textPaint = new TextPaint(1);
        s00Var.e = textPaint;
        s00Var.f = new Paint(1);
        Paint paint = new Paint(1);
        s00Var.h = paint;
        Paint paint2 = new Paint(1);
        s00Var.n = paint2;
        s00Var.w = AndroidUtilities.dp(35.0f);
        s00Var.x = AndroidUtilities.dp(22.0f);
        s00Var.y = AndroidUtilities.dp(8.0f);
        s00Var.E = AndroidUtilities.dp(3.5f);
        s00Var.F = new RectF();
        s00Var.G = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.a = s00Var;
        s00Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        la1Var.h.addView(s00Var);
        la1Var.n.add(this);
    }
}
