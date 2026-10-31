package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x41 extends MetricAffectingSpan {
    public Typeface a;
    public int b;
    public int c;

    public x41(Typeface typeface) {
        this.c = -1;
        this.a = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.c;
        if (i10 >= 0) {
            this.b = org.telegram.ui.ActionBar.t6.v0(i10);
        }
        Typeface typeface = this.a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i11 = this.b;
        if (i11 != 0) {
            textPaint.setColor(i11);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setFlags(textPaint.getFlags() | 128);
    }

    public x41() {
        Typeface typeface = Typeface.DEFAULT;
        this.c = -1;
        this.a = typeface;
    }

    public x41(Typeface typeface, int i10) {
        this.c = -1;
        this.a = typeface;
        this.b = i10;
    }
}
