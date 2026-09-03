package ld;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
