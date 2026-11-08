package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class iw extends g.p {
    public final /* synthetic */ hy c;

    public iw(hy hyVar) {
        this.c = hyVar;
    }

    @Override // g.p
    public final int i(int i7) {
        hy hyVar = this.c;
        qw qwVar = hyVar.R;
        hw hwVar = hyVar.Q;
        v4.g0 adapter = hyVar.P.getAdapter();
        hx hxVar = hyVar.S;
        if (adapter == hxVar) {
            int d = hxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return hwVar.J;
            }
        } else if ((hyVar.d0 && i7 == 0) || i7 == qwVar.d || i7 == qwVar.c || i7 == qwVar.f || qwVar.r.indexOfKey(i7) >= 0 || qwVar.w.indexOfKey(i7) >= 0) {
            return hwVar.J;
        }
        return 1;
    }
}
