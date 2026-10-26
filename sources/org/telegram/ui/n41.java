package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class n41 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ c61 d;

    public /* synthetic */ n41(c61 c61Var, int i10) {
        this.c = i10;
        this.d = c61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                c61 c61Var = this.d;
                return (c61Var.w0.indexOfKey(i10) >= 0 || c61Var.z0.indexOfKey(i10) >= 0 || i10 == c61Var.f || i10 == c61Var.y || i10 == c61Var.n || i10 == c61Var.h || i10 == c61Var.v || i10 == c61Var.a || i10 == c61Var.x) ? c61Var.r0.J : ((i10 < c61Var.E || i10 >= c61Var.F) && !c61Var.Q) ? 5 : 8;
            default:
                c61 c61Var2 = this.d;
                m51 m51Var = c61Var2.q0;
                int j10 = m51Var.j(i10);
                if (j10 == 6) {
                    return c61Var2.r0.J;
                }
                if (j10 != 5) {
                    c61 c61Var3 = m51Var.s;
                    if (c61Var3.W != 14 ? i10 <= (i11 = m51Var.c) || (i10 - i11) - 1 >= c61Var3.D1.size() : (arrayList = c61Var3.C1) == null || i10 < (i12 = m51Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
