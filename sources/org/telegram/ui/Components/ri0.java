package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ri0 extends MetricAffectingSpan implements LineHeightSpan {
    public si0 a;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        si0 si0Var = this.a;
        if (si0Var.b) {
            int i14 = si0Var.f ? 7 : 2;
            if (i10 <= si0Var.c) {
                fontMetricsInt.ascent -= AndroidUtilities.dp((si0Var.n ? 2 : 0) + i14);
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
