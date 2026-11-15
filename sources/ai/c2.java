package ai;

import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.util.Log;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c2 extends CharacterStyle implements UpdateAppearance {
    public long a;

    public final float a(long j3) {
        if (this.a == 0) {
            return 0.5f;
        }
        return (g2.b(Math.max(0.0f, Math.min(1.0f, (j3 - r0) / 300.0f))) * 0.5f) + 0.5f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha((int) (a(SystemClock.uptimeMillis()) * alpha));
        if (SystemClock.uptimeMillis() - g2.o > 300) {
            g2.o = SystemClock.uptimeMillis();
            Log.d("DICTDBG", "draft draw settle=" + this.a + " alpha " + alpha + " -> " + textPaint.getAlpha() + " color=" + Integer.toHexString(textPaint.getColor()));
        }
    }
}
