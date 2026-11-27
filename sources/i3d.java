// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class i3d extends cr2 {
    public final rg0 k;

    public i3d(rg0 rg0Var) {
        this.k = rg0Var;
    }

    public void A(asb asbVar) {
        n(new ci6(asbVar, (byte) 0));
    }

    public void B() {
        y(null, this.k);
    }

    @Override // rg0
    public boolean a(ft6 ft6Var) {
        return this.k.a(ft6Var);
    }

    @Override // rg0
    public asb h() {
        return this.k.h();
    }

    @Override // rg0
    public final ft6 i() {
        return this.k.i();
    }

    @Override // rg0
    public boolean j() {
        return this.k.j();
    }

    @Override // rg0
    public final void m(v2c v2cVar) {
        this.j = gcc.q(null);
        B();
    }

    @Override // rg0
    public void t(ft6 ft6Var) {
        this.k.t(ft6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cr2
    public final vz6 u(Integer num, vz6 vz6Var) {
        return z(vz6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cr2
    public final long v(long j, Integer num) {
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cr2
    public final int w(int i, Integer num) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cr2
    public final void x(Integer num, rg0 rg0Var, asb asbVar) {
        A(asbVar);
    }

    public vz6 z(vz6 vz6Var) {
        return vz6Var;
    }
}
