package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p20 extends f2.w {
    public final /* synthetic */ s50 c;

    public p20(s50 s50Var) {
        this.c = s50Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        m50 m50Var;
        int i11;
        int i12;
        int i13 = s50.B3 ? 6 : 2;
        if (s50.C3 || i10 < (i11 = (m50Var = this.c.L).C) || i10 >= (i12 = m50Var.D)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!s50.B3 && i14 % 2 == 0)) ? 1 : 2;
        if (!s50.B3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
