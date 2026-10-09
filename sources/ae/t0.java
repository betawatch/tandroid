package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class t0 extends v0 {
    public final m c;
    public final /* synthetic */ x0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(x0 x0Var, long j3, m mVar) {
        super(j3);
        this.d = x0Var;
        this.c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.D(this.d);
    }

    @Override // ae.v0
    public final String toString() {
        return super.toString() + this.c;
    }
}
