package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class kx extends f2.v {
    public final /* synthetic */ kz c;

    public kx(kz kzVar) {
        this.c = kzVar;
    }

    @Override // f2.v
    public final int i(int i10) {
        kz kzVar = this.c;
        rx rxVar = kzVar.O;
        jx jxVar = kzVar.N;
        f2.o0 adapter = kzVar.M.getAdapter();
        jy jyVar = kzVar.P;
        if (adapter == jyVar) {
            int j10 = jyVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return jxVar.J;
            }
        } else if ((kzVar.a0 && i10 == 0) || i10 == rxVar.d || i10 == rxVar.c || i10 == rxVar.f || rxVar.r.indexOfKey(i10) >= 0 || rxVar.v.indexOfKey(i10) >= 0) {
            return jxVar.J;
        }
        return 1;
    }
}
