package org.telegram.ui.Wallet;

import android.os.SystemClock;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
