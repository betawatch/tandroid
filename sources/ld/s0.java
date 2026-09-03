package ld;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s0 extends t0 {
    public final e2 c;

    public s0(long j10, e2 e2Var) {
        super(j10);
        this.c = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // ld.t0
    public final String toString() {
        return super.toString() + this.c;
    }
}
