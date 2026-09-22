package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class js0 extends g.p {
    public final /* synthetic */ hs0 c;
    public final /* synthetic */ lv0 d;

    public js0(lv0 lv0Var, hs0 hs0Var) {
        this.d = lv0Var;
        this.c = hs0Var;
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
        lv0 lv0Var = this.d;
        int[] iArr = lv0Var.m1;
        zt0 zt0Var = lv0Var.O;
        hs0 hs0Var = this.c;
        int i11 = iArr[lv0.p0(hs0Var.F) ? 1 : 0];
        s4.h0 adapter = hs0Var.h.getAdapter();
        qt0 qt0Var = lv0Var.H;
        if (adapter != qt0Var) {
            if (lv0.u(lv0Var, hs0Var.h.getAdapter()) == -1) {
                if (hs0Var.h.getAdapter() != zt0Var) {
                    i11 = hs0Var.x.J;
                } else if (hs0Var.h.getAdapter() == zt0Var && lv0Var.t1[5].a.isEmpty()) {
                    i11 = hs0Var.x.J;
                } else {
                    is0 is0Var = hs0Var.x;
                    is0Var.B1();
                    i11 = is0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, hs0Var.x.J);
    }
}
