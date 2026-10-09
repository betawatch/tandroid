package m4;

import gg.c2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ u0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // m4.a1
    public final Object h(b0 b0Var, r rVar, int i10) {
        switch (this.a) {
            case 0:
                if (b0Var != null) {
                    throw new ClassCastException();
                }
                b1.H0(null, rVar, i10, this.b, new i2.s(rVar, i10, 3));
                throw null;
            default:
                return b1.H0(b0Var, rVar, i10, this.b, new c2(b0Var, rVar, i10, 4));
        }
    }
}
