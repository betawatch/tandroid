package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j51 extends URLSpan {
    public final s01 a;

    public j51(String str, s01 s01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = s01Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        af.g.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        s01 s01Var = this.a;
        if (s01Var != null) {
            s01Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
