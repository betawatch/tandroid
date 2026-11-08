package org.telegram.ui.Wallet;

import android.os.SystemClock;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class t2 {
    public final y2 a;
    public final r2 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public g2 h;

    public t2(y2 y2Var, r2 r2Var) {
        this.a = y2Var;
        this.b = r2Var;
    }

    public final boolean a() {
        return SystemClock.uptimeMillis() - this.c < 700;
    }
}
