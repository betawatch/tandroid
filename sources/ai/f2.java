package ai;

import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class f2 extends CharacterStyle implements UpdateAppearance {
    public long a;

    public final float a(long j3) {
        if (this.a == 0) {
            return 0.5f;
        }
        return (j2.b(Math.max(0.0f, Math.min(1.0f, (j3 - r0) / 300.0f))) * 0.5f) + 0.5f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (a(SystemClock.uptimeMillis()) * textPaint.getAlpha()));
    }
}
