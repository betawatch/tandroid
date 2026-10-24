package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class n61 extends q61 {
    public static boolean h = true;
    public final int e;
    public final q11 f;

    public n61(String str, int i10, q11 q11Var) {
        super(str, (q11) null);
        this.e = i10;
        this.f = q11Var;
    }

    @Override // org.telegram.ui.Components.q61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, h ? org.telegram.ui.ActionBar.k6.hc : org.telegram.ui.ActionBar.k6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, h ? org.telegram.ui.ActionBar.k6.gc : org.telegram.ui.ActionBar.k6.ec, false));
        }
        q11 q11Var = this.f;
        if (q11Var != null) {
            q11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
