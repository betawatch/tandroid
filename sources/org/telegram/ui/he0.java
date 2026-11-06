package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class he0 extends ReplacementSpan {
    public final String a;
    public final boolean b;
    public final TextPaint c;
    public final Paint d;
    public final float e;
    public final /* synthetic */ je0 f;

    public he0(je0 je0Var, int i7, boolean z9) {
        this.f = je0Var;
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.d = new Paint(1);
        String valueOf = String.valueOf(i7);
        this.a = valueOf;
        this.b = z9;
        textPaint.setTextSize(org.telegram.messenger.g0.N(11.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.e = Math.max(org.telegram.messenger.g0.L(7.333f), textPaint.measureText(valueOf)) + org.telegram.messenger.g0.L(10.0f);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float L = f10 + org.telegram.messenger.g0.L(5.0f);
        float L2 = ((i11 + i13) / 2.0f) + org.telegram.messenger.g0.L(1.0f);
        float L3 = org.telegram.messenger.g0.L(17.333f) / 2.0f;
        int i14 = this.b ? org.telegram.ui.ActionBar.k6.Ci : org.telegram.ui.ActionBar.k6.U9;
        je0 je0Var = this.f;
        int themedColor = je0Var.getThemedColor(i14);
        Paint paint2 = this.d;
        paint2.setColor(themedColor);
        int themedColor2 = je0Var.getThemedColor(org.telegram.ui.ActionBar.k6.s8);
        TextPaint textPaint = this.c;
        textPaint.setColor(themedColor2);
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = this.e;
        rectF.set(L, L2 - L3, L + f11, L2 + L3);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f12 = L2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        String str = this.a;
        canvas.drawText(str, ((f11 - textPaint.measureText(str)) / 2.0f) + L, f12, textPaint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil(org.telegram.messenger.g0.L(5.0f) + this.e);
    }
}
