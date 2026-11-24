// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nob extends rq9 implements Runnable {
    public final long f;

    public nob(long j, fw2 fw2Var) {
        super(fw2Var, fw2Var.getContext());
        this.f = j;
    }

    @Override // b2, pt5
    public final String D() {
        return super.D() + "(timeMillis=" + this.f + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        jde.b(this.d);
        i(new mob("Timed out waiting for " + this.f + " ms", this));
    }
}
