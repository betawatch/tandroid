package m;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        p0Var.f.l(g0.b(p0Var), g0.a(p0Var));
        return true;
    }
}
