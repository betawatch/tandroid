package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class nm0 extends ClickableSpan {
    public final /* synthetic */ xm0 a;

    public nm0(xm0 xm0Var) {
        this.a = xm0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        xm0 xm0Var = this.a;
        pf.d.r(xm0Var.getParentActivity(), xm0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
