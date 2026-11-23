package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sw extends g.p {
    public final /* synthetic */ qy c;

    public sw(qy qyVar) {
        this.c = qyVar;
    }

    @Override // g.p
    public final int i(int i7) {
        qy qyVar = this.c;
        ax axVar = qyVar.S;
        rw rwVar = qyVar.R;
        v4.i0 adapter = qyVar.Q.getAdapter();
        px pxVar = qyVar.T;
        if (adapter == pxVar) {
            int d = pxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return rwVar.J;
            }
        } else if ((qyVar.e0 && i7 == 0) || i7 == axVar.d || i7 == axVar.c || i7 == axVar.f || axVar.r.indexOfKey(i7) >= 0 || axVar.w.indexOfKey(i7) >= 0) {
            return rwVar.J;
        }
        return 1;
    }
}
