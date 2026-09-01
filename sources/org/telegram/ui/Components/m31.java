package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m31 extends ClickableSpan {
    public final /* synthetic */ URLSpan a;
    public final /* synthetic */ w31 b;

    public m31(w31 w31Var, URLSpan uRLSpan) {
        this.b = w31Var;
        this.a = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        w31 w31Var = this.b;
        Utilities.CallbackReturn callbackReturn = w31Var.K;
        URLSpan uRLSpan = this.a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                w31Var.dismiss();
            }
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = w31Var.J;
            if (p2Var != null) {
                z4.q0(p2Var, uRLSpan.getURL(), false, false);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.a instanceof n51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.k5, false));
        textPaint.setAlpha(min);
    }
}
