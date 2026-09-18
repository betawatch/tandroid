package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class is0 extends g.p {
    public final /* synthetic */ gs0 c;
    public final /* synthetic */ kv0 d;

    public is0(kv0 kv0Var, gs0 gs0Var) {
        this.d = kv0Var;
        this.c = gs0Var;
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
        kv0 kv0Var = this.d;
        int[] iArr = kv0Var.m1;
        yt0 yt0Var = kv0Var.O;
        gs0 gs0Var = this.c;
        int i11 = iArr[kv0.p0(gs0Var.F) ? 1 : 0];
        s4.h0 adapter = gs0Var.h.getAdapter();
        pt0 pt0Var = kv0Var.H;
        if (adapter != pt0Var) {
            if (kv0.u(kv0Var, gs0Var.h.getAdapter()) == -1) {
                if (gs0Var.h.getAdapter() != yt0Var) {
                    i11 = gs0Var.x.J;
                } else if (gs0Var.h.getAdapter() == yt0Var && kv0Var.t1[5].a.isEmpty()) {
                    i11 = gs0Var.x.J;
                } else {
                    hs0 hs0Var = gs0Var.x;
                    hs0Var.B1();
                    i11 = hs0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, gs0Var.x.J);
    }
}
