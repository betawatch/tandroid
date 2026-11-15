package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e41 extends MetricAffectingSpan {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final byte d;
    public final wy0 e;

    public e41(CharSequence charSequence, int i7, int i10, byte b10, wy0 wy0Var) {
        this.a = charSequence;
        this.b = i7;
        this.c = i10;
        this.d = b10;
        this.e = wy0Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.gz.W0 - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Wc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Vc, false));
        }
        wy0 wy0Var = this.e;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
            textPaint.setUnderlineText(false);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.gz.W0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        wy0 wy0Var = this.e;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
