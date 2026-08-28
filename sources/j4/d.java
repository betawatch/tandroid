package j4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements b1 {
    public final b1 a;
    public boolean b;
    public final /* synthetic */ e c;

    public d(e eVar, b1 b1Var) {
        this.c = eVar;
        this.a = b1Var;
    }

    @Override // j4.b1
    public final void a() {
        this.a.a();
    }

    @Override // j4.b1
    public final boolean f() {
        return !this.c.a() && this.a.f();
    }

    @Override // j4.b1
    public final int j(long j10) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.j(j10);
    }

    @Override // j4.b1
    public final int l(h3.u0 u0Var, k3.i iVar, int i9) {
        e eVar = this.c;
        if (eVar.a()) {
            return -3;
        }
        if (this.b) {
            iVar.setFlags(4);
            return -4;
        }
        int l10 = this.a.l(u0Var, iVar, i9);
        if (l10 != -5) {
            long j10 = eVar.f;
            if (j10 == Long.MIN_VALUE || ((l10 != -4 || iVar.d < j10) && !(l10 == -3 && eVar.v() == Long.MIN_VALUE && !iVar.c))) {
                return l10;
            }
            iVar.clear();
            iVar.setFlags(4);
            this.b = true;
            return -4;
        }
        h3.t0 t0Var = u0Var.b;
        t0Var.getClass();
        int i10 = t0Var.S;
        int i11 = t0Var.R;
        if (i11 == 0 && i10 == 0) {
            return -5;
        }
        if (eVar.e != 0) {
            i11 = 0;
        }
        if (eVar.f != Long.MIN_VALUE) {
            i10 = 0;
        }
        h3.s0 a2 = t0Var.a();
        a2.E = i11;
        a2.F = i10;
        u0Var.b = new h3.t0(a2);
        return -5;
    }
}
