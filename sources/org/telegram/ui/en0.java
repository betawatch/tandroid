package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class en0 extends ClickableSpan {
    public final /* synthetic */ pn0 a;

    public en0(pn0 pn0Var) {
        this.a = pn0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        pn0 pn0Var = this.a;
        of.f.s(pn0Var.getParentActivity(), pn0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
