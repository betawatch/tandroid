package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yy0 extends MetricAffectingSpan {
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
