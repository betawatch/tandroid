package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wh0 extends MetricAffectingSpan implements LineHeightSpan {
    public xh0 a;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        xh0 xh0Var = this.a;
        if (xh0Var.b) {
            int i14 = xh0Var.f ? 7 : 2;
            if (i10 <= xh0Var.c) {
                fontMetricsInt.ascent -= org.telegram.messenger.i0.L((xh0Var.n ? 2 : 0) + i14);
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
        textPaint.setTextSize(org.telegram.messenger.i0.L(this.a.a ? 16.0f : org.telegram.messenger.uz.W0 - 2));
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.i0.L(this.a.a ? 16.0f : org.telegram.messenger.uz.W0 - 2));
        textPaint.setTextScaleX(this.a.a ? 1.1f : 1.0f);
    }
}
