package lh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class n3 extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ g5 b;

    public n3(g5 g5Var, long j10) {
        this.b = g5Var;
        this.a = j10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.X1(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
