package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ay extends g.o {
    public final /* synthetic */ a00 c;

    public ay(a00 a00Var) {
        this.c = a00Var;
    }

    @Override // g.o
    public final int i(int i10) {
        a00 a00Var = this.c;
        jy jyVar = a00Var.R;
        zx zxVar = a00Var.Q;
        s4.i0 adapter = a00Var.P.getAdapter();
        zy zyVar = a00Var.S;
        if (adapter == zyVar) {
            int j3 = zyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return zxVar.J;
            }
        } else if ((a00Var.d0 && i10 == 0) || i10 == jyVar.d || i10 == jyVar.c || i10 == jyVar.f || jyVar.r.indexOfKey(i10) >= 0 || jyVar.v.indexOfKey(i10) >= 0) {
            return zxVar.J;
        }
        return 1;
    }
}
