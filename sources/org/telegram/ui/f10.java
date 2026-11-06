package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f10 extends g.p {
    public final /* synthetic */ c40 c;

    public f10(c40 c40Var) {
        this.c = c40Var;
    }

    @Override // g.p
    public final int i(int i7) {
        w30 w30Var;
        int i10;
        int i11;
        int i12 = c40.w5 ? 6 : 2;
        if (c40.x5 || i7 < (i10 = (w30Var = this.c.G1).G) || i7 >= (i11 = w30Var.H)) {
            return i12;
        }
        int i13 = i11 - i10;
        int i14 = (i7 != i11 - 1 || (!c40.w5 && i13 % 2 == 0)) ? 1 : 2;
        if (!c40.w5) {
            return i14;
        }
        if (i13 == 1) {
            return 6;
        }
        return i13 == 2 ? 3 : 2;
    }
}
