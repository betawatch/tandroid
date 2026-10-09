package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ka1 {
    public final org.telegram.ui.Components.i10 a;
    public kg.f b;
    public final int c;
    public final /* synthetic */ la1 d;

    public ka1(la1 la1Var, int i10) {
        this.d = la1Var;
        this.c = i10;
        org.telegram.ui.Components.i10 i10Var = new org.telegram.ui.Components.i10(la1Var.getContext());
        i10Var.c = true;
        TextPaint textPaint = new TextPaint(1);
        i10Var.e = textPaint;
        i10Var.f = new Paint(1);
        Paint paint = new Paint(1);
        i10Var.h = paint;
        Paint paint2 = new Paint(1);
        i10Var.n = paint2;
        i10Var.w = AndroidUtilities.dp(35.0f);
        i10Var.x = AndroidUtilities.dp(22.0f);
        i10Var.y = AndroidUtilities.dp(8.0f);
        i10Var.E = AndroidUtilities.dp(3.5f);
        i10Var.F = new RectF();
        i10Var.G = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.a = i10Var;
        i10Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        la1Var.h.addView(i10Var);
        la1Var.n.add(this);
    }
}
