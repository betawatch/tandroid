package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class j51 extends m51 {
    public static boolean h = true;
    public final int e;
    public final o01 f;

    public j51(String str, int i10, o01 o01Var) {
        super(str, (o01) null);
        this.e = i10;
        this.f = o01Var;
    }

    @Override // org.telegram.ui.Components.m51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, h ? org.telegram.ui.ActionBar.i6.hc : org.telegram.ui.ActionBar.i6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, h ? org.telegram.ui.ActionBar.i6.gc : org.telegram.ui.ActionBar.i6.ec, false));
        }
        o01 o01Var = this.f;
        if (o01Var != null) {
            o01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
