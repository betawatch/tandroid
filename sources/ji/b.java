package ji;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class b extends CharacterStyle implements UpdateAppearance {
    public final /* synthetic */ int a;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                int alpha = textPaint.getAlpha();
                textPaint.setColor(e.s3);
                textPaint.setAlpha((int) (alpha * 1.0f));
                break;
            default:
                int alpha2 = textPaint.getAlpha();
                textPaint.setColor(p.Y1);
                textPaint.setAlpha(alpha2 / 2);
                textPaint.clearShadowLayer();
                break;
        }
    }
}
