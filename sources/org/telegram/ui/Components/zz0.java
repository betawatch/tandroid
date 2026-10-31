package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zz0 extends MetricAffectingSpan {
    public final int a;
    public final yz0 b;

    public zz0(yz0 yz0Var, int i10) {
        this.b = yz0Var;
        if (i10 > 0) {
            this.a = i10;
        }
    }

    public final void a(TextPaint textPaint) {
        yz0 yz0Var = this.b;
        if (v7.u7.a(yz0Var.a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (v7.u7.a(yz0Var.a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (v7.u7.a(yz0Var.a, TLObject.FLAG_14)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final yz0 b() {
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
