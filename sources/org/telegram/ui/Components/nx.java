package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class nx extends g.p {
    public final /* synthetic */ mz c;

    public nx(mz mzVar) {
        this.c = mzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        mz mzVar = this.c;
        vx vxVar = mzVar.R;
        mx mxVar = mzVar.Q;
        s4.h0 adapter = mzVar.P.getAdapter();
        my myVar = mzVar.S;
        if (adapter == myVar) {
            int j3 = myVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return mxVar.J;
            }
        } else if ((mzVar.d0 && i10 == 0) || i10 == vxVar.d || i10 == vxVar.c || i10 == vxVar.f || vxVar.r.indexOfKey(i10) >= 0 || vxVar.v.indexOfKey(i10) >= 0) {
            return mxVar.J;
        }
        return 1;
    }
}
