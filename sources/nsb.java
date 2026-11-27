// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class nsb extends ju9 implements Runnable {
    public final long f;

    public nsb(long j, zw2 zw2Var) {
        super(zw2Var, zw2Var.getContext());
        this.f = j;
    }

    @Override // c2, sv5
    public final String D() {
        return super.D() + "(timeMillis=" + this.f + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        aie.b(this.d);
        i(new msb("Timed out waiting for " + this.f + " ms", this));
    }
}
