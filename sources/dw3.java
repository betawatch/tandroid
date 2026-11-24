// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dw3 extends ImageSpan {
    public Paint.FontMetricsInt a;
    public float b;
    public int c;
    public String d;
    public boolean e;
    public int f;
    public boolean h;
    public float n;
    public float r;

    public static void a(Paint.FontMetricsInt fontMetricsInt, int i) {
        int i2 = fontMetricsInt.descent;
        int i3 = fontMetricsInt.ascent;
        int i4 = i2 - i3;
        if (i <= i4) {
            return;
        }
        int i5 = i - i4;
        int i6 = (i5 + 1) / 2;
        int i7 = i3 - i6;
        fontMetricsInt.ascent = i7;
        fontMetricsInt.descent = i2 + (i5 - i6);
        fontMetricsInt.top = Math.min(fontMetricsInt.top, i7);
        fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        this.n = kt6.d(this.b, this.c, 2.0f, f);
        this.r = ((i5 - i3) / 2.0f) + i3;
        boolean z2 = true;
        this.h = true;
        if (paint.getAlpha() == 255 || !gw3.n) {
            z = false;
        } else {
            getDrawable().setAlpha(paint.getAlpha());
            z = true;
        }
        float f2 = gw3.m;
        int i6 = this.c;
        float f3 = f2 - ((i6 - (this.b * i6)) / 2.0f);
        if (f3 != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, f3);
        } else {
            z2 = false;
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        if (z2) {
            canvas.restore();
        }
        if (z) {
            getDrawable().setAlpha(nm7.d4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dw3.class == obj.getClass()) {
            dw3 dw3Var = (dw3) obj;
            if (Float.compare(this.b, dw3Var.b) == 0 && this.c == dw3Var.c && Objects.equals(this.d, dw3Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        boolean z = this.e && fontMetricsInt2 != null;
        if (z) {
            i3 = fontMetricsInt2.top;
            i4 = fontMetricsInt2.ascent;
            i5 = fontMetricsInt2.descent;
            i6 = fontMetricsInt2.bottom;
            i7 = fontMetricsInt2.leading;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (fontMetricsInt2 == null) {
            fontMetricsInt2 = new Paint.FontMetricsInt();
        }
        Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
        int i8 = (int) (this.b * this.c);
        Paint.FontMetricsInt fontMetricsInt4 = this.a;
        if (fontMetricsInt4 != null) {
            fontMetricsInt3.ascent = fontMetricsInt4.ascent;
            fontMetricsInt3.descent = fontMetricsInt4.descent;
            fontMetricsInt3.top = fontMetricsInt4.top;
            fontMetricsInt3.bottom = fontMetricsInt4.bottom;
            if (getDrawable() != null) {
                getDrawable().setBounds(0, 0, i8, i8);
            }
            if (z) {
                fontMetricsInt3.top = i3;
                fontMetricsInt3.ascent = i4;
                fontMetricsInt3.descent = i5;
                fontMetricsInt3.bottom = i6;
                fontMetricsInt3.leading = i7;
                a(fontMetricsInt3, this.f);
            }
            return i8;
        }
        int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt3);
        int L = gm.L(8.0f);
        int L2 = gm.L(10.0f);
        int i9 = (-L2) - L;
        fontMetricsInt3.top = i9;
        int i10 = L2 - L;
        fontMetricsInt3.bottom = i10;
        fontMetricsInt3.ascent = i9;
        fontMetricsInt3.leading = 0;
        fontMetricsInt3.descent = i10;
        if (z) {
            fontMetricsInt3.top = i3;
            fontMetricsInt3.ascent = i4;
            fontMetricsInt3.descent = i5;
            fontMetricsInt3.bottom = i6;
            fontMetricsInt3.leading = i7;
            a(fontMetricsInt3, this.f);
        }
        return size;
    }

    @Override // android.text.style.ReplacementSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (getDrawable() instanceof cw3) {
            ((cw3) getDrawable()).b = textPaint.getColor() & 285212671;
        }
        super.updateDrawState(textPaint);
    }
}
