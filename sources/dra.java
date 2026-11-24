// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dra extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ wsa b;

    public dra(wsa wsaVar, long j) {
        this.b = wsaVar;
        this.a = j;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.Y1(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
