package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class lx extends g.p {
    public final /* synthetic */ lz c;

    public lx(lz lzVar) {
        this.c = lzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        lz lzVar = this.c;
        tx txVar = lzVar.R;
        kx kxVar = lzVar.Q;
        s4.h0 adapter = lzVar.P.getAdapter();
        ky kyVar = lzVar.S;
        if (adapter == kyVar) {
            int j3 = kyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return kxVar.J;
            }
        } else if ((lzVar.d0 && i10 == 0) || i10 == txVar.d || i10 == txVar.c || i10 == txVar.f || txVar.r.indexOfKey(i10) >= 0 || txVar.v.indexOfKey(i10) >= 0) {
            return kxVar.J;
        }
        return 1;
    }
}
