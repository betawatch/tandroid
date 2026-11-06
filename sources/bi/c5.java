package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c5 extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ k7 b;

    public c5(k7 k7Var, long j3) {
        this.b = k7Var;
        this.a = j3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.U1(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
