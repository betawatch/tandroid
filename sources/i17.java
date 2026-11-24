// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class i17 extends CharacterStyle {
    public final /* synthetic */ byte a;

    public i17(j17 j17Var) {
        this.a = (byte) 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface(gl.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(bkb.w0(null, bkb.m6, false));
                textPaint.setAlpha(alpha);
                break;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(bkb.S2.getColor());
                break;
            case 2:
                textPaint.setColor(bkb.n2.linkColor);
                break;
            case 3:
                break;
            default:
                textPaint.setAlpha(128);
                break;
        }
    }

    public /* synthetic */ i17(byte b) {
        this.a = b;
    }

    private final void a(TextPaint textPaint) {
    }
}
