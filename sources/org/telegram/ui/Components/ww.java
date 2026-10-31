package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ww extends g.o {
    public final /* synthetic */ vy c;

    public ww(vy vyVar) {
        this.c = vyVar;
    }

    @Override // g.o
    public final int i(int i10) {
        vy vyVar = this.c;
        ex exVar = vyVar.R;
        vw vwVar = vyVar.Q;
        s4.g0 adapter = vyVar.P.getAdapter();
        ux uxVar = vyVar.S;
        if (adapter == uxVar) {
            int d = uxVar.d(i10);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return vwVar.J;
            }
        } else if ((vyVar.d0 && i10 == 0) || i10 == exVar.d || i10 == exVar.c || i10 == exVar.f || exVar.r.indexOfKey(i10) >= 0 || exVar.w.indexOfKey(i10) >= 0) {
            return vwVar.J;
        }
        return 1;
    }
}
