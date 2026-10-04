package org.telegram.ui.Components;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ns0 extends g.p {
    public final /* synthetic */ ls0 c;
    public final /* synthetic */ pv0 d;

    public ns0(pv0 pv0Var, ls0 ls0Var) {
        this.d = pv0Var;
        this.c = ls0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r3.h.getAdapter().j(r9) == 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r5.j(r9) == 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r1 = 1;
     */
    @Override // g.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i10) {
        pv0 pv0Var = this.d;
        int[] iArr = pv0Var.m1;
        du0 du0Var = pv0Var.O;
        ls0 ls0Var = this.c;
        int i11 = iArr[pv0.p0(ls0Var.F) ? 1 : 0];
        s4.h0 adapter = ls0Var.h.getAdapter();
        ut0 ut0Var = pv0Var.H;
        if (adapter != ut0Var) {
            if (pv0.u(pv0Var, ls0Var.h.getAdapter()) == -1) {
                if (ls0Var.h.getAdapter() != du0Var) {
                    i11 = ls0Var.x.J;
                } else if (ls0Var.h.getAdapter() == du0Var && pv0Var.t1[5].a.isEmpty()) {
                    i11 = ls0Var.x.J;
                } else {
                    ms0 ms0Var = ls0Var.x;
                    ms0Var.B1();
                    i11 = ms0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, ls0Var.x.J);
    }
}
