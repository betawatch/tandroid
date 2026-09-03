package ld;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class r0 extends t0 {
    public final m c;
    public final /* synthetic */ v0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v0 v0Var, long j10, m mVar) {
        super(j10);
        this.d = v0Var;
        this.c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.D(this.d);
    }

    @Override // ld.t0
    public final String toString() {
        return super.toString() + this.c;
    }
}
