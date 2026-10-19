package ai;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class h5 extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ l7 b;

    public h5(l7 l7Var, long j10) {
        this.b = l7Var;
        this.a = j10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.v2(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
