package org.telegram.messenger;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public enum t2 {
    e(new long[]{7}, new int[]{65}, new long[]{60}),
    f(new long[]{7}, new int[]{zs.b2}, new long[]{70}),
    h(new long[]{7}, new int[]{zs.e4}, new long[]{80}),
    n(new long[]{3}, new int[]{zs.C3}, new long[]{50}),
    r(new long[]{10}, new int[]{zs.F2}, new long[]{55}),
    s(new long[]{14, 48, 14, 48, 14, 48, 20}, new int[]{zs.e3, 0, zs.e3, 0, zs.e4, 0, zs.b2}, new long[]{40, 60, 40, 60, 65, 60, 40}),
    w(new long[]{14, 65, 14}, new int[]{zs.F2, 0, zs.e4}, new long[]{50, 60, 65}),
    x(new long[]{14, 64, 14}, new int[]{zs.C3, 0, zs.F2}, new long[]{65, 60, 40}),
    y(new long[]{1}, new int[]{65}, new long[]{30}),
    D(new long[]{30, 10, 150, 10}, new int[]{0, 100, 0, 100}, new long[]{40, 60, 40, 60, 65, 60, 40});

    public final long[] a;
    public final int[] b;
    public final long[] c;
    public Object d;

    t2(long[] jArr, int[] iArr, long[] jArr2) {
        this.a = jArr;
        this.b = iArr;
        this.c = jArr2;
    }

    public final void a() {
        int i10 = Build.VERSION.SDK_INT;
        long[] jArr = this.c;
        if (i10 < 26) {
            i0.p1().vibrate(jArr, -1);
            return;
        }
        Vibrator p12 = i0.p1();
        if (this.d == null) {
            if (i0.p1().hasAmplitudeControl()) {
                this.d = VibrationEffect.createWaveform(this.a, this.b, -1);
            } else {
                this.d = VibrationEffect.createWaveform(jArr, -1);
            }
        }
        p12.vibrate((VibrationEffect) this.d);
    }
}
