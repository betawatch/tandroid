// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
