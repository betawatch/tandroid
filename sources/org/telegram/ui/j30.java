package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j30 extends g.p {
    public final /* synthetic */ k60 c;

    public j30(k60 k60Var) {
        this.c = k60Var;
    }

    @Override // g.p
    public final int i(int i10) {
        e60 e60Var;
        int i11;
        int i12;
        int i13 = k60.F3 ? 6 : 2;
        if (k60.G3 || i10 < (i11 = (e60Var = this.c.P).G) || i10 >= (i12 = e60Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!k60.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!k60.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
