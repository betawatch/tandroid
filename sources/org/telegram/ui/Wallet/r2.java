package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class r2 {
    public final w2 a;
    public final p2 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public nb1 h;

    public r2(w2 w2Var, p2 p2Var) {
        this.a = w2Var;
        this.b = p2Var;
    }

    public final boolean a() {
        return SystemClock.uptimeMillis() - this.c < 700;
    }
}
