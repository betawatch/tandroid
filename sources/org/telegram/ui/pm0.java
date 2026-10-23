package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class pm0 extends ClickableSpan {
    public final /* synthetic */ an0 a;

    public pm0(an0 an0Var) {
        this.a = an0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        an0 an0Var = this.a;
        pf.d.r(an0Var.getParentActivity(), an0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
