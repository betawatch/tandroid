package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class q20 extends g.o {
    public final /* synthetic */ s50 c;

    public q20(s50 s50Var) {
        this.c = s50Var;
    }

    @Override // g.o
    public final int i(int i10) {
        m50 m50Var;
        int i11;
        int i12;
        int i13 = s50.F3 ? 6 : 2;
        if (s50.G3 || i10 < (i11 = (m50Var = this.c.P).G) || i10 >= (i12 = m50Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!s50.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!s50.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
