package m4;

import gg.d2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ u0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // m4.a1
    public final Object h(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 0:
                if (a0Var != null) {
                    throw new ClassCastException();
                }
                b1.I0(null, rVar, i10, this.b, new i2.s(rVar, i10, 3));
                throw null;
            default:
                return b1.I0(a0Var, rVar, i10, this.b, new d2(a0Var, rVar, i10, 4));
        }
    }
}
