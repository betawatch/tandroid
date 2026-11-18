package ai;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class e2 extends CharacterStyle implements UpdateAppearance {
    public final long a;
    public long b;
    public final int c;
    public final int d;
    public boolean e;

    public e2(long j3, int i7, int i10) {
        this.a = j3;
        this.c = i7;
        this.d = i10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        long uptimeMillis = SystemClock.uptimeMillis();
        textPaint.setColor(i0.a.f(h2.b(Math.max(0.0f, Math.min(1.0f, (uptimeMillis - this.a) / 750.0f))), this.c, this.d));
        if (this.b > 0) {
            float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (uptimeMillis - r5) / 220.0f));
            textPaint.setAlpha((int) (Color.alpha(r2) * org.telegram.ui.Cells.c0.z(max, max, max, 1.0f)));
        }
    }
}
