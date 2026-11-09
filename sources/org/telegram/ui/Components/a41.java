package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a41 extends URLSpan {
    public final vy0 a;

    public a41(String str, vy0 vy0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = vy0Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        vy0 vy0Var = this.a;
        if (vy0Var != null) {
            vy0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
