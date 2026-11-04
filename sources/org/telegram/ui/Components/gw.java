package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gw extends g.p {
    public final /* synthetic */ ey c;

    public gw(ey eyVar) {
        this.c = eyVar;
    }

    @Override // g.p
    public final int i(int i3) {
        ey eyVar = this.c;
        ow owVar = eyVar.S;
        fw fwVar = eyVar.R;
        u4.h0 adapter = eyVar.Q.getAdapter();
        ex exVar = eyVar.T;
        if (adapter == exVar) {
            int d = exVar.d(i3);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return fwVar.J;
            }
        } else if ((eyVar.e0 && i3 == 0) || i3 == owVar.d || i3 == owVar.c || i3 == owVar.f || owVar.r.indexOfKey(i3) >= 0 || owVar.w.indexOfKey(i3) >= 0) {
            return fwVar.J;
        }
        return 1;
    }
}
