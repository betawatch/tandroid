package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l41 {
    public final org.telegram.ui.Components.vz a;
    public ng.f b;
    public final int c;
    public final /* synthetic */ m41 d;

    public l41(m41 m41Var, int i7) {
        this.d = m41Var;
        this.c = i7;
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(m41Var.getContext());
        vzVar.c = true;
        TextPaint textPaint = new TextPaint(1);
        vzVar.e = textPaint;
        vzVar.f = new Paint(1);
        Paint paint = new Paint(1);
        vzVar.h = paint;
        Paint paint2 = new Paint(1);
        vzVar.n = paint2;
        vzVar.x = org.telegram.messenger.g0.L(35.0f);
        vzVar.y = org.telegram.messenger.g0.L(22.0f);
        vzVar.E = org.telegram.messenger.g0.L(8.0f);
        vzVar.F = org.telegram.messenger.g0.L(3.5f);
        vzVar.G = new RectF();
        vzVar.H = 0.0f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.a = vzVar;
        vzVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        m41Var.h.addView(vzVar);
        m41Var.n.add(this);
    }
}
