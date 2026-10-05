package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class l41 extends ClickableSpan {
    public final /* synthetic */ URLSpan a;
    public final /* synthetic */ u41 b;

    public l41(u41 u41Var, URLSpan uRLSpan) {
        this.b = u41Var;
        this.a = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        u41 u41Var = this.b;
        Utilities.CallbackReturn callbackReturn = u41Var.N;
        URLSpan uRLSpan = this.a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                u41Var.dismiss();
            }
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = u41Var.M;
            if (n2Var != null) {
                e5.q0(n2Var, uRLSpan.getURL(), false, false);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.a instanceof l61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.k5, false));
        textPaint.setAlpha(min);
    }
}
