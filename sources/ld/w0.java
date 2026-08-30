package ld;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class w0 extends a0 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public tc.e e;

    public final void f(boolean z4) {
        long j10 = this.c - (z4 ? 4294967296L : 1L);
        this.c = j10;
        if (j10 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread g();

    public final void h(boolean z4) {
        this.c = (z4 ? 4294967296L : 1L) + this.c;
        if (z4) {
            return;
        }
        this.d = true;
    }

    public abstract long i();

    public final boolean j() {
        tc.e eVar = this.e;
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
