package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
