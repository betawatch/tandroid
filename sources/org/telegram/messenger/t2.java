package org.telegram.messenger;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public enum t2 {
    e(new long[]{7}, new int[]{65}, new long[]{60}),
    f(new long[]{7}, new int[]{at.b2}, new long[]{70}),
    h(new long[]{7}, new int[]{at.e4}, new long[]{80}),
    n(new long[]{3}, new int[]{at.C3}, new long[]{50}),
    r(new long[]{10}, new int[]{at.F2}, new long[]{55}),
    s(new long[]{14, 48, 14, 48, 14, 48, 20}, new int[]{at.e3, 0, at.e3, 0, at.e4, 0, at.b2}, new long[]{40, 60, 40, 60, 65, 60, 40}),
    w(new long[]{14, 65, 14}, new int[]{at.F2, 0, at.e4}, new long[]{50, 60, 65}),
    x(new long[]{14, 64, 14}, new int[]{at.C3, 0, at.F2}, new long[]{65, 60, 40}),
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
