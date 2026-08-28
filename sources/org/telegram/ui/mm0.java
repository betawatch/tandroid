package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mm0 extends ClickableSpan {
    public final /* synthetic */ wm0 a;

    public mm0(wm0 wm0Var) {
        this.a = wm0Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        wm0 wm0Var = this.a;
        ve.e.s(wm0Var.getParentActivity(), wm0Var.y.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(AndroidUtilities.bold());
    }
}
