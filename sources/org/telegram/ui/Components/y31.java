package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y31 extends v31 {
    public final int e;
    public final ty0 f;

    public y31(String str, int i3, ty0 ty0Var) {
        super(str, (ty0) null);
        this.e = i3;
        this.f = ty0Var;
    }

    @Override // org.telegram.ui.Components.v31, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i3 = this.e;
        if (i3 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        } else if (i3 == 2) {
            textPaint.setColor(-1);
        } else if (i3 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        }
        ty0 ty0Var = this.f;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
