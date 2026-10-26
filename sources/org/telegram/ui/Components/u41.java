package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u41 extends ClickableSpan {
    public final /* synthetic */ URLSpan a;
    public final /* synthetic */ f51 b;

    public u41(f51 f51Var, URLSpan uRLSpan) {
        this.b = f51Var;
        this.a = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        f51 f51Var = this.b;
        Utilities.CallbackReturn callbackReturn = f51Var.T;
        URLSpan uRLSpan = this.a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                f51Var.dismiss();
            }
        } else {
            org.telegram.ui.ActionBar.r2 r2Var = f51Var.S;
            if (r2Var != null) {
                g5.p0(r2Var, uRLSpan.getURL(), false, false);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.a instanceof x61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.k5, false));
        textPaint.setAlpha(min);
    }
}
