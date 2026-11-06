package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class a41 extends MetricAffectingSpan {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final byte d;
    public final uy0 e;

    public a41(CharSequence charSequence, int i7, int i10, byte b10, uy0 uy0Var) {
        this.a = charSequence;
        this.b = i7;
        this.c = i10;
        this.d = b10;
        this.e = uy0Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.iz.W0 - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Tc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sc, false));
        }
        uy0 uy0Var = this.e;
        if (uy0Var != null) {
            uy0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
            textPaint.setUnderlineText(false);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.iz.W0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        uy0 uy0Var = this.e;
        if (uy0Var != null) {
            uy0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
