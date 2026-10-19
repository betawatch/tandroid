package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class i61 extends URLSpan {
    public final m11 a;

    public i61(String str, m11 m11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = m11Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        pf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        m11 m11Var = this.a;
        if (m11Var != null) {
            m11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
