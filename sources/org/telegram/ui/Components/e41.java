package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class e41 extends b41 {
    public final int e;
    public final uy0 f;

    public e41(String str, int i7, uy0 uy0Var) {
        super(str, (uy0) null);
        this.e = i7;
        this.f = uy0Var;
    }

    @Override // org.telegram.ui.Components.b41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.e;
        if (i7 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        } else if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        }
        uy0 uy0Var = this.f;
        if (uy0Var != null) {
            uy0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
