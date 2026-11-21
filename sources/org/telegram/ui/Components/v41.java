package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class v41 extends s41 {
    public final int e;
    public final fz0 f;

    public v41(String str, int i7, fz0 fz0Var) {
        super(str, (fz0) null);
        this.e = i7;
        this.f = fz0Var;
    }

    @Override // org.telegram.ui.Components.s41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.e;
        if (i7 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J6, false));
        } else if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xc, false));
        }
        fz0 fz0Var = this.f;
        if (fz0Var != null) {
            fz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
