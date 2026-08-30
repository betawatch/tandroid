package ld;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
