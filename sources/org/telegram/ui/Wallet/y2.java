package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.jw0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class y2 {
    public final d3 a;
    public final w2 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public jw0 h;

    public y2(d3 d3Var, w2 w2Var) {
        this.a = d3Var;
        this.b = w2Var;
    }

    public final boolean a() {
        return SystemClock.uptimeMillis() - this.c < 700;
    }
}
