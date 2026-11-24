// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h6c extends g6c {
    public h6c(String str) {
        super(str.replace((char) 8238, ' '), (wkb) null);
    }

    @Override // g6c, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(gm.o());
        textPaint.setUnderlineText(false);
    }
}
