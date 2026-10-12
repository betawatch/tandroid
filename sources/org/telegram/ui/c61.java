package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c61 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ r71 d;

    public /* synthetic */ c61(r71 r71Var, int i10) {
        this.c = i10;
        this.d = r71Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                r71 r71Var = this.d;
                return (r71Var.w0.indexOfKey(i10) >= 0 || r71Var.z0.indexOfKey(i10) >= 0 || i10 == r71Var.f || i10 == r71Var.y || i10 == r71Var.n || i10 == r71Var.h || i10 == r71Var.v || i10 == r71Var.a || i10 == r71Var.x) ? r71Var.r0.J : ((i10 < r71Var.E || i10 >= r71Var.F) && !r71Var.Q) ? 5 : 8;
            default:
                r71 r71Var2 = this.d;
                b71 b71Var = r71Var2.q0;
                int j10 = b71Var.j(i10);
                if (j10 == 6) {
                    return r71Var2.r0.J;
                }
                if (j10 != 5) {
                    r71 r71Var3 = b71Var.s;
                    if (r71Var3.W != 14 ? i10 <= (i11 = b71Var.c) || (i10 - i11) - 1 >= r71Var3.C1.size() : (arrayList = r71Var3.B1) == null || i10 < (i12 = b71Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
