package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oj0 extends ClickableSpan {
    public final /* synthetic */ yj0 a;

    public oj0(yj0 yj0Var) {
        this.a = yj0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        yj0 yj0Var = this.a;
        sf.c.t(yj0Var.getParentActivity(), yj0Var.E.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
    }
}
