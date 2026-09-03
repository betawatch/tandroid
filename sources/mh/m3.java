package mh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class m3 extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ g5 b;

    public m3(g5 g5Var, long j10) {
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
