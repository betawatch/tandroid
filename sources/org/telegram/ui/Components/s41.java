package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s41 extends p41 {
    public final int e;
    public final dz0 f;

    public s41(String str, int i7, dz0 dz0Var) {
        super(str, (dz0) null);
        this.e = i7;
        this.f = dz0Var;
    }

    @Override // org.telegram.ui.Components.p41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
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
        dz0 dz0Var = this.f;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
