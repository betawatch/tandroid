package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i41 extends MetricAffectingSpan {
    public Typeface a;
    public int b;
    public int c;

    public i41(Typeface typeface) {
        this.c = -1;
        this.a = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i9 = this.c;
        if (i9 >= 0) {
            this.b = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
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

    public i41() {
        Typeface typeface = Typeface.DEFAULT;
        this.c = -1;
        this.a = typeface;
    }

    public i41(Typeface typeface, int i9) {
        this.c = -1;
        this.a = typeface;
        this.b = i9;
    }
}
