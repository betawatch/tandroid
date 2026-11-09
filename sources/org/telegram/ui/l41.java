package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l41 {
    public final org.telegram.ui.Components.lz a;
    public ng.f b;
    public final int c;
    public final /* synthetic */ m41 d;

    public l41(m41 m41Var, int i7) {
        this.d = m41Var;
        this.c = i7;
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(m41Var.getContext());
        lzVar.c = true;
        TextPaint textPaint = new TextPaint(1);
        lzVar.e = textPaint;
        lzVar.f = new Paint(1);
        Paint paint = new Paint(1);
        lzVar.h = paint;
        Paint paint2 = new Paint(1);
        lzVar.n = paint2;
        lzVar.x = org.telegram.messenger.g0.L(35.0f);
        lzVar.y = org.telegram.messenger.g0.L(22.0f);
        lzVar.D = org.telegram.messenger.g0.L(8.0f);
        lzVar.E = org.telegram.messenger.g0.L(3.5f);
        lzVar.F = new RectF();
        lzVar.G = 0.0f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.a = lzVar;
        lzVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        m41Var.h.addView(lzVar);
        m41Var.n.add(this);
    }
}
