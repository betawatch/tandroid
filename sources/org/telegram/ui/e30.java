package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e30 extends f2.v {
    public final /* synthetic */ e60 c;

    public e30(e60 e60Var) {
        this.c = e60Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        y50 y50Var;
        int i11;
        int i12;
        int i13 = e60.C3 ? 6 : 2;
        if (e60.D3 || i10 < (i11 = (y50Var = this.c.M).D) || i10 >= (i12 = y50Var.E)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!e60.C3 && i14 % 2 == 0)) ? 1 : 2;
        if (!e60.C3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
