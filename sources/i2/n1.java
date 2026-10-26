package i2;

import a8.yb;
import android.os.Looper;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        yb.p(!this.f);
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
