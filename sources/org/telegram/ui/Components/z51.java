package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class z51 extends URLSpan {
    public final d11 a;

    public z51(String str, d11 d11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = d11Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        d11 d11Var = this.a;
        if (d11Var != null) {
            d11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
