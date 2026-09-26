package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class z31 extends ClickableSpan {
    public final /* synthetic */ URLSpan a;
    public final /* synthetic */ i41 b;

    public z31(i41 i41Var, URLSpan uRLSpan) {
        this.b = i41Var;
        this.a = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        i41 i41Var = this.b;
        Utilities.CallbackReturn callbackReturn = i41Var.N;
        URLSpan uRLSpan = this.a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                i41Var.dismiss();
            }
        } else {
            org.telegram.ui.ActionBar.m2 m2Var = i41Var.M;
            if (m2Var != null) {
                e5.q0(m2Var, uRLSpan.getURL(), false, false);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.a instanceof z51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.k5, false));
        textPaint.setAlpha(min);
    }
}
