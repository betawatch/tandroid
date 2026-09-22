package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class z51 extends c61 {
    public static boolean h = true;
    public final int e;
    public final e11 f;

    public z51(String str, int i10, e11 e11Var) {
        super(str, (e11) null);
        this.e = i10;
        this.f = e11Var;
    }

    @Override // org.telegram.ui.Components.c61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
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
        e11 e11Var = this.f;
        if (e11Var != null) {
            e11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
