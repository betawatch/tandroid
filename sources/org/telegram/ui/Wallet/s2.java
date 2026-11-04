package org.telegram.ui.Wallet;

import android.os.SystemClock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s2 {
    public final x2 a;
    public final q2 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public f2 h;

    public s2(x2 x2Var, q2 q2Var) {
        this.a = x2Var;
        this.b = q2Var;
    }

    public final boolean a() {
        return SystemClock.uptimeMillis() - this.c < 700;
    }
}
