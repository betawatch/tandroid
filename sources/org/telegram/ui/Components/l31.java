package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l31 extends ClickableSpan {
    public final /* synthetic */ URLSpan a;
    public final /* synthetic */ v31 b;

    public l31(v31 v31Var, URLSpan uRLSpan) {
        this.b = v31Var;
        this.a = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        v31 v31Var = this.b;
        Utilities.CallbackReturn callbackReturn = v31Var.K;
        URLSpan uRLSpan = this.a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                v31Var.dismiss();
            }
        } else {
            org.telegram.ui.ActionBar.p2 p2Var = v31Var.J;
            if (p2Var != null) {
                z4.q0(p2Var, uRLSpan.getURL(), false, false);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.a instanceof l51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.k5, false));
        textPaint.setAlpha(min);
    }
}
