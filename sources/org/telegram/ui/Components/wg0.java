package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wg0 extends MetricAffectingSpan implements LineHeightSpan {
    public xg0 a;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i7, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        xg0 xg0Var = this.a;
        if (xg0Var.b) {
            int i13 = xg0Var.f ? 7 : 2;
            if (i7 <= xg0Var.c) {
                fontMetricsInt.ascent -= org.telegram.messenger.g0.L((xg0Var.n ? 2 : 0) + i13);
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
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.a.a ? 16.0f : org.telegram.messenger.gz.W0 - 2));
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.a.a ? 16.0f : org.telegram.messenger.gz.W0 - 2));
        textPaint.setTextScaleX(this.a.a ? 1.1f : 1.0f);
    }
}
