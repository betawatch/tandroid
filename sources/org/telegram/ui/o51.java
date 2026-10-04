package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class o51 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ c71 d;

    public /* synthetic */ o51(c71 c71Var, int i10) {
        this.c = i10;
        this.d = c71Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                c71 c71Var = this.d;
                return (c71Var.w0.indexOfKey(i10) >= 0 || c71Var.z0.indexOfKey(i10) >= 0 || i10 == c71Var.f || i10 == c71Var.y || i10 == c71Var.n || i10 == c71Var.h || i10 == c71Var.v || i10 == c71Var.a || i10 == c71Var.x) ? c71Var.r0.J : ((i10 < c71Var.E || i10 >= c71Var.F) && !c71Var.Q) ? 5 : 8;
            default:
                c71 c71Var2 = this.d;
                m61 m61Var = c71Var2.q0;
                int j3 = m61Var.j(i10);
                if (j3 == 6) {
                    return c71Var2.r0.J;
                }
                if (j3 != 5) {
                    c71 c71Var3 = m61Var.s;
                    if (c71Var3.W != 14 ? i10 <= (i11 = m61Var.c) || (i10 - i11) - 1 >= c71Var3.C1.size() : (arrayList = c71Var3.B1) == null || i10 < (i12 = m61Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
