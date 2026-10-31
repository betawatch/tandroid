package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g51 extends URLSpan {
    public final yz0 a;
    public boolean b;

    public g51(String str, yz0 yz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = yz0Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).Y0 = true;
        }
        gf.f.o(view.getContext(), Uri.parse(getURL()));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        yz0 yz0Var = this.a;
        if (yz0Var != null) {
            yz0Var.a(textPaint);
            textPaint.setUnderlineText(textPaint.linkColor == color);
        }
    }
}
