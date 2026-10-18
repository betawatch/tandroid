package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class h61 extends URLSpan {
    public final l11 a;

    public h61(String str, l11 l11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = l11Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        pf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        l11 l11Var = this.a;
        if (l11Var != null) {
            l11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
