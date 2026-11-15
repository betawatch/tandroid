package ai;

import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.util.Log;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (a(SystemClock.uptimeMillis()) * alpha));
        if (SystemClock.uptimeMillis() - h2.o > 300) {
            h2.o = SystemClock.uptimeMillis();
            Log.d("DICTDBG", "draft draw settle=" + this.a + " alpha " + alpha + " -> " + textPaint.getAlpha() + " color=" + Integer.toHexString(textPaint.getColor()));
        }
    }
}
