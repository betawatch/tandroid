package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n41 extends URLSpan {
    public final dz0 a;

    public n41(String str, dz0 dz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = dz0Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        dz0 dz0Var = this.a;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
