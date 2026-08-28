package hd;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s0 extends u0 {
    public final m c;
    public final /* synthetic */ w0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(w0 w0Var, long j10, m mVar) {
        super(j10);
        this.d = w0Var;
        this.c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.D(this.d);
    }

    @Override // hd.u0
    public final String toString() {
        return super.toString() + this.c;
    }
}
