package m;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class e0 extends u1 {
    public final /* synthetic */ m0 s;
    public final /* synthetic */ p0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p0 p0Var, p0 p0Var2, m0 m0Var) {
        super(p0Var2);
        this.v = p0Var;
        this.s = m0Var;
    }

    @Override // m.u1
    public final l.b0 b() {
        return this.s;
    }

    @Override // m.u1
    public final boolean c() {
        p0 p0Var = this.v;
        if (p0Var.getInternalPopup().a()) {
            return true;
        }
        p0Var.f.l(g0.b(p0Var), g0.a(p0Var));
        return true;
    }
}
