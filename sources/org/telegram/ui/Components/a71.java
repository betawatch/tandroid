package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a71 extends x61 {
    public final int e;
    public final y11 f;

    public a71(String str, int i10, y11 y11Var) {
        super(str, (y11) null);
        this.e = i10;
        this.f = y11Var;
    }

    @Override // org.telegram.ui.Components.x61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gc, false));
        }
        y11 y11Var = this.f;
        if (y11Var != null) {
            y11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
