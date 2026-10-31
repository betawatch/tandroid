package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vh0 extends MetricAffectingSpan implements LineHeightSpan {
    public wh0 a;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        wh0 wh0Var = this.a;
        if (wh0Var.b) {
            int i14 = wh0Var.f ? 7 : 2;
            if (i10 <= wh0Var.c) {
                fontMetricsInt.ascent -= org.telegram.messenger.i0.L((wh0Var.n ? 2 : 0) + i14);
                fontMetricsInt.top -= org.telegram.messenger.i0.L((this.a.n ? 2 : 0) + i14);
            }
            if (i11 >= this.a.d) {
                float f7 = i14;
                fontMetricsInt.descent = org.telegram.messenger.i0.L(f7) + fontMetricsInt.descent;
                fontMetricsInt.bottom = org.telegram.messenger.i0.L(f7) + fontMetricsInt.bottom;
            }
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        textPaint.setTextSize(org.telegram.messenger.i0.L(this.a.a ? 16.0f : org.telegram.messenger.tz.W0 - 2));
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.i0.L(this.a.a ? 16.0f : org.telegram.messenger.tz.W0 - 2));
        textPaint.setTextScaleX(this.a.a ? 1.1f : 1.0f);
    }
}
