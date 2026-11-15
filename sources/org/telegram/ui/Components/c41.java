package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c41 extends f41 {
    public static boolean h = true;
    public final int e;
    public final wy0 f;

    public c41(String str, int i7, wy0 wy0Var) {
        super(str, (wy0) null);
        this.e = i7;
        this.f = wy0Var;
    }

    @Override // org.telegram.ui.Components.f41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.e;
        if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, h ? org.telegram.ui.ActionBar.j6.Yc : org.telegram.ui.ActionBar.j6.Wc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, h ? org.telegram.ui.ActionBar.j6.Xc : org.telegram.ui.ActionBar.j6.Vc, false));
        }
        wy0 wy0Var = this.f;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
