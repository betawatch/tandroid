package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q21 extends ClickableSpan {
    public final /* synthetic */ URLSpan a;
    public final /* synthetic */ z21 b;

    public q21(z21 z21Var, URLSpan uRLSpan) {
        this.b = z21Var;
        this.a = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        z21 z21Var = this.b;
        Utilities.CallbackReturn callbackReturn = z21Var.J;
        URLSpan uRLSpan = this.a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                z21Var.dismiss();
            }
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = z21Var.I;
            if (o2Var != null) {
                y4.q0(o2Var, uRLSpan.getURL(), false, false);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.a instanceof p41)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k5, false));
        textPaint.setAlpha(min);
    }
}
