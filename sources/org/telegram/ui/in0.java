package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class in0 extends ClickableSpan {
    public final /* synthetic */ un0 a;

    public in0(un0 un0Var) {
        this.a = un0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        un0 un0Var = this.a;
        pf.d.s(un0Var.getParentActivity(), un0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
