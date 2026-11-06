package l2;

import a8.ia;
import android.os.Looper;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class n1 {
    public final m1 a;
    public final l1 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public n1(l1 l1Var, m1 m1Var, e2.l1 l1Var2, int i7, Looper looper) {
        this.b = l1Var;
        this.a = m1Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z9) {
        synchronized (this) {
            notifyAll();
        }
    }

    public final void b() {
        ia.p(!this.f);
        this.f = true;
        r0 r0Var = (r0) this.b;
        if (!r0Var.Z && r0Var.s.getThread().isAlive()) {
            r0Var.n.b(14, this).b();
        } else {
            h2.a.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
