package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h6 extends ImageSpan {
    public Paint.FontMetricsInt a;
    public float b;
    public int c;
    public String d;
    public boolean e;
    public int f;
    public boolean h;
    public float n;
    public float r;

    public static void a(Paint.FontMetricsInt fontMetricsInt, int i10) {
        int i11 = fontMetricsInt.descent;
        int i12 = fontMetricsInt.ascent;
        int i13 = i11 - i12;
        if (i10 <= i13) {
            return;
        }
        int i14 = i10 - i13;
        int i15 = (i14 + 1) / 2;
        int i16 = i12 - i15;
        fontMetricsInt.ascent = i16;
        fontMetricsInt.descent = i11 + (i14 - i15);
        fontMetricsInt.top = Math.min(fontMetricsInt.top, i16);
        fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        boolean z10;
        this.n = a1.g.A(this.b, this.c, 2.0f, f7);
        this.r = ((i14 - i12) / 2.0f) + i12;
        boolean z11 = true;
        this.h = true;
        if (paint.getAlpha() == 255 || !k6.n) {
            z10 = false;
        } else {
            getDrawable().setAlpha(paint.getAlpha());
            z10 = true;
        }
        float f10 = k6.m;
        int i15 = this.c;
        float f11 = f10 - ((i15 - (this.b * i15)) / 2.0f);
        if (f11 != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, f11);
        } else {
            z11 = false;
        }
        super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
        if (z11) {
            canvas.restore();
        }
        if (z10) {
            getDrawable().setAlpha(zs.e4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h6.class == obj.getClass()) {
            h6 h6Var = (h6) obj;
            if (Float.compare(this.b, h6Var.b) == 0 && this.c == h6Var.c && Objects.equals(this.d, h6Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        boolean z10 = this.e && fontMetricsInt2 != null;
        int i12 = z10 ? fontMetricsInt2.top : 0;
        int i13 = z10 ? fontMetricsInt2.ascent : 0;
        int i14 = z10 ? fontMetricsInt2.descent : 0;
        int i15 = z10 ? fontMetricsInt2.bottom : 0;
        int i16 = z10 ? fontMetricsInt2.leading : 0;
        if (fontMetricsInt2 == null) {
            fontMetricsInt2 = new Paint.FontMetricsInt();
        }
        Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
        int i17 = (int) (this.b * this.c);
        Paint.FontMetricsInt fontMetricsInt4 = this.a;
        if (fontMetricsInt4 != null) {
            fontMetricsInt3.ascent = fontMetricsInt4.ascent;
            fontMetricsInt3.descent = fontMetricsInt4.descent;
            fontMetricsInt3.top = fontMetricsInt4.top;
            fontMetricsInt3.bottom = fontMetricsInt4.bottom;
            if (getDrawable() != null) {
                getDrawable().setBounds(0, 0, i17, i17);
            }
            if (z10) {
                fontMetricsInt3.top = i12;
                fontMetricsInt3.ascent = i13;
                fontMetricsInt3.descent = i14;
                fontMetricsInt3.bottom = i15;
                fontMetricsInt3.leading = i16;
                a(fontMetricsInt3, this.f);
            }
            return i17;
        }
        int size = super.getSize(paint, charSequence, i10, i11, fontMetricsInt3);
        int L = i0.L(8.0f);
        int L2 = i0.L(10.0f);
        int i18 = (-L2) - L;
        fontMetricsInt3.top = i18;
        int i19 = L2 - L;
        fontMetricsInt3.bottom = i19;
        fontMetricsInt3.ascent = i18;
        fontMetricsInt3.leading = 0;
        fontMetricsInt3.descent = i19;
        if (z10) {
            fontMetricsInt3.top = i12;
            fontMetricsInt3.ascent = i13;
            fontMetricsInt3.descent = i14;
            fontMetricsInt3.bottom = i15;
            fontMetricsInt3.leading = i16;
            a(fontMetricsInt3, this.f);
        }
        return size;
    }

    @Override // android.text.style.ReplacementSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (getDrawable() instanceof g6) {
            ((g6) getDrawable()).b = 285212671 & textPaint.getColor();
        }
        super.updateDrawState(textPaint);
    }
}
