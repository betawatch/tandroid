package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
