package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class n41 extends ClickableSpan {
    public final /* synthetic */ URLSpan a;
    public final /* synthetic */ y41 b;

    public n41(y41 y41Var, URLSpan uRLSpan) {
        this.b = y41Var;
        this.a = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        y41 y41Var = this.b;
        Utilities.CallbackReturn callbackReturn = y41Var.T;
        URLSpan uRLSpan = this.a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                y41Var.dismiss();
            }
        } else {
            org.telegram.ui.ActionBar.o2 o2Var = y41Var.S;
            if (o2Var != null) {
                f5.q0(o2Var, uRLSpan.getURL(), false, false);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.a instanceof q61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k5, false));
        textPaint.setAlpha(min);
    }
}
