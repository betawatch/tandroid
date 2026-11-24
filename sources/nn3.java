// default package

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nn3 extends CharacterStyle implements UpdateAppearance {
    public final long a;
    public long b;
    public final int c;
    public final int d;
    public boolean e;

    public nn3(long j, int i, int i2) {
        this.a = j;
        this.c = i;
        this.d = i2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        long uptimeMillis = SystemClock.uptimeMillis();
        textPaint.setColor(bm2.f(qn3.b(Math.max(0.0f, Math.min(1.0f, (uptimeMillis - this.a) / 750.0f))), this.c, this.d));
        if (this.b > 0) {
            float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (uptimeMillis - r5) / 220.0f));
            textPaint.setAlpha((int) (Color.alpha(r2) * oo1.v(max, max, max, 1.0f)));
        }
    }
}
