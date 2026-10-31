package i2;

import android.os.Looper;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p1 {
    public final o1 a;
    public final n1 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public p1(n1 n1Var, o1 o1Var, b2.o1 o1Var2, int i10, Looper looper) {
        this.b = n1Var;
        this.a = o1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z10) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        t6.p(!this.f);
        this.f = true;
        s0 s0Var = (s0) this.b;
        if (!s0Var.Z && s0Var.s.getThread().isAlive()) {
            s0Var.n.b(14, this).b();
        } else {
            e2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
