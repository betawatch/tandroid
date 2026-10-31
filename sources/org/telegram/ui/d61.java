package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d61 {
    public final org.telegram.ui.Components.yz a;
    public dg.g b;
    public final int c;
    public final /* synthetic */ e61 d;

    public d61(e61 e61Var, int i10) {
        this.d = e61Var;
        this.c = i10;
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(e61Var.getContext());
        yzVar.c = true;
        TextPaint textPaint = new TextPaint(1);
        yzVar.e = textPaint;
        yzVar.f = new Paint(1);
        Paint paint = new Paint(1);
        yzVar.h = paint;
        Paint paint2 = new Paint(1);
        yzVar.n = paint2;
        yzVar.x = org.telegram.messenger.i0.L(35.0f);
        yzVar.y = org.telegram.messenger.i0.L(22.0f);
        yzVar.D = org.telegram.messenger.i0.L(8.0f);
        yzVar.E = org.telegram.messenger.i0.L(3.5f);
        yzVar.F = new RectF();
        yzVar.G = 0.0f;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        this.a = yzVar;
        yzVar.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        e61Var.h.addView(yzVar);
        e61Var.n.add(this);
    }
}
