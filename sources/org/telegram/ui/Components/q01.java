package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q01 extends MetricAffectingSpan {
    public final int a;
    public final p01 b;

    public q01(p01 p01Var, int i10) {
        this.b = p01Var;
        if (i10 > 0) {
            this.a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        p01 p01Var = this.b;
        if (w7.c0.a(p01Var.a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (w7.c0.a(p01Var.a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (w7.c0.a(p01Var.a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final p01 b() {
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
