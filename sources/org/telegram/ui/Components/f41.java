package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f41 extends c41 {
    public final int e;
    public final vy0 f;

    public f41(String str, int i7, vy0 vy0Var) {
        super(str, (vy0) null);
        this.e = i7;
        this.f = vy0Var;
    }

    @Override // org.telegram.ui.Components.c41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.e;
        if (i7 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.J6, false));
        } else if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Vc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Uc, false));
        }
        vy0 vy0Var = this.f;
        if (vy0Var != null) {
            vy0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
