package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class q51 extends n51 {
    public final int e;
    public final t01 f;

    public q51(String str, int i10, t01 t01Var) {
        super(str, (t01) null);
        this.e = i10;
        this.f = t01Var;
    }

    @Override // org.telegram.ui.Components.n51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
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
        t01 t01Var = this.f;
        if (t01Var != null) {
            t01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
