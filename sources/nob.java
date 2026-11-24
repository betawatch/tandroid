// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
