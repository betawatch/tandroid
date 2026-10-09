package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cn0 extends ClickableSpan {
    public final /* synthetic */ nn0 a;

    public cn0(nn0 nn0Var) {
        this.a = nn0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        nn0 nn0Var = this.a;
        of.f.s(nn0Var.getParentActivity(), nn0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
