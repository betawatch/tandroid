package l4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k0 implements c1 {
    public final c1 a;
    public final long b;

    public k0(c1 c1Var, long j10) {
        this.a = c1Var;
        this.b = j10;
    }

    @Override // l4.c1
    public final void a() {
        this.a.a();
    }

    @Override // l4.c1
    public final int d(j3.u0 u0Var, m3.i iVar, int i10) {
        int d = this.a.d(u0Var, iVar, i10);
        if (d == -4) {
            iVar.d = Math.max(0L, iVar.d + this.b);
        }
        return d;
    }

    @Override // l4.c1
    public final boolean e() {
        return this.a.e();
    }

    @Override // l4.c1
    public final int i(long j10) {
        return this.a.i(j10 - this.b);
    }
}
