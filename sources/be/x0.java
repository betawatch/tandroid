package be;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class x0 extends a0 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public jd.e e;

    public final void f(boolean z10) {
        long j10 = this.c - (z10 ? 4294967296L : 1L);
        this.c = j10;
        if (j10 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread g();

    public final void h(boolean z10) {
        this.c = (z10 ? 4294967296L : 1L) + this.c;
        if (z10) {
            return;
        }
        this.d = true;
    }

    public abstract long i();

    public final boolean j() {
        jd.e eVar = this.e;
        if (eVar == null) {
            return false;
        }
        m0 m0Var = (m0) (eVar.isEmpty() ? null : eVar.removeFirst());
        if (m0Var == null) {
            return false;
        }
        m0Var.run();
        return true;
    }

    public void k(long j10, u0 u0Var) {
        g0.s.o(j10, u0Var);
    }

    public abstract void shutdown();
}
