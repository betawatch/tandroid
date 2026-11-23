package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.ao0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class z2 {
    public final e3 a;
    public final x2 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public ao0 h;

    public z2(e3 e3Var, x2 x2Var) {
        this.a = e3Var;
        this.b = x2Var;
    }

    public final boolean a() {
        return SystemClock.uptimeMillis() - this.c < 700;
    }
}
