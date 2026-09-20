package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class d61 extends a61 {
    public final int e;
    public final c11 f;

    public d61(String str, int i10, c11 c11Var) {
        super(str, (c11) null);
        this.e = i10;
        this.f = c11Var;
    }

    @Override // org.telegram.ui.Components.a61, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i10 = this.e;
        if (i10 == 3) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        } else if (i10 == 2) {
            textPaint.setColor(-1);
        } else if (i10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        }
        c11 c11Var = this.f;
        if (c11Var != null) {
            c11Var.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
