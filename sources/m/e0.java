package m;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class e0 extends u1 {
    public final /* synthetic */ m0 s;
    public final /* synthetic */ p0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p0 p0Var, p0 p0Var2, m0 m0Var) {
        super(p0Var2);
        this.w = p0Var;
        this.s = m0Var;
    }

    @Override // m.u1
    public final l.b0 b() {
        return this.s;
    }

    @Override // m.u1
    public final boolean c() {
        p0 p0Var = this.w;
        if (p0Var.getInternalPopup().a()) {
            return true;
        }
        p0Var.f.m(g0.b(p0Var), g0.a(p0Var));
        return true;
    }
}
