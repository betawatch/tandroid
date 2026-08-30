package j3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class k implements h5.n {
    public final c2.d0 a;
    public final k0 b;
    public e c;
    public h5.n d;
    public boolean e = true;
    public boolean f;

    public k(k0 k0Var, h5.y yVar) {
        this.b = k0Var;
        this.a = new c2.d0(yVar);
    }

    @Override // h5.n
    public final void c(v1 v1Var) {
        h5.n nVar = this.d;
        if (nVar != null) {
            nVar.c(v1Var);
            v1Var = this.d.d();
        }
        this.a.c(v1Var);
    }

    @Override // h5.n
    public final v1 d() {
        h5.n nVar = this.d;
        return nVar != null ? nVar.d() : (v1) this.a.e;
    }

    @Override // h5.n
    public final long e() {
        if (this.e) {
            return this.a.e();
        }
        h5.n nVar = this.d;
        nVar.getClass();
        return nVar.e();
    }
}
