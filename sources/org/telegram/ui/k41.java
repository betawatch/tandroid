package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k41 {
    public final org.telegram.ui.Components.kz a;
    public ng.f b;
    public final int c;
    public final /* synthetic */ l41 d;

    public k41(l41 l41Var, int i7) {
        this.d = l41Var;
        this.c = i7;
        org.telegram.ui.Components.kz kzVar = new org.telegram.ui.Components.kz(l41Var.getContext());
        kzVar.c = true;
        TextPaint textPaint = new TextPaint(1);
        kzVar.e = textPaint;
        kzVar.f = new Paint(1);
        Paint paint = new Paint(1);
        kzVar.h = paint;
        Paint paint2 = new Paint(1);
        kzVar.n = paint2;
        kzVar.x = org.telegram.messenger.g0.L(35.0f);
        kzVar.y = org.telegram.messenger.g0.L(22.0f);
        kzVar.D = org.telegram.messenger.g0.L(8.0f);
        kzVar.E = org.telegram.messenger.g0.L(3.5f);
        kzVar.F = new RectF();
        kzVar.G = 0.0f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.a = kzVar;
        kzVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        l41Var.h.addView(kzVar);
        l41Var.n.add(this);
    }
}
