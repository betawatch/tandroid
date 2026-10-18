package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class k41 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ z51 d;

    public /* synthetic */ k41(z51 z51Var, int i10) {
        this.c = i10;
        this.d = z51Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                z51 z51Var = this.d;
                return (z51Var.w0.indexOfKey(i10) >= 0 || z51Var.z0.indexOfKey(i10) >= 0 || i10 == z51Var.f || i10 == z51Var.y || i10 == z51Var.n || i10 == z51Var.h || i10 == z51Var.v || i10 == z51Var.a || i10 == z51Var.x) ? z51Var.r0.J : ((i10 < z51Var.E || i10 >= z51Var.F) && !z51Var.Q) ? 5 : 8;
            default:
                z51 z51Var2 = this.d;
                j51 j51Var = z51Var2.q0;
                int j10 = j51Var.j(i10);
                if (j10 == 6) {
                    return z51Var2.r0.J;
                }
                if (j10 != 5) {
                    z51 z51Var3 = j51Var.s;
                    if (z51Var3.W != 14 ? i10 <= (i11 = j51Var.c) || (i10 - i11) - 1 >= z51Var3.C1.size() : (arrayList = z51Var3.B1) == null || i10 < (i12 = j51Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
