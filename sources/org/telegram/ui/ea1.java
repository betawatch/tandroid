package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ea1 {
    public final org.telegram.ui.Components.v00 a;
    public kg.f b;
    public final int c;
    public final /* synthetic */ fa1 d;

    public ea1(fa1 fa1Var, int i10) {
        this.d = fa1Var;
        this.c = i10;
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(fa1Var.getContext());
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
        fa1Var.h.addView(v00Var);
        fa1Var.n.add(this);
    }
}
