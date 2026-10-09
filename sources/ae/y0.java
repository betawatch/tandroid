package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class y0 extends b0 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public id.e e;

    public final void f(boolean z10) {
        long j3 = this.c - (z10 ? 4294967296L : 1L);
        this.c = j3;
        if (j3 <= 0 && this.d) {
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
        id.e eVar = this.e;
        if (eVar == null) {
            return false;
        }
        n0 n0Var = (n0) (eVar.isEmpty() ? null : eVar.removeFirst());
        if (n0Var == null) {
            return false;
        }
        n0Var.run();
        return true;
    }

    public void k(long j3, v0 v0Var) {
        h0.s.o(j3, v0Var);
    }

    public abstract void shutdown();
}
