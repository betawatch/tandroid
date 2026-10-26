package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rx extends g.o {
    public final /* synthetic */ sz c;

    public rx(sz szVar) {
        this.c = szVar;
    }

    @Override // g.o
    public final int i(int i10) {
        sz szVar = this.c;
        zx zxVar = szVar.R;
        qx qxVar = szVar.Q;
        s4.h0 adapter = szVar.P.getAdapter();
        sy syVar = szVar.S;
        if (adapter == syVar) {
            int j10 = syVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return qxVar.J;
            }
        } else if ((szVar.d0 && i10 == 0) || i10 == zxVar.d || i10 == zxVar.c || i10 == zxVar.f || zxVar.r.indexOfKey(i10) >= 0 || zxVar.v.indexOfKey(i10) >= 0) {
            return qxVar.J;
        }
        return 1;
    }
}
