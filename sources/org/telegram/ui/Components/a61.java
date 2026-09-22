package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class a61 extends URLSpan {
    public final e11 a;

    public a61(String str, e11 e11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = e11Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        e11 e11Var = this.a;
        if (e11Var != null) {
            e11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
