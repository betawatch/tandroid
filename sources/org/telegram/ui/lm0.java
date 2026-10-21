package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class lm0 extends ClickableSpan {
    public final /* synthetic */ vm0 a;

    public lm0(vm0 vm0Var) {
        this.a = vm0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        vm0 vm0Var = this.a;
        pf.d.r(vm0Var.getParentActivity(), vm0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
