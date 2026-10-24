package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class o61 extends URLSpan {
    public final q11 a;

    public o61(String str, q11 q11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = q11Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        pf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        q11 q11Var = this.a;
        if (q11Var != null) {
            q11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
