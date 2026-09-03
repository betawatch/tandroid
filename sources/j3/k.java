package j3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k implements h5.n {
    public final c2.e0 a;
    public final k0 b;
    public e c;
    public h5.n d;
    public boolean e = true;
    public boolean f;

    public k(k0 k0Var, h5.y yVar) {
        this.b = k0Var;
        this.a = new c2.e0(yVar);
    }

    @Override // h5.n
    public final void a(v1 v1Var) {
        h5.n nVar = this.d;
        if (nVar != null) {
            nVar.a(v1Var);
            v1Var = this.d.d();
        }
        this.a.a(v1Var);
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
