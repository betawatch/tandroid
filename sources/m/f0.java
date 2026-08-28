package m;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f0 extends v1 {
    public final /* synthetic */ n0 s;
    public final /* synthetic */ q0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(q0 q0Var, q0 q0Var2, n0 n0Var) {
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
        q0Var.f.m(h0.b(q0Var), h0.a(q0Var));
        return true;
    }
}
