package m4;

import hg.b2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements g1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ z0(g1 g1Var, int i10) {
        this.a = i10;
        this.b = g1Var;
    }

    @Override // m4.g1
    public final Object a(f0 f0Var, v vVar, int i10) {
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
