package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v61 extends y61 {
    public static boolean h = true;
    public final int e;
    public final z11 f;

    public v61(String str, int i10, z11 z11Var) {
        super(str, (z11) null);
        this.e = i10;
        this.f = z11Var;
    }

    @Override // org.telegram.ui.Components.y61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
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
        z11 z11Var = this.f;
        if (z11Var != null) {
            z11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
