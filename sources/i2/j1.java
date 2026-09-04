package i2;

import android.os.Looper;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j1 {
    public final i1 a;
    public final h1 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public j1(h1 h1Var, i1 i1Var, b2.k1 k1Var, int i10, Looper looper) {
        this.b = h1Var;
        this.a = i1Var;
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
        o0 o0Var = (o0) this.b;
        if (!o0Var.X && o0Var.s.getThread().isAlive()) {
            o0Var.n.a(14, this).b();
        } else {
            e2.a.n("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
