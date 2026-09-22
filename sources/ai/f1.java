package ai;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class f1 extends CharacterStyle {
    public final float a = 0.75f;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.a * textPaint.getAlpha()));
    }
}
