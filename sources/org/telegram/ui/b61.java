package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b61 {
    public final org.telegram.ui.Components.yz a;
    public dg.g b;
    public final int c;
    public final /* synthetic */ c61 d;

    public b61(c61 c61Var, int i10) {
        this.d = c61Var;
        this.c = i10;
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(c61Var.getContext());
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
        c61Var.h.addView(yzVar);
        c61Var.n.add(this);
    }
}
