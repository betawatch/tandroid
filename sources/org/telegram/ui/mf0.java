package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class mf0 extends ReplacementSpan {
    public final String a;
    public final boolean b;
    public final TextPaint c;
    public final Paint d;
    public final float e;
    public final /* synthetic */ of0 f;

    public mf0(of0 of0Var, int i10, boolean z10) {
        this.f = of0Var;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i10);
        this.a = valueOf;
        this.b = z10;
        textPaint.setTextSize(org.telegram.messenger.i0.N(11.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        this.e = Math.max(org.telegram.messenger.i0.L(7.333f), textPaint.measureText(valueOf)) + org.telegram.messenger.i0.L(10.0f);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float L = f7 + org.telegram.messenger.i0.L(5.0f);
        float L2 = ((i12 + i14) / 2.0f) + org.telegram.messenger.i0.L(1.0f);
        float L3 = org.telegram.messenger.i0.L(17.333f) / 2.0f;
        int i15 = this.b ? org.telegram.ui.ActionBar.t6.Ci : org.telegram.ui.ActionBar.t6.U9;
        of0 of0Var = this.f;
        int themedColor = of0Var.getThemedColor(i15);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = of0Var.getThemedColor(org.telegram.ui.ActionBar.t6.s8);
        TextPaint textPaint = this.c;
        textPaint.setColor(themedColor2);
        RectF rectF = org.telegram.messenger.i0.P;
        float f10 = this.e;
        rectF.set(L, L2 - L3, L + f10, L2 + L3);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f11 = L2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.a;
        canvas.drawText(str, ((f10 - textPaint.measureText(str)) / 2.0f) + L, f11, textPaint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(org.telegram.messenger.i0.L(5.0f) + this.e);
    }
}
