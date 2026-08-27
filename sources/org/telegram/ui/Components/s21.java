package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s21 extends ClickableSpan {
    public final /* synthetic */ URLSpan a;
    public final /* synthetic */ b31 b;

    public s21(b31 b31Var, URLSpan uRLSpan) {
        this.b = b31Var;
        this.a = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        b31 b31Var = this.b;
        Utilities.CallbackReturn callbackReturn = b31Var.J;
        URLSpan uRLSpan = this.a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                b31Var.dismiss();
            }
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = b31Var.I;
            if (n2Var != null) {
                y4.q0(n2Var, uRLSpan.getURL(), false, false);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.a instanceof r41)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k5, false));
        textPaint.setAlpha(min);
    }
}
