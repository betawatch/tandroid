package org.telegram.ui.Wallet;

import android.os.SystemClock;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class u2 {
    public final z2 a;
    public final s2 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public h2 h;

    public u2(z2 z2Var, s2 s2Var) {
        this.a = z2Var;
        this.b = s2Var;
    }

    public final boolean a() {
        return SystemClock.uptimeMillis() - this.c < 700;
    }
}
