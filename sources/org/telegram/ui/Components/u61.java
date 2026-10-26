package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u61 extends x61 {
    public static boolean h = true;
    public final int e;
    public final y11 f;

    public u61(String str, int i10, y11 y11Var) {
        super(str, (y11) null);
        this.e = i10;
        this.f = y11Var;
    }

    @Override // org.telegram.ui.Components.x61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, h ? org.telegram.ui.ActionBar.y6.hc : org.telegram.ui.ActionBar.y6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, h ? org.telegram.ui.ActionBar.y6.gc : org.telegram.ui.ActionBar.y6.ec, false));
        }
        y11 y11Var = this.f;
        if (y11Var != null) {
            y11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
