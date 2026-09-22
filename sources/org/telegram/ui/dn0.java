package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class dn0 extends ClickableSpan {
    public final /* synthetic */ on0 a;

    public dn0(on0 on0Var) {
        this.a = on0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        on0 on0Var = this.a;
        nf.f.s(on0Var.getParentActivity(), on0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
