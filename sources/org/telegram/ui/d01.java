package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d01 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ q11 d;

    public /* synthetic */ d01(q11 q11Var, int i7) {
        this.c = i7;
        this.d = q11Var;
    }

    @Override // g.p
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.c) {
            case 0:
                q11 q11Var = this.d;
                return (q11Var.x0.indexOfKey(i7) >= 0 || q11Var.A0.indexOfKey(i7) >= 0 || i7 == q11Var.f || i7 == q11Var.E || i7 == q11Var.n || i7 == q11Var.h || i7 == q11Var.w || i7 == q11Var.a || i7 == q11Var.y) ? q11Var.s0.J : ((i7 < q11Var.F || i7 >= q11Var.G) && !q11Var.R) ? 5 : 8;
            default:
                q11 q11Var2 = this.d;
                b11 b11Var = q11Var2.r0;
                int d = b11Var.d(i7);
                if (d == 6) {
                    return q11Var2.s0.J;
                }
                if (d != 5) {
                    q11 q11Var3 = b11Var.s;
                    if (q11Var3.a0 != 14 ? i7 <= (i10 = b11Var.c) || (i7 - i10) - 1 >= q11Var3.E1.size() : (arrayList = q11Var3.D1) == null || i7 < (i11 = b11Var.c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
