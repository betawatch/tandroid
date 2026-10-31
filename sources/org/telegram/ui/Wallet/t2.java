package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.Components.qq;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t2 {
    public final y2 a;
    public final r2 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public qq h;

    public t2(y2 y2Var, r2 r2Var) {
        this.a = y2Var;
        this.b = r2Var;
    }

    public final boolean a() {
        return SystemClock.uptimeMillis() - this.c < 700;
    }
}
