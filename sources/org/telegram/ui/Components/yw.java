package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yw extends f2.x {
    public final /* synthetic */ wy c;

    public yw(wy wyVar) {
        this.c = wyVar;
    }

    @Override // f2.x
    public final int i(int i9) {
        wy wyVar = this.c;
        fx fxVar = wyVar.N;
        xw xwVar = wyVar.M;
        f2.r0 adapter = wyVar.L.getAdapter();
        vx vxVar = wyVar.O;
        if (adapter == vxVar) {
            int j10 = vxVar.j(i9);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return xwVar.J;
            }
        } else if ((wyVar.W && i9 == 0) || i9 == fxVar.d || i9 == fxVar.c || i9 == fxVar.f || fxVar.r.indexOfKey(i9) >= 0 || fxVar.v.indexOfKey(i9) >= 0) {
            return xwVar.J;
        }
        return 1;
    }
}
