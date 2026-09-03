package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g51 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ x61 d;

    public /* synthetic */ g51(x61 x61Var, int i10) {
        this.c = i10;
        this.d = x61Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                x61 x61Var = this.d;
                return (x61Var.t0.indexOfKey(i10) >= 0 || x61Var.w0.indexOfKey(i10) >= 0 || i10 == x61Var.f || i10 == x61Var.y || i10 == x61Var.n || i10 == x61Var.h || i10 == x61Var.v || i10 == x61Var.a || i10 == x61Var.x) ? x61Var.o0.J : ((i10 < x61Var.B || i10 >= x61Var.C) && !x61Var.N) ? 5 : 8;
            default:
                x61 x61Var2 = this.d;
                g61 g61Var = x61Var2.n0;
                int j10 = g61Var.j(i10);
                if (j10 == 6) {
                    return x61Var2.o0.J;
                }
                if (j10 != 5) {
                    x61 x61Var3 = g61Var.s;
                    if (x61Var3.T != 14 ? i10 <= (i11 = g61Var.c) || (i10 - i11) - 1 >= x61Var3.z1.size() : (arrayList = x61Var3.y1) == null || i10 < (i12 = g61Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
