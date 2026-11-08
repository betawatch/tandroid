package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class z31 extends URLSpan {
    public final uy0 a;

    public z31(String str, uy0 uy0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = uy0Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        uy0 uy0Var = this.a;
        if (uy0Var != null) {
            uy0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
