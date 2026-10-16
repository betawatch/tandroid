package e9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class l0 extends a {
    public final n0 c;

    public l0(n0 n0Var, int i10) {
        super(n0Var.size(), i10);
        this.c = n0Var;
    }

    @Override // e9.a
    public final Object a(int i10) {
        return this.c.get(i10);
    }
}
