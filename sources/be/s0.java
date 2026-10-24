package be;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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

    @Override // be.u0
    public final String toString() {
        return super.toString() + this.c;
    }
}
