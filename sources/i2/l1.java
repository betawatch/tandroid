package i2;

import android.os.Looper;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        q0 q0Var = (q0) this.b;
        if (!q0Var.Z && q0Var.s.getThread().isAlive()) {
            q0Var.n.b(14, this).b();
        } else {
            e2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
