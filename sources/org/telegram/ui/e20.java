package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e20 extends g.o {
    public final /* synthetic */ a50 c;

    public e20(a50 a50Var) {
        this.c = a50Var;
    }

    @Override // g.o
    public final int i(int i10) {
        u40 u40Var;
        int i11;
        int i12;
        int i13 = a50.w5 ? 6 : 2;
        if (a50.x5 || i10 < (i11 = (u40Var = this.c.G1).G) || i10 >= (i12 = u40Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!a50.w5 && i14 % 2 == 0)) ? 1 : 2;
        if (!a50.w5) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
