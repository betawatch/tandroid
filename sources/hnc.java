// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class hnc extends CharacterStyle implements UpdateAppearance {
    public final /* synthetic */ byte a;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                int alpha = textPaint.getAlpha();
                textPaint.setColor(knc.L3);
                textPaint.setAlpha((int) (alpha * 1.0f));
                break;
            default:
                int alpha2 = textPaint.getAlpha();
                textPaint.setColor(vnc.Z1);
                textPaint.setAlpha(alpha2 / 2);
                textPaint.clearShadowLayer();
                break;
        }
    }
}
