// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class d44 extends vw2 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public ks e;

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
        ks ksVar = this.e;
        if (ksVar == null) {
            return false;
        }
        jo3 jo3Var = (jo3) (ksVar.isEmpty() ? null : ksVar.removeFirst());
        if (jo3Var == null) {
            return false;
        }
        jo3Var.run();
        return true;
    }

    public abstract void shutdown();
}
