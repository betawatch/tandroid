package i2;

import android.os.Looper;
import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class l1 {
    public final k1 a;
    public final j1 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public l1(j1 j1Var, k1 k1Var, b2.o1 o1Var, int i10, Looper looper) {
        this.b = j1Var;
        this.a = k1Var;
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
        p0 p0Var = (p0) this.b;
        if (!p0Var.Z && p0Var.s.getThread().isAlive()) {
            p0Var.n.b(14, this).b();
        } else {
            e2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
