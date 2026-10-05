package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class o61 extends l61 {
    public final int e;
    public final n11 f;

    public o61(String str, int i10, n11 n11Var) {
        super(str, (n11) null);
        this.e = i10;
        this.f = n11Var;
    }

    @Override // org.telegram.ui.Components.l61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
        }
        n11 n11Var = this.f;
        if (n11Var != null) {
            n11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
