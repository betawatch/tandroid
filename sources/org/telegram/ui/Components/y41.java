package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y41 extends URLSpan {
    public final h01 a;

    public y41(String str, h01 h01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = h01Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        ye.d.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        h01 h01Var = this.a;
        if (h01Var != null) {
            h01Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
