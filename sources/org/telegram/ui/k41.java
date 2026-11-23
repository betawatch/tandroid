package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k41 {
    public final org.telegram.ui.Components.uz a;
    public ng.f b;
    public final int c;
    public final /* synthetic */ l41 d;

    public k41(l41 l41Var, int i7) {
        this.d = l41Var;
        this.c = i7;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(l41Var.getContext());
        uzVar.c = true;
        TextPaint textPaint = new TextPaint(1);
        uzVar.e = textPaint;
        uzVar.f = new Paint(1);
        Paint paint = new Paint(1);
        uzVar.h = paint;
        Paint paint2 = new Paint(1);
        uzVar.n = paint2;
        uzVar.x = org.telegram.messenger.g0.L(35.0f);
        uzVar.y = org.telegram.messenger.g0.L(22.0f);
        uzVar.E = org.telegram.messenger.g0.L(8.0f);
        uzVar.F = org.telegram.messenger.g0.L(3.5f);
        uzVar.G = new RectF();
        uzVar.H = 0.0f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.a = uzVar;
        uzVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        l41Var.h.addView(uzVar);
        l41Var.n.add(this);
    }
}
