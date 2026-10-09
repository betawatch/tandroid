package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class q61 extends t61 {
    public static boolean h = true;
    public final int e;
    public final t11 f;

    public q61(String str, int i10, t11 t11Var) {
        super(str, (t11) null);
        this.e = i10;
        this.f = t11Var;
    }

    @Override // org.telegram.ui.Components.t61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, h ? org.telegram.ui.ActionBar.i6.hc : org.telegram.ui.ActionBar.i6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, h ? org.telegram.ui.ActionBar.i6.gc : org.telegram.ui.ActionBar.i6.ec, false));
        }
        t11 t11Var = this.f;
        if (t11Var != null) {
            t11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
