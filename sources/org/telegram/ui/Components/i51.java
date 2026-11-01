package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i51 extends f51 {
    public final int e;
    public final zz0 f;

    public i51(String str, int i10, zz0 zz0Var) {
        super(str, (zz0) null);
        this.e = i10;
        this.f = zz0Var;
    }

    @Override // org.telegram.ui.Components.f51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false));
        }
        zz0 zz0Var = this.f;
        if (zz0Var != null) {
            zz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
