package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rx extends g.p {
    public final /* synthetic */ rz c;

    public rx(rz rzVar) {
        this.c = rzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        rz rzVar = this.c;
        yx yxVar = rzVar.R;
        qx qxVar = rzVar.Q;
        s4.h0 adapter = rzVar.P.getAdapter();
        ry ryVar = rzVar.S;
        if (adapter == ryVar) {
            int j3 = ryVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return qxVar.J;
            }
        } else if ((rzVar.d0 && i10 == 0) || i10 == yxVar.d || i10 == yxVar.c || i10 == yxVar.f || yxVar.r.indexOfKey(i10) >= 0 || yxVar.v.indexOfKey(i10) >= 0) {
            return qxVar.J;
        }
        return 1;
    }
}
