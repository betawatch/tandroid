package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n41 extends f2.x {
    public final /* synthetic */ int c;
    public final /* synthetic */ b61 d;

    public /* synthetic */ n41(b61 b61Var, int i9) {
        this.c = i9;
        this.d = b61Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.c) {
            case 0:
                b61 b61Var = this.d;
                return (b61Var.s0.indexOfKey(i9) >= 0 || b61Var.v0.indexOfKey(i9) >= 0 || i9 == b61Var.f || i9 == b61Var.y || i9 == b61Var.n || i9 == b61Var.h || i9 == b61Var.v || i9 == b61Var.a || i9 == b61Var.x) ? b61Var.n0.J : ((i9 < b61Var.A || i9 >= b61Var.B) && !b61Var.M) ? 5 : 8;
            default:
                b61 b61Var2 = this.d;
                l51 l51Var = b61Var2.m0;
                int j10 = l51Var.j(i9);
                if (j10 == 6) {
                    return b61Var2.n0.J;
                }
                if (j10 != 5) {
                    b61 b61Var3 = l51Var.s;
                    if (b61Var3.S != 14 ? i9 <= (i10 = l51Var.c) || (i9 - i10) - 1 >= b61Var3.y1.size() : (arrayList = b61Var3.x1) == null || i9 < (i11 = l51Var.c) || i9 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
