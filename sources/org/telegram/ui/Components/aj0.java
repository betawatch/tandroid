package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class aj0 extends MetricAffectingSpan implements LineHeightSpan {
    public bj0 a;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        bj0 bj0Var = this.a;
        if (bj0Var.b) {
            int i14 = bj0Var.f ? 7 : 2;
            if (i10 <= bj0Var.c) {
                fontMetricsInt.ascent -= AndroidUtilities.dp((bj0Var.n ? 2 : 0) + i14);
                fontMetricsInt.top -= AndroidUtilities.dp((this.a.n ? 2 : 0) + i14);
            }
            if (i11 >= this.a.d) {
                float f10 = i14;
                fontMetricsInt.descent = AndroidUtilities.dp(f10) + fontMetricsInt.descent;
                fontMetricsInt.bottom = AndroidUtilities.dp(f10) + fontMetricsInt.bottom;
            }
        }
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.a.a ? 16.0f : SharedConfig.fontSize - 2));
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(this.a.a ? 16.0f : SharedConfig.fontSize - 2));
        textPaint.setTextScaleX(this.a.a ? 1.1f : 1.0f);
    }
}
