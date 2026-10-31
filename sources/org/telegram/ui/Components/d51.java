package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d51 extends MetricAffectingSpan {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final byte d;
    public final yz0 e;

    public d51(CharSequence charSequence, int i10, int i11, byte b10, yz0 yz0Var) {
        this.a = charSequence;
        this.b = i10;
        this.c = i11;
        this.d = b10;
        this.e = yz0Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.i0.L(org.telegram.messenger.tz.W0 - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Tc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Sc, false));
        }
        yz0 yz0Var = this.e;
        if (yz0Var != null) {
            yz0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
            textPaint.setUnderlineText(false);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.i0.L(org.telegram.messenger.tz.W0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        yz0 yz0Var = this.e;
        if (yz0Var != null) {
            yz0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
