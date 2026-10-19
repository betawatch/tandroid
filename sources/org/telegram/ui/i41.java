package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class i41 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ x51 d;

    public /* synthetic */ i41(x51 x51Var, int i10) {
        this.c = i10;
        this.d = x51Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                x51 x51Var = this.d;
                return (x51Var.w0.indexOfKey(i10) >= 0 || x51Var.z0.indexOfKey(i10) >= 0 || i10 == x51Var.f || i10 == x51Var.y || i10 == x51Var.n || i10 == x51Var.h || i10 == x51Var.v || i10 == x51Var.a || i10 == x51Var.x) ? x51Var.r0.J : ((i10 < x51Var.E || i10 >= x51Var.F) && !x51Var.Q) ? 5 : 8;
            default:
                x51 x51Var2 = this.d;
                h51 h51Var = x51Var2.q0;
                int j10 = h51Var.j(i10);
                if (j10 == 6) {
                    return x51Var2.r0.J;
                }
                if (j10 != 5) {
                    x51 x51Var3 = h51Var.s;
                    if (x51Var3.W != 14 ? i10 <= (i11 = h51Var.c) || (i10 - i11) - 1 >= x51Var3.C1.size() : (arrayList = x51Var3.B1) == null || i10 < (i12 = h51Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
