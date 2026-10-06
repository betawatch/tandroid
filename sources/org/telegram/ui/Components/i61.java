package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class i61 extends l61 {
    public static boolean h = true;
    public final int e;
    public final n11 f;

    public i61(String str, int i10, n11 n11Var) {
        super(str, (n11) null);
        this.e = i10;
        this.f = n11Var;
    }

    @Override // org.telegram.ui.Components.l61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
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
        n11 n11Var = this.f;
        if (n11Var != null) {
            n11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
