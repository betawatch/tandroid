package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h00 extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.p6 a;
    public final Paint b;
    public final int c;
    public final org.telegram.ui.Components.qz0 d;

    public h00(String str, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = p6Var;
        this.c = i10;
        this.d = new org.telegram.ui.Components.qz0(str, 9.33f, org.telegram.messenger.i0.o());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(this.c, this.a);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, w02);
        Paint paint2 = this.b;
        paint2.setColor(r12);
        float f10 = (i14 + i12) / 2.0f;
        float L = org.telegram.messenger.i0.L(14.66f);
        RectF rectF = org.telegram.messenger.i0.P;
        float f11 = L / 2.0f;
        rectF.set(f7, f10 - f11, this.d.k() + f7 + org.telegram.messenger.i0.L(9.33f), f11 + f10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint2);
        this.d.c(f7 + org.telegram.messenger.i0.L(4.66f), f10, 1.0f, w02, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.k() + org.telegram.messenger.i0.L(9.33f));
    }
}
