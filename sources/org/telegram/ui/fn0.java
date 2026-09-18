package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fn0 extends ClickableSpan {
    public final /* synthetic */ qn0 a;

    public fn0(qn0 qn0Var) {
        this.a = qn0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        qn0 qn0Var = this.a;
        nf.f.s(qn0Var.getParentActivity(), qn0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
