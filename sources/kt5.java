// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kt5 extends ev5 {
    public static final /* synthetic */ long f = fy.a.objectFieldOffset(kt5.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final rr4 e;

    public kt5(rr4 rr4Var) {
        this.e = rr4Var;
    }

    @Override // ev5
    public final boolean k() {
        return true;
    }

    @Override // ev5
    public final void l(Throwable th) {
        if (fy.a.compareAndSwapInt(this, f, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
