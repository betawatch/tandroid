package jd;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class w0 extends a0 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public rc.e e;

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
        rc.e eVar = this.e;
        if (eVar == null) {
            return false;
        }
        l0 l0Var = (l0) (eVar.isEmpty() ? null : eVar.removeFirst());
        if (l0Var == null) {
            return false;
        }
        l0Var.run();
        return true;
    }

    public void k(long j10, t0 t0Var) {
        f0.s.o(j10, t0Var);
    }

    public abstract void shutdown();
}
