package l2;

import a8.la;
import android.os.Looper;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class j1 {
    public final i1 a;
    public final h1 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public j1(h1 h1Var, i1 i1Var, e2.l1 l1Var, int i7, Looper looper) {
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
        la.p(!this.f);
        this.f = true;
        o0 o0Var = (o0) this.b;
        if (!o0Var.a0 && o0Var.s.getThread().isAlive()) {
            o0Var.n.b(14, this).b();
        } else {
            h2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
