package i2;

import android.os.Looper;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
