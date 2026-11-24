// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class o54 extends fy2 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public lt e;

    public final void f(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j > 0 || !this.d) {
            return;
        }
        shutdown();
    }

    public final void g(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public abstract long h();

    public final boolean i() {
        lt ltVar = this.e;
        if (ltVar == null) {
            return false;
        }
        tp3 tp3Var = (tp3) (ltVar.isEmpty() ? null : ltVar.removeFirst());
        if (tp3Var == null) {
            return false;
        }
        tp3Var.run();
        return true;
    }

    public abstract void shutdown();
}
