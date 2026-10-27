package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q41 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ f61 d;

    public /* synthetic */ q41(f61 f61Var, int i10) {
        this.c = i10;
        this.d = f61Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        switch (this.c) {
            case 0:
                f61 f61Var = this.d;
                return (f61Var.w0.indexOfKey(i10) >= 0 || f61Var.z0.indexOfKey(i10) >= 0 || i10 == f61Var.f || i10 == f61Var.y || i10 == f61Var.n || i10 == f61Var.h || i10 == f61Var.v || i10 == f61Var.a || i10 == f61Var.x) ? f61Var.r0.J : ((i10 < f61Var.E || i10 >= f61Var.F) && !f61Var.Q) ? 5 : 8;
            default:
                f61 f61Var2 = this.d;
                p51 p51Var = f61Var2.q0;
                int j10 = p51Var.j(i10);
                if (j10 == 6) {
                    return f61Var2.r0.J;
                }
                if (j10 != 5) {
                    f61 f61Var3 = p51Var.s;
                    if (f61Var3.W != 14 ? i10 <= (i11 = p51Var.c) || (i10 - i11) - 1 >= f61Var3.D1.size() : (arrayList = f61Var3.C1) == null || i10 < (i12 = p51Var.c) || i10 - i12 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
