package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class vy0 extends MetricAffectingSpan {
    public final int a;
    public final uy0 b;

    public vy0(uy0 uy0Var, int i7) {
        this.b = uy0Var;
        if (i7 > 0) {
            this.a = i7;
        }
    }

    public final void a(TextPaint textPaint) {
        uy0 uy0Var = this.b;
        if (c8.zc.a(uy0Var.a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (c8.zc.a(uy0Var.a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (c8.zc.a(uy0Var.a, TLObject.FLAG_14)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final uy0 b() {
        return this.b;
    }

    public final boolean c() {
        return (this.b.a & 256) > 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.b.a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i7 = this.a;
        if (i7 != 0) {
            textPaint.setTextSize(i7);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.b.a(textPaint);
    }
}
