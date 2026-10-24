package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class m41 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ b61 d;

    public /* synthetic */ m41(b61 b61Var, int i10) {
        this.c = i10;
        this.d = b61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                b61 b61Var = this.d;
                return (b61Var.w0.indexOfKey(i10) >= 0 || b61Var.z0.indexOfKey(i10) >= 0 || i10 == b61Var.f || i10 == b61Var.y || i10 == b61Var.n || i10 == b61Var.h || i10 == b61Var.v || i10 == b61Var.a || i10 == b61Var.x) ? b61Var.r0.J : ((i10 < b61Var.E || i10 >= b61Var.F) && !b61Var.Q) ? 5 : 8;
            default:
                b61 b61Var2 = this.d;
                l51 l51Var = b61Var2.q0;
                int j10 = l51Var.j(i10);
                if (j10 == 6) {
                    return b61Var2.r0.J;
                }
                if (j10 != 5) {
                    b61 b61Var3 = l51Var.s;
                    if (b61Var3.W != 14 ? i10 <= (i11 = l51Var.c) || (i10 - i11) - 1 >= b61Var3.D1.size() : (arrayList = b61Var3.C1) == null || i10 < (i12 = l51Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
