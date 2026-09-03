package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o51 extends l51 {
    public final int e;
    public final s01 f;

    public o51(String str, int i10, s01 s01Var) {
        super(str, (s01) null);
        this.e = i10;
        this.f = s01Var;
    }

    @Override // org.telegram.ui.Components.l51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.gc, false));
        }
        s01 s01Var = this.f;
        if (s01Var != null) {
            s01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
