package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h41 extends URLSpan {
    public final wy0 a;
    public boolean b;

    public h41(String str, wy0 wy0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = wy0Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        wy0 wy0Var = this.a;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
            textPaint.setUnderlineText(textPaint.linkColor == color);
        }
    }
}
