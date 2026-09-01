package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mx extends f2.v {
    public final /* synthetic */ mz c;

    public mx(mz mzVar) {
        this.c = mzVar;
    }

    @Override // f2.v
    public final int i(int i10) {
        mz mzVar = this.c;
        tx txVar = mzVar.O;
        lx lxVar = mzVar.N;
        f2.p0 adapter = mzVar.M.getAdapter();
        ly lyVar = mzVar.P;
        if (adapter == lyVar) {
            int j10 = lyVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return lxVar.J;
            }
        } else if ((mzVar.a0 && i10 == 0) || i10 == txVar.d || i10 == txVar.c || i10 == txVar.f || txVar.r.indexOfKey(i10) >= 0 || txVar.v.indexOfKey(i10) >= 0) {
            return lxVar.J;
        }
        return 1;
    }
}
