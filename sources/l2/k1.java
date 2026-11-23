package l2;

import a8.ma;
import android.os.Looper;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class k1 {
    public final j1 a;
    public final i1 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public k1(i1 i1Var, j1 j1Var, e2.l1 l1Var, int i7, Looper looper) {
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
        ma.p(!this.f);
        this.f = true;
        p0 p0Var = (p0) this.b;
        if (!p0Var.a0 && p0Var.s.getThread().isAlive()) {
            p0Var.n.b(14, this).b();
        } else {
            h2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
