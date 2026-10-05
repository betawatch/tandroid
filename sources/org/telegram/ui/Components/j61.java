package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class j61 extends URLSpan {
    public final n11 a;

    public j61(String str, n11 n11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = n11Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        n11 n11Var = this.a;
        if (n11Var != null) {
            n11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
