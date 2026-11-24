// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lr5 extends ft5 {
    public static final /* synthetic */ long f = ex.a.objectFieldOffset(lr5.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final qp4 e;

    public lr5(qp4 qp4Var) {
        this.e = qp4Var;
    }

    @Override // ft5
    public final boolean k() {
        return true;
    }

    @Override // ft5
    public final void l(Throwable th) {
        if (ex.a.compareAndSwapInt(this, f, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
