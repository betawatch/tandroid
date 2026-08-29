package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fx extends f2.v {
    public final /* synthetic */ fz c;

    public fx(fz fzVar) {
        this.c = fzVar;
    }

    @Override // f2.v
    public final int i(int i10) {
        fz fzVar = this.c;
        nx nxVar = fzVar.N;
        ex exVar = fzVar.M;
        f2.p0 adapter = fzVar.L.getAdapter();
        ey eyVar = fzVar.O;
        if (adapter == eyVar) {
            int j10 = eyVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return exVar.J;
            }
        } else if ((fzVar.W && i10 == 0) || i10 == nxVar.d || i10 == nxVar.c || i10 == nxVar.f || nxVar.r.indexOfKey(i10) >= 0 || nxVar.v.indexOfKey(i10) >= 0) {
            return exVar.J;
        }
        return 1;
    }
}
