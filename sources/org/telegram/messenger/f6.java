package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class f6 extends ImageSpan {
    public Paint.FontMetricsInt a;
    public float b;
    public int c;
    public String d;
    public boolean e;
    public int f;
    public boolean h;
    public float n;
    public float r;

    public static void a(Paint.FontMetricsInt fontMetricsInt, int i7) {
        int i10 = fontMetricsInt.descent;
        int i11 = fontMetricsInt.ascent;
        int i12 = i10 - i11;
        if (i7 <= i12) {
            return;
        }
        int i13 = i7 - i12;
        int i14 = (i13 + 1) / 2;
        int i15 = i11 - i14;
        fontMetricsInt.ascent = i15;
        fontMetricsInt.descent = i10 + (i13 - i14);
        fontMetricsInt.top = Math.min(fontMetricsInt.top, i15);
        fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z9;
        this.n = a8.p0.f(this.b, this.c, 2.0f, f10);
        this.r = ((i13 - i11) / 2.0f) + i11;
        boolean z10 = true;
        this.h = true;
        if (paint.getAlpha() == 255 || !i6.n) {
            z9 = false;
        } else {
            getDrawable().setAlpha(paint.getAlpha());
            z9 = true;
        }
        float f11 = i6.m;
        int i14 = this.c;
        float f12 = f11 - ((i14 - (this.b * i14)) / 2.0f);
        if (f12 != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, f12);
        } else {
            z10 = false;
        }
        super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        if (z10) {
            canvas.restore();
        }
        if (z9) {
            getDrawable().setAlpha(qs.e4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f6.class == obj.getClass()) {
            f6 f6Var = (f6) obj;
            if (Float.compare(this.b, f6Var.b) == 0 && this.c == f6Var.c && Objects.equals(this.d, f6Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        boolean z9 = this.e && fontMetricsInt2 != null;
        int i11 = z9 ? fontMetricsInt2.top : 0;
        int i12 = z9 ? fontMetricsInt2.ascent : 0;
        int i13 = z9 ? fontMetricsInt2.descent : 0;
        int i14 = z9 ? fontMetricsInt2.bottom : 0;
        int i15 = z9 ? fontMetricsInt2.leading : 0;
        if (fontMetricsInt2 == null) {
            fontMetricsInt2 = new Paint.FontMetricsInt();
        }
        Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
        int i16 = (int) (this.b * this.c);
        Paint.FontMetricsInt fontMetricsInt4 = this.a;
        if (fontMetricsInt4 != null) {
            fontMetricsInt3.ascent = fontMetricsInt4.ascent;
            fontMetricsInt3.descent = fontMetricsInt4.descent;
            fontMetricsInt3.top = fontMetricsInt4.top;
            fontMetricsInt3.bottom = fontMetricsInt4.bottom;
            if (getDrawable() != null) {
                getDrawable().setBounds(0, 0, i16, i16);
            }
            if (z9) {
                fontMetricsInt3.top = i11;
                fontMetricsInt3.ascent = i12;
                fontMetricsInt3.descent = i13;
                fontMetricsInt3.bottom = i14;
                fontMetricsInt3.leading = i15;
                a(fontMetricsInt3, this.f);
            }
            return i16;
        }
        int size = super.getSize(paint, charSequence, i7, i10, fontMetricsInt3);
        int L = g0.L(8.0f);
        int L2 = g0.L(10.0f);
        int i17 = (-L2) - L;
        fontMetricsInt3.top = i17;
        int i18 = L2 - L;
        fontMetricsInt3.bottom = i18;
        fontMetricsInt3.ascent = i17;
        fontMetricsInt3.leading = 0;
        fontMetricsInt3.descent = i18;
        if (z9) {
            fontMetricsInt3.top = i11;
            fontMetricsInt3.ascent = i12;
            fontMetricsInt3.descent = i13;
            fontMetricsInt3.bottom = i14;
            fontMetricsInt3.leading = i15;
            a(fontMetricsInt3, this.f);
        }
        return size;
    }

    @Override // android.text.style.ReplacementSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (getDrawable() instanceof e6) {
            ((e6) getDrawable()).b = 285212671 & textPaint.getColor();
        }
        super.updateDrawState(textPaint);
    }
}
