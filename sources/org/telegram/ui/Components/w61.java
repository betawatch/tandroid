package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w61 extends URLSpan {
    public final z11 a;

    public w61(String str, z11 z11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = z11Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        qf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        z11 z11Var = this.a;
        if (z11Var != null) {
            z11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
