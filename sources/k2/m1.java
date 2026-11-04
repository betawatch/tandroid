package k2;

import android.os.Looper;
import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m1 {
    public final l1 a;
    public final k1 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public m1(k1 k1Var, l1 l1Var, d2.n1 n1Var, int i3, Looper looper) {
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
        zb.p(!this.f);
        this.f = true;
        r0 r0Var = (r0) this.b;
        if (!r0Var.a0 && r0Var.s.getThread().isAlive()) {
            r0Var.n.b(14, this).b();
        } else {
            g2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
