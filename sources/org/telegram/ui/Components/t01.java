package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t01 extends MetricAffectingSpan {
    public final int a;
    public final s01 b;

    public t01(s01 s01Var, int i10) {
        this.b = s01Var;
        if (i10 > 0) {
            this.a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        s01 s01Var = this.b;
        if (k7.x8.a(s01Var.a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (k7.x8.a(s01Var.a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (k7.x8.a(s01Var.a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final s01 b() {
        return this.b;
    }

    public final boolean c() {
        return (this.b.a & 256) > 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.b.a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i10 = this.a;
        if (i10 != 0) {
            textPaint.setTextSize(i10);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.b.a(textPaint);
    }
}
