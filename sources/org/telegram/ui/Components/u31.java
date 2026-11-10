package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u31 extends MetricAffectingSpan {
    public Typeface a;
    public int b;
    public int c;

    public u31(Typeface typeface) {
        this.c = -1;
        this.a = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.c;
        if (i7 >= 0) {
            this.b = org.telegram.ui.ActionBar.m6.v0(i7);
        }
        Typeface typeface = this.a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        int i10 = this.b;
        if (i10 != 0) {
            textPaint.setColor(i10);
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

    public u31() {
        Typeface typeface = Typeface.DEFAULT;
        this.c = -1;
        this.a = typeface;
    }

    public u31(Typeface typeface, int i7) {
        this.c = -1;
        this.a = typeface;
        this.b = i7;
    }
}
