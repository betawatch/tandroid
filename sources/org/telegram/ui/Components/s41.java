package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s41 extends p41 {
    public final int e;
    public final vz0 f;

    public s41(String str, int i9, vz0 vz0Var) {
        super(str, (vz0) null);
        this.e = i9;
        this.f = vz0Var;
    }

    @Override // org.telegram.ui.Components.p41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i9 = this.e;
        if (i9 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
        } else if (i9 == 2) {
            textPaint.setColor(-1);
        } else if (i9 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gc, false));
        }
        vz0 vz0Var = this.f;
        if (vz0Var != null) {
            vz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
