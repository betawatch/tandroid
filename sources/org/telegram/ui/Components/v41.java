package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v41 extends ClickableSpan {
    public final /* synthetic */ URLSpan a;
    public final /* synthetic */ g51 b;

    public v41(g51 g51Var, URLSpan uRLSpan) {
        this.b = g51Var;
        this.a = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        g51 g51Var = this.b;
        Utilities.CallbackReturn callbackReturn = g51Var.T;
        URLSpan uRLSpan = this.a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                g51Var.dismiss();
            }
        } else {
            org.telegram.ui.ActionBar.r2 r2Var = g51Var.S;
            if (r2Var != null) {
                g5.p0(r2Var, uRLSpan.getURL(), false, false);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.a instanceof y61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.k5, false));
        textPaint.setAlpha(min);
    }
}
