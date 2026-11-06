package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d01 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ q11 d;

    public /* synthetic */ d01(q11 q11Var, int i7) {
        this.c = i7;
        this.d = q11Var;
    }

    @Override // g.p
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.c) {
            case 0:
                q11 q11Var = this.d;
                return (q11Var.w0.indexOfKey(i7) >= 0 || q11Var.z0.indexOfKey(i7) >= 0 || i7 == q11Var.f || i7 == q11Var.D || i7 == q11Var.n || i7 == q11Var.h || i7 == q11Var.w || i7 == q11Var.a || i7 == q11Var.y) ? q11Var.r0.J : ((i7 < q11Var.E || i7 >= q11Var.F) && !q11Var.Q) ? 5 : 8;
            default:
                q11 q11Var2 = this.d;
                b11 b11Var = q11Var2.q0;
                int d = b11Var.d(i7);
                if (d == 6) {
                    return q11Var2.r0.J;
                }
                if (d != 5) {
                    q11 q11Var3 = b11Var.s;
                    if (q11Var3.W != 14 ? i7 <= (i10 = b11Var.c) || (i7 - i10) - 1 >= q11Var3.D1.size() : (arrayList = q11Var3.C1) == null || i7 < (i11 = b11Var.c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
