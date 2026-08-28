package j4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l0 implements b1 {
    public final b1 a;
    public final long b;

    public l0(b1 b1Var, long j10) {
        this.a = b1Var;
        this.b = j10;
    }

    @Override // j4.b1
    public final void a() {
        this.a.a();
    }

    @Override // j4.b1
    public final boolean f() {
        return this.a.f();
    }

    @Override // j4.b1
    public final int j(long j10) {
        return this.a.j(j10 - this.b);
    }

    @Override // j4.b1
    public final int l(h3.u0 u0Var, k3.i iVar, int i9) {
        int l10 = this.a.l(u0Var, iVar, i9);
        if (l10 == -4) {
            iVar.d = Math.max(0L, iVar.d + this.b);
        }
        return l10;
    }
}
