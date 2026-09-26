package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class w51 extends z51 {
    public static boolean h = true;
    public final int e;
    public final b11 f;

    public w51(String str, int i10, b11 b11Var) {
        super(str, (b11) null);
        this.e = i10;
        this.f = b11Var;
    }

    @Override // org.telegram.ui.Components.z51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
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
        b11 b11Var = this.f;
        if (b11Var != null) {
            b11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
