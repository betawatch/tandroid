package di;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g4 extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ f6 b;

    public g4(f6 f6Var, long j3) {
        this.b = f6Var;
        this.a = j3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.h2(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
