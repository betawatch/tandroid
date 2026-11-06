package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class s31 extends v31 {
    public static boolean h = true;
    public final int e;
    public final ty0 f;

    public s31(String str, int i7, ty0 ty0Var) {
        super(str, (ty0) null);
        this.e = i7;
        this.f = ty0Var;
    }

    @Override // org.telegram.ui.Components.v31, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i7 = this.e;
        if (i7 == 2) {
            textPaint.setColor(-1);
        } else if (i7 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, h ? org.telegram.ui.ActionBar.k6.Vc : org.telegram.ui.ActionBar.k6.Tc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, h ? org.telegram.ui.ActionBar.k6.Uc : org.telegram.ui.ActionBar.k6.Sc, false));
        }
        ty0 ty0Var = this.f;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
