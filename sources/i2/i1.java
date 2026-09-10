package i2;

import android.os.Looper;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class i1 {
    public final h1 a;
    public final g1 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public i1(g1 g1Var, h1 h1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.b = g1Var;
        this.a = h1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        e2.d.g(!this.f);
        this.f = true;
        n0 n0Var = (n0) this.b;
        if (!n0Var.X && n0Var.s.getThread().isAlive()) {
            n0Var.n.a(14, this).b();
        } else {
            e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
