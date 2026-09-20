package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class lx extends g.p {
    public final /* synthetic */ kz c;

    public lx(kz kzVar) {
        this.c = kzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        kz kzVar = this.c;
        tx txVar = kzVar.R;
        kx kxVar = kzVar.Q;
        s4.h0 adapter = kzVar.P.getAdapter();
        ky kyVar = kzVar.S;
        if (adapter == kyVar) {
            int j3 = kyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return kxVar.J;
            }
        } else if ((kzVar.d0 && i10 == 0) || i10 == txVar.d || i10 == txVar.c || i10 == txVar.f || txVar.r.indexOfKey(i10) >= 0 || txVar.v.indexOfKey(i10) >= 0) {
            return kxVar.J;
        }
        return 1;
    }
}
