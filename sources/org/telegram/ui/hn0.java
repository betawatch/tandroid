package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hn0 extends ClickableSpan {
    public final /* synthetic */ sn0 a;

    public hn0(sn0 sn0Var) {
        this.a = sn0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        sn0 sn0Var = this.a;
        pf.d.r(sn0Var.getParentActivity(), sn0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
