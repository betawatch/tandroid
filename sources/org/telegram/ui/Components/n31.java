package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class n31 extends ClickableSpan {
    public final /* synthetic */ URLSpan a;
    public final /* synthetic */ w31 b;

    public n31(w31 w31Var, URLSpan uRLSpan) {
        this.b = w31Var;
        this.a = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        w31 w31Var = this.b;
        Utilities.CallbackReturn callbackReturn = w31Var.N;
        URLSpan uRLSpan = this.a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                w31Var.dismiss();
            }
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = w31Var.M;
            if (o2Var != null) {
                c5.q0(o2Var, uRLSpan.getURL(), false, false);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.a instanceof n51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k5, false));
        textPaint.setAlpha(min);
    }
}
