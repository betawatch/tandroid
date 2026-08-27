package j4;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k0 implements b1 {
    public final b1 a;
    public final long b;

    public k0(b1 b1Var, long j10) {
        this.a = b1Var;
        this.b = j10;
    }

    @Override // j4.b1
    public final void a() {
        this.a.a();
    }

    @Override // j4.b1
    public final boolean e() {
        return this.a.e();
    }

    @Override // j4.b1
    public final int f(long j10) {
        return this.a.f(j10 - this.b);
    }

    @Override // j4.b1
    public final int i(h3.u0 u0Var, k3.i iVar, int i10) {
        int i11 = this.a.i(u0Var, iVar, i10);
        if (i11 == -4) {
            iVar.d = Math.max(0L, iVar.d + this.b);
        }
        return i11;
    }
}
