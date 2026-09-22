package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class k01 extends MetricAffectingSpan {
    public final TextPaint a;
    public final String b;

    public k01(TextPaint textPaint, String str) {
        this.a = textPaint;
        this.b = str;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        TextPaint textPaint2 = this.a;
        if (textPaint2 != null) {
            textPaint.setColor(textPaint2.getColor());
            textPaint.setTypeface(textPaint2.getTypeface());
            textPaint.setFlags(textPaint2.getFlags());
            textPaint.setTextSize(textPaint2.getTextSize());
            textPaint.baselineShift = textPaint2.baselineShift;
            textPaint.bgColor = textPaint2.bgColor;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        TextPaint textPaint2 = this.a;
        if (textPaint2 != null) {
            textPaint.setColor(textPaint2.getColor());
            textPaint.setTypeface(textPaint2.getTypeface());
            textPaint.setFlags(textPaint2.getFlags());
            textPaint.setTextSize(textPaint2.getTextSize());
            textPaint.baselineShift = textPaint2.baselineShift;
            textPaint.bgColor = textPaint2.bgColor;
        }
    }
}
