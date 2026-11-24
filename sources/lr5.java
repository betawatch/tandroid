// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
