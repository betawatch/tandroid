package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i41 {
    public final org.telegram.ui.Components.oz a;
    public ng.f b;
    public final int c;
    public final /* synthetic */ j41 d;

    public i41(j41 j41Var, int i7) {
        this.d = j41Var;
        this.c = i7;
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(j41Var.getContext());
        ozVar.c = true;
        TextPaint textPaint = new TextPaint(1);
        ozVar.e = textPaint;
        ozVar.f = new Paint(1);
        Paint paint = new Paint(1);
        ozVar.h = paint;
        Paint paint2 = new Paint(1);
        ozVar.n = paint2;
        ozVar.x = org.telegram.messenger.g0.L(35.0f);
        ozVar.y = org.telegram.messenger.g0.L(22.0f);
        ozVar.E = org.telegram.messenger.g0.L(8.0f);
        ozVar.F = org.telegram.messenger.g0.L(3.5f);
        ozVar.G = new RectF();
        ozVar.H = 0.0f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.a = ozVar;
        ozVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        j41Var.h.addView(ozVar);
        j41Var.n.add(this);
    }
}
