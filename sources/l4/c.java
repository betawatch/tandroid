package l4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements c1 {
    public final c1 a;
    public boolean b;
    public final /* synthetic */ d c;

    public c(d dVar, c1 c1Var) {
        this.c = dVar;
        this.a = c1Var;
    }

    @Override // l4.c1
    public final void a() {
        this.a.a();
    }

    @Override // l4.c1
    public final int d(j3.u0 u0Var, m3.i iVar, int i10) {
        d dVar = this.c;
        if (dVar.d()) {
            return -3;
        }
        if (this.b) {
            iVar.setFlags(4);
            return -4;
        }
        int d = this.a.d(u0Var, iVar, i10);
        if (d != -5) {
            long j10 = dVar.f;
            if (j10 == Long.MIN_VALUE || ((d != -4 || iVar.d < j10) && !(d == -3 && dVar.L() == Long.MIN_VALUE && !iVar.c))) {
                return d;
            }
            iVar.clear();
            iVar.setFlags(4);
            this.b = true;
            return -4;
        }
        j3.t0 t0Var = u0Var.b;
        t0Var.getClass();
        int i11 = t0Var.S;
        int i12 = t0Var.R;
        if (i12 == 0 && i11 == 0) {
            return -5;
        }
        if (dVar.e != 0) {
            i12 = 0;
        }
        if (dVar.f != Long.MIN_VALUE) {
            i11 = 0;
        }
        j3.s0 a2 = t0Var.a();
        a2.E = i12;
        a2.F = i11;
        u0Var.b = new j3.t0(a2);
        return -5;
    }

    @Override // l4.c1
    public final boolean e() {
        return !this.c.d() && this.a.e();
    }

    @Override // l4.c1
    public final int i(long j10) {
        if (this.c.d()) {
            return -3;
        }
        return this.a.i(j10);
    }
}
