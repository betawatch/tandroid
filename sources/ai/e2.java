package ai;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
            textPaint.setAlpha((int) (Color.alpha(r2) * org.telegram.ui.Cells.y0.x(max, max, max, 1.0f)));
        }
    }
}
