package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nm0 extends ClickableSpan {
    public final /* synthetic */ xm0 a;

    public nm0(xm0 xm0Var) {
        this.a = xm0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        xm0 xm0Var = this.a;
        we.e.s(xm0Var.getParentActivity(), xm0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
