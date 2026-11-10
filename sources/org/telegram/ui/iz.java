package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class iz extends ReplacementSpan {
    public final org.telegram.ui.ActionBar.h6 a;
    public final Paint b;
    public final int c;
    public final org.telegram.ui.Components.my0 d;

    public iz(String str, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = h6Var;
        this.c = i7;
        this.d = new org.telegram.ui.Components.my0(str, 9.33f, org.telegram.messenger.g0.o());
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(this.c, this.a);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.15f, w02);
        Paint paint2 = this.b;
        paint2.setColor(r12);
        float f11 = (i13 + i11) / 2.0f;
        float L = org.telegram.messenger.g0.L(14.66f);
        RectF rectF = org.telegram.messenger.g0.P;
        float f12 = L / 2.0f;
        rectF.set(f10, f11 - f12, this.d.k() + f10 + org.telegram.messenger.g0.L(9.33f), f12 + f11);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
        this.d.c(f10 + org.telegram.messenger.g0.L(4.66f), f11, 1.0f, w02, canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.d.k() + org.telegram.messenger.g0.L(9.33f));
    }
}
