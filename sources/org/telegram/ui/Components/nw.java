package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class nw extends g.p {
    public final /* synthetic */ ly c;

    public nw(ly lyVar) {
        this.c = lyVar;
    }

    @Override // g.p
    public final int i(int i7) {
        ly lyVar = this.c;
        vw vwVar = lyVar.S;
        mw mwVar = lyVar.R;
        v4.h0 adapter = lyVar.Q.getAdapter();
        lx lxVar = lyVar.T;
        if (adapter == lxVar) {
            int d = lxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return mwVar.J;
            }
        } else if ((lyVar.e0 && i7 == 0) || i7 == vwVar.d || i7 == vwVar.c || i7 == vwVar.f || vwVar.r.indexOfKey(i7) >= 0 || vwVar.w.indexOfKey(i7) >= 0) {
            return mwVar.J;
        }
        return 1;
    }
}
