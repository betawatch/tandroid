package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.Components.qq;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u2 {
    public final z2 a;
    public final s2 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public qq h;

    public u2(z2 z2Var, s2 s2Var) {
        this.a = z2Var;
        this.b = s2Var;
    }

    public final boolean a() {
        return SystemClock.uptimeMillis() - this.c < 700;
    }
}
