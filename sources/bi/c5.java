package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c5 extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ h7 b;

    public c5(h7 h7Var, long j10) {
        this.b = h7Var;
        this.a = j10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.u2(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
