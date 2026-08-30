package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yi0 extends MetricAffectingSpan implements LineHeightSpan {
    public zi0 a;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        zi0 zi0Var = this.a;
        if (zi0Var.b) {
            int i14 = zi0Var.f ? 7 : 2;
            if (i10 <= zi0Var.c) {
                fontMetricsInt.ascent -= AndroidUtilities.dp((zi0Var.n ? 2 : 0) + i14);
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
