package org.telegram.ui.Wallet;

import android.os.SystemClock;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
