package m;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class g0 extends w1 {
    public final /* synthetic */ o0 s;
    public final /* synthetic */ r0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r0 r0Var, r0 r0Var2, o0 o0Var) {
        super(r0Var2);
        this.v = r0Var;
        this.s = o0Var;
    }

    @Override // m.w1
    public final l.b0 b() {
        return this.s;
    }

    @Override // m.w1
    public final boolean c() {
        r0 r0Var = this.v;
        if (r0Var.getInternalPopup().a()) {
            return true;
        }
        r0Var.f.l(i0.b(r0Var), i0.a(r0Var));
        return true;
    }
}
