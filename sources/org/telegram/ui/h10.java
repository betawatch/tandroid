package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h10 extends g.p {
    public final /* synthetic */ e40 c;

    public h10(e40 e40Var) {
        this.c = e40Var;
    }

    @Override // g.p
    public final int i(int i7) {
        y30 y30Var;
        int i10;
        int i11;
        int i12 = e40.w5 ? 6 : 2;
        if (e40.x5 || i7 < (i10 = (y30Var = this.c.G1).G) || i7 >= (i11 = y30Var.H)) {
            return i12;
        }
        int i13 = i11 - i10;
        int i14 = (i7 != i11 - 1 || (!e40.w5 && i13 % 2 == 0)) ? 1 : 2;
        if (!e40.w5) {
            return i14;
        }
        if (i13 == 1) {
            return 6;
        }
        return i13 == 2 ? 3 : 2;
    }
}
