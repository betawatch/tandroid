package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u41 extends r41 {
    public final int e;
    public final xz0 f;

    public u41(String str, int i10, xz0 xz0Var) {
        super(str, (xz0) null);
        this.e = i10;
        this.f = xz0Var;
    }

    @Override // org.telegram.ui.Components.r41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        }
        xz0 xz0Var = this.f;
        if (xz0Var != null) {
            xz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
