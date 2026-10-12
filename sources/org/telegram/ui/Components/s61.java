package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class s61 extends p61 {
    public final int e;
    public final p11 f;

    public s61(String str, int i10, p11 p11Var) {
        super(str, (p11) null);
        this.e = i10;
        this.f = p11Var;
    }

    @Override // org.telegram.ui.Components.p61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.gc, false));
        }
        p11 p11Var = this.f;
        if (p11Var != null) {
            p11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
