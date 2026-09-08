package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class j51 extends URLSpan {
    public final n01 a;

    public j51(String str, n01 n01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = n01Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        of.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        n01 n01Var = this.a;
        if (n01Var != null) {
            n01Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
