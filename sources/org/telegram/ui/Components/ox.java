package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ox extends g.p {
    public final /* synthetic */ nz c;

    public ox(nz nzVar) {
        this.c = nzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        nz nzVar = this.c;
        wx wxVar = nzVar.R;
        nx nxVar = nzVar.Q;
        s4.h0 adapter = nzVar.P.getAdapter();
        ny nyVar = nzVar.S;
        if (adapter == nyVar) {
            int j3 = nyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return nxVar.J;
            }
        } else if ((nzVar.d0 && i10 == 0) || i10 == wxVar.d || i10 == wxVar.c || i10 == wxVar.f || wxVar.r.indexOfKey(i10) >= 0 || wxVar.v.indexOfKey(i10) >= 0) {
            return nxVar.J;
        }
        return 1;
    }
}
