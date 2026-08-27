package j4;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements b1 {
    public final b1 a;
    public boolean b;
    public final /* synthetic */ d c;

    public c(d dVar, b1 b1Var) {
        this.c = dVar;
        this.a = b1Var;
    }

    @Override // j4.b1
    public final void a() {
        this.a.a();
    }

    @Override // j4.b1
    public final boolean e() {
        return !this.c.c() && this.a.e();
    }

    @Override // j4.b1
    public final int f(long j10) {
        if (this.c.c()) {
            return -3;
        }
        return this.a.f(j10);
    }

    @Override // j4.b1
    public final int i(h3.u0 u0Var, k3.i iVar, int i10) {
        d dVar = this.c;
        if (dVar.c()) {
            return -3;
        }
        if (this.b) {
            iVar.setFlags(4);
            return -4;
        }
        int i11 = this.a.i(u0Var, iVar, i10);
        if (i11 != -5) {
            long j10 = dVar.f;
            if (j10 == Long.MIN_VALUE || ((i11 != -4 || iVar.d < j10) && !(i11 == -3 && dVar.D() == Long.MIN_VALUE && !iVar.c))) {
                return i11;
            }
            iVar.clear();
            iVar.setFlags(4);
            this.b = true;
            return -4;
        }
        h3.t0 t0Var = u0Var.b;
        t0Var.getClass();
        int i12 = t0Var.S;
        int i13 = t0Var.R;
        if (i13 == 0 && i12 == 0) {
            return -5;
        }
        if (dVar.e != 0) {
            i13 = 0;
        }
        if (dVar.f != Long.MIN_VALUE) {
            i12 = 0;
        }
        h3.s0 a2 = t0Var.a();
        a2.E = i13;
        a2.F = i12;
        u0Var.b = new h3.t0(a2);
        return -5;
    }
}
