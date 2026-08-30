package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j51 extends m51 {
    public static boolean h = true;
    public final int e;
    public final s01 f;

    public j51(String str, int i10, s01 s01Var) {
        super(str, (s01) null);
        this.e = i10;
        this.f = s01Var;
    }

    @Override // org.telegram.ui.Components.m51, android.text.style.ClickableSpan, android.text.style.CharacterStyle
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
        s01 s01Var = this.f;
        if (s01Var != null) {
            s01Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
