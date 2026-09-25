package i2;

import android.os.Looper;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class k1 {
    public final j1 a;
    public final i1 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public k1(i1 i1Var, j1 j1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.b = i1Var;
        this.a = j1Var;
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
        p0 p0Var = (p0) this.b;
        if (!p0Var.X && p0Var.s.getThread().isAlive()) {
            p0Var.n.a(14, this).b();
        } else {
            e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
