package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wx extends g.o {
    public final /* synthetic */ wz c;

    public wx(wz wzVar) {
        this.c = wzVar;
    }

    @Override // g.o
    public final int i(int i10) {
        wz wzVar = this.c;
        fy fyVar = wzVar.R;
        vx vxVar = wzVar.Q;
        s4.g0 adapter = wzVar.P.getAdapter();
        vy vyVar = wzVar.S;
        if (adapter == vyVar) {
            int j10 = vyVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return vxVar.J;
            }
        } else if ((wzVar.d0 && i10 == 0) || i10 == fyVar.d || i10 == fyVar.c || i10 == fyVar.f || fyVar.r.indexOfKey(i10) >= 0 || fyVar.v.indexOfKey(i10) >= 0) {
            return vxVar.J;
        }
        return 1;
    }
}
