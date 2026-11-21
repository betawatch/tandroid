package ji;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class b extends CharacterStyle implements UpdateAppearance {
    public final /* synthetic */ int a;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                int alpha = textPaint.getAlpha();
                textPaint.setColor(e.u3);
                textPaint.setAlpha((int) (alpha * 1.0f));
                break;
            default:
                int alpha2 = textPaint.getAlpha();
                textPaint.setColor(r.Y1);
                textPaint.setAlpha(alpha2 / 2);
                textPaint.clearShadowLayer();
                break;
        }
    }
}
