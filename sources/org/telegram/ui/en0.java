package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class en0 extends ClickableSpan {
    public final /* synthetic */ pn0 a;

    public en0(pn0 pn0Var) {
        this.a = pn0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        pn0 pn0Var = this.a;
        nf.f.s(pn0Var.getParentActivity(), pn0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
