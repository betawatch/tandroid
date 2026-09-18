package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class y01 extends MetricAffectingSpan {
    public TextPaint a;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        TextPaint textPaint2 = this.a;
        textPaint.setColor(textPaint2.getColor());
        textPaint.setTypeface(textPaint2.getTypeface());
        textPaint.setFlags(textPaint2.getFlags());
        textPaint.setTextSize(textPaint2.getTextSize());
        textPaint.baselineShift = textPaint2.baselineShift;
        textPaint.bgColor = textPaint2.bgColor;
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        TextPaint textPaint2 = this.a;
        textPaint.setColor(textPaint2.getColor());
        textPaint.setTypeface(textPaint2.getTypeface());
        textPaint.setFlags(textPaint2.getFlags());
        textPaint.setTextSize(textPaint2.getTextSize());
        textPaint.baselineShift = textPaint2.baselineShift;
        textPaint.bgColor = textPaint2.bgColor;
    }
}
