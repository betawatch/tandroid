package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.jw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
