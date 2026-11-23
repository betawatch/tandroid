package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class f01 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ s11 d;

    public /* synthetic */ f01(s11 s11Var, int i7) {
        this.c = i7;
        this.d = s11Var;
    }

    @Override // g.p
    public final int i(int i7) {
        int i10;
        ArrayList arrayList;
        int i11;
        switch (this.c) {
            case 0:
                s11 s11Var = this.d;
                return (s11Var.x0.indexOfKey(i7) >= 0 || s11Var.A0.indexOfKey(i7) >= 0 || i7 == s11Var.f || i7 == s11Var.E || i7 == s11Var.n || i7 == s11Var.h || i7 == s11Var.w || i7 == s11Var.a || i7 == s11Var.y) ? s11Var.s0.J : ((i7 < s11Var.F || i7 >= s11Var.G) && !s11Var.R) ? 5 : 8;
            default:
                s11 s11Var2 = this.d;
                d11 d11Var = s11Var2.r0;
                int d = d11Var.d(i7);
                if (d == 6) {
                    return s11Var2.s0.J;
                }
                if (d != 5) {
                    s11 s11Var3 = d11Var.s;
                    if (s11Var3.a0 != 14 ? i7 <= (i10 = d11Var.c) || (i7 - i10) - 1 >= s11Var3.E1.size() : (arrayList = s11Var3.D1) == null || i7 < (i11 = d11Var.c) || i7 - i11 >= arrayList.size()) {
                        return 5;
                    }
                }
                return 8;
        }
    }
}
