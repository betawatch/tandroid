package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class y51 extends b61 {
    public static boolean h = true;
    public final int e;
    public final d11 f;

    public y51(String str, int i10, d11 d11Var) {
        super(str, (d11) null);
        this.e = i10;
        this.f = d11Var;
    }

    @Override // org.telegram.ui.Components.b61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, h ? org.telegram.ui.ActionBar.h6.hc : org.telegram.ui.ActionBar.h6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, h ? org.telegram.ui.ActionBar.h6.gc : org.telegram.ui.ActionBar.h6.ec, false));
        }
        d11 d11Var = this.f;
        if (d11Var != null) {
            d11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
