package org.telegram.messenger;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public enum p2 {
    e(new long[]{7}, new int[]{65}, new long[]{60}),
    f(new long[]{7}, new int[]{qs.b2}, new long[]{70}),
    h(new long[]{7}, new int[]{qs.e4}, new long[]{80}),
    n(new long[]{3}, new int[]{qs.C3}, new long[]{50}),
    r(new long[]{10}, new int[]{qs.F2}, new long[]{55}),
    s(new long[]{14, 48, 14, 48, 14, 48, 20}, new int[]{qs.e3, 0, qs.e3, 0, qs.e4, 0, qs.b2}, new long[]{40, 60, 40, 60, 65, 60, 40}),
    w(new long[]{14, 65, 14}, new int[]{qs.F2, 0, qs.e4}, new long[]{50, 60, 65}),
    x(new long[]{14, 64, 14}, new int[]{qs.C3, 0, qs.F2}, new long[]{65, 60, 40}),
    y(new long[]{1}, new int[]{65}, new long[]{30}),
    D(new long[]{30, 10, 150, 10}, new int[]{0, 100, 0, 100}, new long[]{40, 60, 40, 60, 65, 60, 40});

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
        int i7 = Build.VERSION.SDK_INT;
        long[] jArr = this.c;
        if (i7 < 26) {
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
