package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d4 extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ c6 b;

    public d4(c6 c6Var, long j3) {
        this.b = c6Var;
        this.a = j3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.V1(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
