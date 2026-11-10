package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tg0 extends MetricAffectingSpan implements LineHeightSpan {
    public ug0 a;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i7, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        ug0 ug0Var = this.a;
        if (ug0Var.b) {
            int i13 = ug0Var.f ? 7 : 2;
            if (i7 <= ug0Var.c) {
                fontMetricsInt.ascent -= org.telegram.messenger.g0.L((ug0Var.n ? 2 : 0) + i13);
                fontMetricsInt.top -= org.telegram.messenger.g0.L((this.a.n ? 2 : 0) + i13);
            }
            if (i10 >= this.a.d) {
                float f10 = i13;
                fontMetricsInt.descent = org.telegram.messenger.g0.L(f10) + fontMetricsInt.descent;
                fontMetricsInt.bottom = org.telegram.messenger.g0.L(f10) + fontMetricsInt.bottom;
            }
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.a.a ? 16.0f : org.telegram.messenger.iz.W0 - 2));
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.a.a ? 16.0f : org.telegram.messenger.iz.W0 - 2));
        textPaint.setTextScaleX(this.a.a ? 1.1f : 1.0f);
    }
}
