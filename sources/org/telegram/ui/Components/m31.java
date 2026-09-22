package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m31 extends ClickableSpan {
    public final /* synthetic */ URLSpan a;
    public final /* synthetic */ v31 b;

    public m31(v31 v31Var, URLSpan uRLSpan) {
        this.b = v31Var;
        this.a = uRLSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        v31 v31Var = this.b;
        Utilities.CallbackReturn callbackReturn = v31Var.N;
        URLSpan uRLSpan = this.a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                v31Var.dismiss();
            }
        } else {
            org.telegram.ui.ActionBar.n2 n2Var = v31Var.M;
            if (n2Var != null) {
                c5.q0(n2Var, uRLSpan.getURL(), false, false);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.a instanceof m51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.k5, false));
        textPaint.setAlpha(min);
    }
}
