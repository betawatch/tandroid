package ai;

import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class g2 extends CharacterStyle implements UpdateAppearance {
    public long a;

    public final float a(long j3) {
        if (this.a == 0) {
            return 0.5f;
        }
        return (k2.b(Math.max(0.0f, Math.min(1.0f, (j3 - r0) / 300.0f))) * 0.5f) + 0.5f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (a(SystemClock.uptimeMillis()) * textPaint.getAlpha()));
    }
}
