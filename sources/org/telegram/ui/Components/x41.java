package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x41 extends a51 {
    public static boolean h = true;
    public final int e;
    public final h01 f;

    public x41(String str, int i10, h01 h01Var) {
        super(str, (h01) null);
        this.e = i10;
        this.f = h01Var;
    }

    @Override // org.telegram.ui.Components.a51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, h ? org.telegram.ui.ActionBar.g6.hc : org.telegram.ui.ActionBar.g6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, h ? org.telegram.ui.ActionBar.g6.gc : org.telegram.ui.ActionBar.g6.ec, false));
        }
        h01 h01Var = this.f;
        if (h01Var != null) {
            h01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
