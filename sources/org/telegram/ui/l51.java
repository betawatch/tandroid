package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class l51 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ a71 d;

    public /* synthetic */ l51(a71 a71Var, int i10) {
        this.c = i10;
        this.d = a71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                a71 a71Var = this.d;
                return (a71Var.w0.indexOfKey(i10) >= 0 || a71Var.z0.indexOfKey(i10) >= 0 || i10 == a71Var.f || i10 == a71Var.y || i10 == a71Var.n || i10 == a71Var.h || i10 == a71Var.v || i10 == a71Var.a || i10 == a71Var.x) ? a71Var.r0.J : ((i10 < a71Var.E || i10 >= a71Var.F) && !a71Var.Q) ? 5 : 8;
            default:
                a71 a71Var2 = this.d;
                k61 k61Var = a71Var2.q0;
                int j3 = k61Var.j(i10);
                if (j3 == 6) {
                    return a71Var2.r0.J;
                }
                if (j3 != 5) {
                    a71 a71Var3 = k61Var.s;
                    if (a71Var3.W != 14 ? i10 <= (i11 = k61Var.c) || (i10 - i11) - 1 >= a71Var3.C1.size() : (arrayList = a71Var3.B1) == null || i10 < (i12 = k61Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
