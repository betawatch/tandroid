package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wz0 extends MetricAffectingSpan {
    public final int a;
    public final vz0 b;

    public wz0(vz0 vz0Var, int i9) {
        this.b = vz0Var;
        if (i9 > 0) {
            this.a = i9;
        }
    }

    public final void a(TextPaint textPaint) {
        vz0 vz0Var = this.b;
        if (g7.z7.a(vz0Var.a, 49152)) {
            float textSize = textPaint.getTextSize();
            textPaint.setTextSize(0.75f * textSize);
            if (g7.z7.a(vz0Var.a, 32768)) {
                textPaint.baselineShift -= (int) (textSize * 0.35f);
            } else if (g7.z7.a(vz0Var.a, 16384)) {
                textPaint.baselineShift += (int) (textSize * 0.12f);
            }
        }
    }

    public final vz0 b() {
        return this.b;
    }

    public final boolean c() {
        return (this.b.a & 256) > 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i9 = this.a;
        if (i9 != 0) {
            textPaint.setTextSize(i9);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.b.a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i9 = this.a;
        if (i9 != 0) {
            textPaint.setTextSize(i9);
        }
        a(textPaint);
        textPaint.setFlags(textPaint.getFlags() | 128);
        this.b.a(textPaint);
    }
}
