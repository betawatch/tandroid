package ce;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class t0 extends u0 {
    public final f2 c;

    public t0(long j10, f2 f2Var) {
        super(j10);
        this.c = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // ce.u0
    public final String toString() {
        return super.toString() + this.c;
    }
}
