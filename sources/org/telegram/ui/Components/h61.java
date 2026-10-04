package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class h61 extends k61 {
    public static boolean h = true;
    public final int e;
    public final m11 f;

    public h61(String str, int i10, m11 m11Var) {
        super(str, (m11) null);
        this.e = i10;
        this.f = m11Var;
    }

    @Override // org.telegram.ui.Components.k61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, h ? org.telegram.ui.ActionBar.i6.hc : org.telegram.ui.ActionBar.i6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, h ? org.telegram.ui.ActionBar.i6.gc : org.telegram.ui.ActionBar.i6.ec, false));
        }
        m11 m11Var = this.f;
        if (m11Var != null) {
            m11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
