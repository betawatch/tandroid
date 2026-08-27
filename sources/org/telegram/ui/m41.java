package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m41 extends f2.w {
    public final /* synthetic */ int c;
    public final /* synthetic */ a61 d;

    public /* synthetic */ m41(a61 a61Var, int i10) {
        this.c = i10;
        this.d = a61Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                a61 a61Var = this.d;
                return (a61Var.s0.indexOfKey(i10) >= 0 || a61Var.v0.indexOfKey(i10) >= 0 || i10 == a61Var.f || i10 == a61Var.y || i10 == a61Var.n || i10 == a61Var.h || i10 == a61Var.v || i10 == a61Var.a || i10 == a61Var.x) ? a61Var.n0.J : ((i10 < a61Var.A || i10 >= a61Var.B) && !a61Var.M) ? 5 : 8;
            default:
                a61 a61Var2 = this.d;
                k51 k51Var = a61Var2.m0;
                int j10 = k51Var.j(i10);
                if (j10 == 6) {
                    return a61Var2.n0.J;
                }
                if (j10 != 5) {
                    a61 a61Var3 = k51Var.s;
                    if (a61Var3.S != 14 ? i10 <= (i11 = k51Var.c) || (i10 - i11) - 1 >= a61Var3.y1.size() : (arrayList = a61Var3.x1) == null || i10 < (i12 = k51Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
