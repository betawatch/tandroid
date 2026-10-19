package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class n61 extends k61 {
    public final int e;
    public final m11 f;

    public n61(String str, int i10, m11 m11Var) {
        super(str, (m11) null);
        this.e = i10;
        this.f = m11Var;
    }

    @Override // org.telegram.ui.Components.k61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
        }
        m11 m11Var = this.f;
        if (m11Var != null) {
            m11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
