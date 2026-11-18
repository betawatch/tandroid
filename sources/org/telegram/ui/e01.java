package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class e01 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ r11 d;

    public /* synthetic */ e01(r11 r11Var, int i7) {
        this.c = i7;
        this.d = r11Var;
    }

    @Override // g.p
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.c) {
            case 0:
                r11 r11Var = this.d;
                return (r11Var.x0.indexOfKey(i7) >= 0 || r11Var.A0.indexOfKey(i7) >= 0 || i7 == r11Var.f || i7 == r11Var.E || i7 == r11Var.n || i7 == r11Var.h || i7 == r11Var.w || i7 == r11Var.a || i7 == r11Var.y) ? r11Var.s0.J : ((i7 < r11Var.F || i7 >= r11Var.G) && !r11Var.R) ? 5 : 8;
            default:
                r11 r11Var2 = this.d;
                c11 c11Var = r11Var2.r0;
                int d = c11Var.d(i7);
                if (d == 6) {
                    return r11Var2.s0.J;
                }
                if (d != 5) {
                    r11 r11Var3 = c11Var.s;
                    if (r11Var3.a0 != 14 ? i7 <= (i10 = c11Var.c) || (i7 - i10) - 1 >= r11Var3.E1.size() : (arrayList = r11Var3.D1) == null || i7 < (i11 = c11Var.c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
