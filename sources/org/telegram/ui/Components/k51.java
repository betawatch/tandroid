package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k51 extends n51 {
    public static boolean h = true;
    public final int e;
    public final p01 f;

    public k51(String str, int i10, p01 p01Var) {
        super(str, (p01) null);
        this.e = i10;
        this.f = p01Var;
    }

    @Override // org.telegram.ui.Components.n51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
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
        p01 p01Var = this.f;
        if (p01Var != null) {
            p01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
