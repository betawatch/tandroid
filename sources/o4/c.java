package o4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c implements l0 {
    public final l0 a;
    public boolean b;
    public final /* synthetic */ d c;

    public c(d dVar, l0 l0Var) {
        this.c = dVar;
        this.a = l0Var;
    }

    @Override // o4.l0
    public final void a() {
        this.a.a();
    }

    @Override // o4.l0
    public final boolean d() {
        return !this.c.a() && this.a.d();
    }

    @Override // o4.l0
    public final int e(long j10) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.e(j10);
    }

    @Override // o4.l0
    public final int f(f7.b bVar, n3.i iVar, int i10) {
        d dVar = this.c;
        if (dVar.a()) {
            return -3;
        }
        if (this.b) {
            iVar.b = 4;
            return -4;
        }
        long X = dVar.X();
        int f10 = this.a.f(bVar, iVar, i10);
        if (f10 != -5) {
            long j10 = dVar.f;
            if (j10 == Long.MIN_VALUE || ((f10 != -4 || iVar.f < j10) && !(f10 == -3 && X == Long.MIN_VALUE && !iVar.e))) {
                return f10;
            }
            iVar.c();
            iVar.b = 4;
            this.b = true;
            return -4;
        }
        j3.n0 n0Var = (j3.n0) bVar.c;
        n0Var.getClass();
        int i11 = n0Var.T;
        int i12 = n0Var.S;
        if (i12 == 0 && i11 == 0) {
            return -5;
        }
        if (dVar.e != 0) {
            i12 = 0;
        }
        if (dVar.f != Long.MIN_VALUE) {
            i11 = 0;
        }
        j3.m0 a2 = n0Var.a();
        a2.E = i12;
        a2.F = i11;
        bVar.c = new j3.n0(a2);
        return -5;
    }
}
