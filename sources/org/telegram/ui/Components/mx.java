package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class mx extends g.p {
    public final /* synthetic */ kz c;

    public mx(kz kzVar) {
        this.c = kzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        kz kzVar = this.c;
        tx txVar = kzVar.R;
        lx lxVar = kzVar.Q;
        s4.h0 adapter = kzVar.P.getAdapter();
        ky kyVar = kzVar.S;
        if (adapter == kyVar) {
            int j3 = kyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return lxVar.J;
            }
        } else if ((kzVar.d0 && i10 == 0) || i10 == txVar.d || i10 == txVar.c || i10 == txVar.f || txVar.r.indexOfKey(i10) >= 0 || txVar.v.indexOfKey(i10) >= 0) {
            return lxVar.J;
        }
        return 1;
    }
}
