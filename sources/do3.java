// default package

import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class do3 extends CharacterStyle implements UpdateAppearance {
    public long a;

    public final float a(long j) {
        if (this.a == 0) {
            return 0.5f;
        }
        return (ho3.b(Math.max(0.0f, Math.min(1.0f, (j - r0) / 300.0f))) * 0.5f) + 0.5f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (a(SystemClock.uptimeMillis()) * textPaint.getAlpha()));
    }
}
