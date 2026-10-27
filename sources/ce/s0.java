package ce;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    @Override // ce.u0
    public final String toString() {
        return super.toString() + this.c;
    }
}
