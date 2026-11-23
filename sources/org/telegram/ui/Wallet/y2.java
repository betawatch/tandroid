package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.jw0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
