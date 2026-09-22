package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class k51 extends URLSpan {
    public final o01 a;

    public k51(String str, o01 o01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = o01Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        o01 o01Var = this.a;
        if (o01Var != null) {
            o01Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
