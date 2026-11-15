package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int i12 = c40.E5 ? 6 : 2;
        if (c40.F5 || i7 < (i10 = (w30Var = this.c.K1).H) || i7 >= (i11 = w30Var.I)) {
            return i12;
        }
        int i13 = i11 - i10;
        int i14 = (i7 != i11 - 1 || (!c40.E5 && i13 % 2 == 0)) ? 1 : 2;
        if (!c40.E5) {
            return i14;
        }
        if (i13 == 1) {
            return 6;
        }
        return i13 == 2 ? 3 : 2;
    }
}
