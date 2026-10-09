package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wj0 extends MetricAffectingSpan implements LineHeightSpan {
    public xj0 a;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        xj0 xj0Var = this.a;
        if (xj0Var.b) {
            int i14 = xj0Var.f ? 7 : 2;
            if (i10 <= xj0Var.c) {
                fontMetricsInt.ascent -= AndroidUtilities.dp((xj0Var.n ? 2 : 0) + i14);
                fontMetricsInt.top -= AndroidUtilities.dp((this.a.n ? 2 : 0) + i14);
            }
            if (i11 >= this.a.d) {
                float f7 = i14;
                fontMetricsInt.descent = AndroidUtilities.dp(f7) + fontMetricsInt.descent;
                fontMetricsInt.bottom = AndroidUtilities.dp(f7) + fontMetricsInt.bottom;
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
