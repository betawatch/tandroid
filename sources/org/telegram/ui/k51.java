package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class k51 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ z61 d;

    public /* synthetic */ k51(z61 z61Var, int i10) {
        this.c = i10;
        this.d = z61Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                z61 z61Var = this.d;
                return (z61Var.w0.indexOfKey(i10) >= 0 || z61Var.z0.indexOfKey(i10) >= 0 || i10 == z61Var.f || i10 == z61Var.y || i10 == z61Var.n || i10 == z61Var.h || i10 == z61Var.v || i10 == z61Var.a || i10 == z61Var.x) ? z61Var.r0.J : ((i10 < z61Var.E || i10 >= z61Var.F) && !z61Var.Q) ? 5 : 8;
            default:
                z61 z61Var2 = this.d;
                j61 j61Var = z61Var2.q0;
                int j3 = j61Var.j(i10);
                if (j3 == 6) {
                    return z61Var2.r0.J;
                }
                if (j3 != 5) {
                    z61 z61Var3 = j61Var.s;
                    if (z61Var3.W != 14 ? i10 <= (i11 = j61Var.c) || (i10 - i11) - 1 >= z61Var3.C1.size() : (arrayList = z61Var3.B1) == null || i10 < (i12 = j61Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
