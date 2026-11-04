package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a41 {
    public final org.telegram.ui.Components.hz a;
    public og.f b;
    public final int c;
    public final /* synthetic */ b41 d;

    public a41(b41 b41Var, int i3) {
        this.d = b41Var;
        this.c = i3;
        org.telegram.ui.Components.hz hzVar = new org.telegram.ui.Components.hz(b41Var.getContext());
        hzVar.c = true;
        TextPaint textPaint = new TextPaint(1);
        hzVar.e = textPaint;
        hzVar.f = new Paint(1);
        Paint paint = new Paint(1);
        hzVar.h = paint;
        Paint paint2 = new Paint(1);
        hzVar.n = paint2;
        hzVar.x = org.telegram.messenger.g0.L(35.0f);
        hzVar.y = org.telegram.messenger.g0.L(22.0f);
        hzVar.E = org.telegram.messenger.g0.L(8.0f);
        hzVar.F = org.telegram.messenger.g0.L(3.5f);
        hzVar.G = new RectF();
        hzVar.H = 0.0f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.a = hzVar;
        hzVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        b41Var.h.addView(hzVar);
        b41Var.n.add(this);
    }
}
