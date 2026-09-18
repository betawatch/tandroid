package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class kx extends g.p {
    public final /* synthetic */ kz c;

    public kx(kz kzVar) {
        this.c = kzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        kz kzVar = this.c;
        sx sxVar = kzVar.R;
        jx jxVar = kzVar.Q;
        s4.h0 adapter = kzVar.P.getAdapter();
        jy jyVar = kzVar.S;
        if (adapter == jyVar) {
            int j3 = jyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return jxVar.J;
            }
        } else if ((kzVar.d0 && i10 == 0) || i10 == sxVar.d || i10 == sxVar.c || i10 == sxVar.f || sxVar.r.indexOfKey(i10) >= 0 || sxVar.v.indexOfKey(i10) >= 0) {
            return jxVar.J;
        }
        return 1;
    }
}
