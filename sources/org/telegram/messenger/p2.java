package org.telegram.messenger;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public enum p2 {
    e(new long[]{7}, new int[]{65}, new long[]{60}),
    f(new long[]{7}, new int[]{hs.b2}, new long[]{70}),
    h(new long[]{7}, new int[]{hs.e4}, new long[]{80}),
    n(new long[]{3}, new int[]{hs.C3}, new long[]{50}),
    r(new long[]{10}, new int[]{hs.F2}, new long[]{55}),
    s(new long[]{14, 48, 14, 48, 14, 48, 20}, new int[]{hs.e3, 0, hs.e3, 0, hs.e4, 0, hs.b2}, new long[]{40, 60, 40, 60, 65, 60, 40}),
    w(new long[]{14, 65, 14}, new int[]{hs.F2, 0, hs.e4}, new long[]{50, 60, 65}),
    x(new long[]{14, 64, 14}, new int[]{hs.C3, 0, hs.F2}, new long[]{65, 60, 40}),
    y(new long[]{1}, new int[]{65}, new long[]{30}),
    E(new long[]{30, 10, 150, 10}, new int[]{0, 100, 0, 100}, new long[]{40, 60, 40, 60, 65, 60, 40});

    public final long[] a;
    public final int[] b;
    public final long[] c;
    public Object d;

    p2(long[] jArr, int[] iArr, long[] jArr2) {
        this.a = jArr;
        this.b = iArr;
        this.c = jArr2;
    }

    public final void a() {
        int i3 = Build.VERSION.SDK_INT;
        long[] jArr = this.c;
        if (i3 < 26) {
            g0.p1().vibrate(jArr, -1);
            return;
        }
        Vibrator p12 = g0.p1();
        if (this.d == null) {
            if (g0.p1().hasAmplitudeControl()) {
                this.d = VibrationEffect.createWaveform(this.a, this.b, -1);
            } else {
                this.d = VibrationEffect.createWaveform(jArr, -1);
            }
        }
        p12.vibrate((VibrationEffect) this.d);
    }
}
