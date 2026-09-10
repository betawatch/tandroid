package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
