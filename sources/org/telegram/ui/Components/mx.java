package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class mx extends g.p {
    public final /* synthetic */ lz c;

    public mx(lz lzVar) {
        this.c = lzVar;
    }

    @Override // g.p
    public final int i(int i10) {
        lz lzVar = this.c;
        ux uxVar = lzVar.R;
        lx lxVar = lzVar.Q;
        s4.h0 adapter = lzVar.P.getAdapter();
        ly lyVar = lzVar.S;
        if (adapter == lyVar) {
            int j3 = lyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return lxVar.J;
            }
        } else if ((lzVar.d0 && i10 == 0) || i10 == uxVar.d || i10 == uxVar.c || i10 == uxVar.f || uxVar.r.indexOfKey(i10) >= 0 || uxVar.v.indexOfKey(i10) >= 0) {
            return lxVar.J;
        }
        return 1;
    }
}
