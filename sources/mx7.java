// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mx7 extends ClickableSpan {
    public final /* synthetic */ vx7 a;

    public mx7(vx7 vx7Var) {
        this.a = vx7Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        vx7 vx7Var = this.a;
        d01.t(vx7Var.getParentActivity(), vx7Var.E.privacy_policy_url);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(true);
        textPaint.setTypeface(gl.o());
    }
}
