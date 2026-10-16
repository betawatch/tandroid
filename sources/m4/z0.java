package m4;

import hg.b2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements g1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ z0(g1 g1Var, int i10) {
        this.a = i10;
        this.b = g1Var;
    }

    @Override // m4.g1
    public final Object c(e0 e0Var, v vVar, int i10) {
        switch (this.a) {
            case 0:
                if (e0Var != null) {
                    throw new ClassCastException();
                }
                i1.I0(null, vVar, i10, this.b, new i2.r(vVar, i10, 3));
                throw null;
            default:
                return i1.I0(e0Var, vVar, i10, this.b, new b2(e0Var, vVar, i10, 4));
        }
    }
}
