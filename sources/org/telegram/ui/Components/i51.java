package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class i51 extends l51 {
    public static boolean h = true;
    public final int e;
    public final n01 f;

    public i51(String str, int i10, n01 n01Var) {
        super(str, (n01) null);
        this.e = i10;
        this.f = n01Var;
    }

    @Override // org.telegram.ui.Components.l51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, h ? org.telegram.ui.ActionBar.j6.hc : org.telegram.ui.ActionBar.j6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, h ? org.telegram.ui.ActionBar.j6.gc : org.telegram.ui.ActionBar.j6.ec, false));
        }
        n01 n01Var = this.f;
        if (n01Var != null) {
            n01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
