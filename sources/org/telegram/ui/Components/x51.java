package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class x51 extends URLSpan {
    public final b11 a;

    public x51(String str, b11 b11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = b11Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        b11 b11Var = this.a;
        if (b11Var != null) {
            b11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
