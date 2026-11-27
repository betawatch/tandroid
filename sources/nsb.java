// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
