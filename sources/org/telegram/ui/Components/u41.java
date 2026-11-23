package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class u41 extends r41 {
    public final int e;
    public final ez0 f;

    public u41(String str, int i7, ez0 ez0Var) {
        super(str, (ez0) null);
        this.e = i7;
        this.f = ez0Var;
    }

    @Override // org.telegram.ui.Components.r41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.e;
        if (i7 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J6, false));
        } else if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
        }
        ez0 ez0Var = this.f;
        if (ez0Var != null) {
            ez0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
