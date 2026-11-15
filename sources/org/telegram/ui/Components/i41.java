package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i41 extends f41 {
    public final int e;
    public final wy0 f;

    public i41(String str, int i7, wy0 wy0Var) {
        super(str, (wy0) null);
        this.e = i7;
        this.f = wy0Var;
    }

    @Override // org.telegram.ui.Components.f41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.e;
        if (i7 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J6, false));
        } else if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xc, false));
        }
        wy0 wy0Var = this.f;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
