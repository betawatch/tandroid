package org.telegram.ui.Wallet;

import android.os.SystemClock;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
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
