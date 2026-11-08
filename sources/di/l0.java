package di;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l0 extends CharacterStyle {
    public final float a = 0.75f;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.a * textPaint.getAlpha()));
    }
}
