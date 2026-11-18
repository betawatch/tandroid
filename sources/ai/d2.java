package ai;

import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d2 extends CharacterStyle implements UpdateAppearance {
    public long a;

    public final float a(long j3) {
        if (this.a == 0) {
            return 0.5f;
        }
        return (h2.b(Math.max(0.0f, Math.min(1.0f, (j3 - r0) / 300.0f))) * 0.5f) + 0.5f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (a(SystemClock.uptimeMillis()) * textPaint.getAlpha()));
    }
}
