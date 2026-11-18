package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class m41 extends p41 {
    public static boolean h = true;
    public final int e;
    public final dz0 f;

    public m41(String str, int i7, dz0 dz0Var) {
        super(str, (dz0) null);
        this.e = i7;
        this.f = dz0Var;
    }

    @Override // org.telegram.ui.Components.p41, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.e;
        if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, h ? org.telegram.ui.ActionBar.n6.Yc : org.telegram.ui.ActionBar.n6.Wc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, h ? org.telegram.ui.ActionBar.n6.Xc : org.telegram.ui.ActionBar.n6.Vc, false));
        }
        dz0 dz0Var = this.f;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
