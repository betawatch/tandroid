package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l51 extends URLSpan {
    public final p01 a;

    public l51(String str, p01 p01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = p01Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        p01 p01Var = this.a;
        if (p01Var != null) {
            p01Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
