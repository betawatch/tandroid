package ji;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
