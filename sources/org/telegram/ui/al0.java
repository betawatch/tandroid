package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class al0 extends ClickableSpan {
    public final /* synthetic */ ll0 a;

    public al0(ll0 ll0Var) {
        this.a = ll0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ll0 ll0Var = this.a;
        gf.f.r(ll0Var.getParentActivity(), ll0Var.D.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
    }
}
