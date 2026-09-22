package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class o51 extends URLSpan {
    public final o01 a;
    public boolean b;

    public o51(String str, o01 o01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = o01Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        o01 o01Var = this.a;
        if (o01Var != null) {
            o01Var.a(textPaint);
            textPaint.setUnderlineText(textPaint.linkColor == color);
        }
    }
}
