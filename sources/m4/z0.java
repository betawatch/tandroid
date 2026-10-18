package m4;

import hg.b2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                i1.I0(null, vVar, i10, this.b, new i2.r(vVar, i10, 3));
                throw null;
            default:
                return i1.I0(f0Var, vVar, i10, this.b, new b2(f0Var, vVar, i10, 4));
        }
    }
}
