package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class y51 extends URLSpan {
    public final c11 a;

    public y51(String str, c11 c11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = c11Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        c11 c11Var = this.a;
        if (c11Var != null) {
            c11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
