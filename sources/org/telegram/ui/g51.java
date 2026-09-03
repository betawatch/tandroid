package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g51 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ w61 d;

    public /* synthetic */ g51(w61 w61Var, int i10) {
        this.c = i10;
        this.d = w61Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                w61 w61Var = this.d;
                return (w61Var.t0.indexOfKey(i10) >= 0 || w61Var.w0.indexOfKey(i10) >= 0 || i10 == w61Var.f || i10 == w61Var.y || i10 == w61Var.n || i10 == w61Var.h || i10 == w61Var.v || i10 == w61Var.a || i10 == w61Var.x) ? w61Var.o0.J : ((i10 < w61Var.B || i10 >= w61Var.C) && !w61Var.N) ? 5 : 8;
            default:
                w61 w61Var2 = this.d;
                g61 g61Var = w61Var2.n0;
                int j10 = g61Var.j(i10);
                if (j10 == 6) {
                    return w61Var2.o0.J;
                }
                if (j10 != 5) {
                    w61 w61Var3 = g61Var.s;
                    if (w61Var3.T != 14 ? i10 <= (i11 = g61Var.c) || (i10 - i11) - 1 >= w61Var3.z1.size() : (arrayList = w61Var3.y1) == null || i10 < (i12 = g61Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
