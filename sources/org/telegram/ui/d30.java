package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class d30 extends f2.v {
    public final /* synthetic */ d60 c;

    public d30(d60 d60Var) {
        this.c = d60Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        x50 x50Var;
        int i11;
        int i12;
        int i13 = d60.C3 ? 6 : 2;
        if (d60.D3 || i10 < (i11 = (x50Var = this.c.M).D) || i10 >= (i12 = x50Var.E)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!d60.C3 && i14 % 2 == 0)) ? 1 : 2;
        if (!d60.C3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
