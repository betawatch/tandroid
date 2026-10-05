package m4;

import gg.d2;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ t0(z0 z0Var, int i10) {
        this.a = i10;
        this.b = z0Var;
    }

    @Override // m4.z0
    public final Object h(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 0:
                if (a0Var != null) {
                    throw new ClassCastException();
                }
                a1.I0(null, rVar, i10, this.b, new i2.s(rVar, i10, 3));
                throw null;
            default:
                return a1.I0(a0Var, rVar, i10, this.b, new d2(a0Var, rVar, i10, 4));
        }
    }
}
