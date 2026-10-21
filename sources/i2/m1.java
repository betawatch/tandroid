package i2;

import android.os.Looper;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class m1 {
    public final l1 a;
    public final k1 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public m1(k1 k1Var, l1 l1Var, b2.o1 o1Var, int i10, Looper looper) {
        this.b = k1Var;
        this.a = l1Var;
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
