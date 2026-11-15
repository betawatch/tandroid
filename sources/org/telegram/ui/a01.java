package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a01 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ n11 d;

    public /* synthetic */ a01(n11 n11Var, int i7) {
        this.c = i7;
        this.d = n11Var;
    }

    @Override // g.p
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.c) {
            case 0:
                n11 n11Var = this.d;
                return (n11Var.x0.indexOfKey(i7) >= 0 || n11Var.A0.indexOfKey(i7) >= 0 || i7 == n11Var.f || i7 == n11Var.E || i7 == n11Var.n || i7 == n11Var.h || i7 == n11Var.w || i7 == n11Var.a || i7 == n11Var.y) ? n11Var.s0.J : ((i7 < n11Var.F || i7 >= n11Var.G) && !n11Var.R) ? 5 : 8;
            default:
                n11 n11Var2 = this.d;
                y01 y01Var = n11Var2.r0;
                int d = y01Var.d(i7);
                if (d == 6) {
                    return n11Var2.s0.J;
                }
                if (d != 5) {
                    n11 n11Var3 = y01Var.s;
                    if (n11Var3.a0 != 14 ? i7 <= (i10 = y01Var.c) || (i7 - i10) - 1 >= n11Var3.E1.size() : (arrayList = n11Var3.D1) == null || i7 < (i11 = y01Var.c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
