package i2;

import android.os.Looper;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class n1 {
    public final m1 a;
    public final l1 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public n1(l1 l1Var, m1 m1Var, b2.p1 p1Var, int i10, Looper looper) {
        this.b = l1Var;
        this.a = m1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        u6.p(!this.f);
        this.f = true;
        r0 r0Var = (r0) this.b;
        if (!r0Var.Z && r0Var.s.getThread().isAlive()) {
            r0Var.n.b(14, this).b();
        } else {
            e2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
