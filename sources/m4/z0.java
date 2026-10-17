package m4;

import hg.b2;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements g1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ z0(g1 g1Var, int i10) {
        this.a = i10;
        this.b = g1Var;
    }

    @Override // m4.g1
    public final Object e(f0 f0Var, v vVar, int i10) {
        switch (this.a) {
            case 0:
                if (f0Var != null) {
                    throw new ClassCastException();
                }
                i1.I0(null, vVar, i10, this.b, new i2.q(vVar, i10, 3));
                throw null;
            default:
                return i1.I0(f0Var, vVar, i10, this.b, new b2(f0Var, vVar, i10, 4));
        }
    }
}
