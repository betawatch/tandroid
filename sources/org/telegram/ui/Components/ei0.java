package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ei0 extends MetricAffectingSpan implements LineHeightSpan {
    public fi0 a;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i9, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        fi0 fi0Var = this.a;
        if (fi0Var.b) {
            int i13 = fi0Var.f ? 7 : 2;
            if (i9 <= fi0Var.c) {
                fontMetricsInt.ascent -= AndroidUtilities.dp((fi0Var.n ? 2 : 0) + i13);
                fontMetricsInt.top -= AndroidUtilities.dp((this.a.n ? 2 : 0) + i13);
            }
            if (i10 >= this.a.d) {
                float f10 = i13;
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
