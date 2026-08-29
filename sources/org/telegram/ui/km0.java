package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class km0 extends ClickableSpan {
    public final /* synthetic */ vm0 a;

    public km0(vm0 vm0Var) {
        this.a = vm0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        vm0 vm0Var = this.a;
        ye.d.s(vm0Var.getParentActivity(), vm0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
