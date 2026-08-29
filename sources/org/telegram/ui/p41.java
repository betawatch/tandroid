package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p41 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ d61 d;

    public /* synthetic */ p41(d61 d61Var, int i10) {
        this.c = i10;
        this.d = d61Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                d61 d61Var = this.d;
                return (d61Var.s0.indexOfKey(i10) >= 0 || d61Var.v0.indexOfKey(i10) >= 0 || i10 == d61Var.f || i10 == d61Var.y || i10 == d61Var.n || i10 == d61Var.h || i10 == d61Var.v || i10 == d61Var.a || i10 == d61Var.x) ? d61Var.n0.J : ((i10 < d61Var.A || i10 >= d61Var.B) && !d61Var.M) ? 5 : 8;
            default:
                d61 d61Var2 = this.d;
                n51 n51Var = d61Var2.m0;
                int j10 = n51Var.j(i10);
                if (j10 == 6) {
                    return d61Var2.n0.J;
                }
                if (j10 != 5) {
                    d61 d61Var3 = n51Var.s;
                    if (d61Var3.S != 14 ? i10 <= (i11 = n51Var.c) || (i10 - i11) - 1 >= d61Var3.y1.size() : (arrayList = d61Var3.x1) == null || i10 < (i12 = n51Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
