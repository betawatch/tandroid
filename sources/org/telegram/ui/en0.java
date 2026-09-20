package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
