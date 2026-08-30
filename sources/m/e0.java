package m;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e0 extends v1 {
    public final /* synthetic */ n0 s;
    public final /* synthetic */ q0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(q0 q0Var, q0 q0Var2, n0 n0Var) {
        super(q0Var2);
        this.v = q0Var;
        this.s = n0Var;
    }

    @Override // m.v1
    public final l.b0 b() {
        return this.s;
    }

    @Override // m.v1
    public final boolean c() {
        q0 q0Var = this.v;
        if (q0Var.getInternalPopup().a()) {
            return true;
        }
        q0Var.f.m(g0.b(q0Var), g0.a(q0Var));
        return true;
    }
}
