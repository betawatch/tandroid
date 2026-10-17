package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class m61 extends j61 {
    public final int e;
    public final l11 f;

    public m61(String str, int i10, l11 l11Var) {
        super(str, (l11) null);
        this.e = i10;
        this.f = l11Var;
    }

    @Override // org.telegram.ui.Components.j61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
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
        l11 l11Var = this.f;
        if (l11Var != null) {
            l11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
