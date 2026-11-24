// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i37 extends CharacterStyle {
    public final /* synthetic */ byte a;

    public i37(j37 j37Var) {
        this.a = (byte) 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface(gm.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(cmb.w0(null, cmb.m6, false));
                textPaint.setAlpha(alpha);
                break;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(cmb.S2.getColor());
                break;
            case 2:
                textPaint.setColor(cmb.n2.linkColor);
                break;
            case 3:
                break;
            default:
                textPaint.setAlpha(128);
                break;
        }
    }

    public /* synthetic */ i37(byte b) {
        this.a = b;
    }

    private final void a(TextPaint textPaint) {
    }
}
