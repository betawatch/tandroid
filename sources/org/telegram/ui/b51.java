package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b51 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ r61 d;

    public /* synthetic */ b51(r61 r61Var, int i10) {
        this.c = i10;
        this.d = r61Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                r61 r61Var = this.d;
                return (r61Var.t0.indexOfKey(i10) >= 0 || r61Var.w0.indexOfKey(i10) >= 0 || i10 == r61Var.f || i10 == r61Var.y || i10 == r61Var.n || i10 == r61Var.h || i10 == r61Var.v || i10 == r61Var.a || i10 == r61Var.x) ? r61Var.o0.J : ((i10 < r61Var.B || i10 >= r61Var.C) && !r61Var.N) ? 5 : 8;
            default:
                r61 r61Var2 = this.d;
                b61 b61Var = r61Var2.n0;
                int j10 = b61Var.j(i10);
                if (j10 == 6) {
                    return r61Var2.o0.J;
                }
                if (j10 != 5) {
                    r61 r61Var3 = b61Var.s;
                    if (r61Var3.T != 14 ? i10 <= (i11 = b61Var.c) || (i10 - i11) - 1 >= r61Var3.z1.size() : (arrayList = r61Var3.y1) == null || i10 < (i12 = b61Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
