package m;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
    public final l.c0 b() {
        return this.s;
    }

    @Override // m.u1
    public final boolean c() {
        p0 p0Var = this.v;
        if (p0Var.getInternalPopup().a()) {
            return true;
        }
        p0Var.f.m(g0.b(p0Var), g0.a(p0Var));
        return true;
    }
}
