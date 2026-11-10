package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g01 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ t11 d;

    public /* synthetic */ g01(t11 t11Var, int i7) {
        this.c = i7;
        this.d = t11Var;
    }

    @Override // g.p
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.c) {
            case 0:
                t11 t11Var = this.d;
                return (t11Var.w0.indexOfKey(i7) >= 0 || t11Var.z0.indexOfKey(i7) >= 0 || i7 == t11Var.f || i7 == t11Var.D || i7 == t11Var.n || i7 == t11Var.h || i7 == t11Var.w || i7 == t11Var.a || i7 == t11Var.y) ? t11Var.r0.J : ((i7 < t11Var.E || i7 >= t11Var.F) && !t11Var.Q) ? 5 : 8;
            default:
                t11 t11Var2 = this.d;
                e11 e11Var = t11Var2.q0;
                int d = e11Var.d(i7);
                if (d == 6) {
                    return t11Var2.r0.J;
                }
                if (d != 5) {
                    t11 t11Var3 = e11Var.s;
                    if (t11Var3.W != 14 ? i7 <= (i10 = e11Var.c) || (i7 - i10) - 1 >= t11Var3.D1.size() : (arrayList = t11Var3.C1) == null || i7 < (i11 = e11Var.c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
