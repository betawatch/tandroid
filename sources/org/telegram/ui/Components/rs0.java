package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class rs0 extends g.o {
    public final /* synthetic */ ps0 c;
    public final /* synthetic */ tv0 d;

    public rs0(tv0 tv0Var, ps0 ps0Var) {
        this.d = tv0Var;
        this.c = ps0Var;
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
    @Override // g.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i10) {
        tv0 tv0Var = this.d;
        int[] iArr = tv0Var.m1;
        hu0 hu0Var = tv0Var.O;
        ps0 ps0Var = this.c;
        int i11 = iArr[tv0.q0(ps0Var.F) ? 1 : 0];
        s4.g0 adapter = ps0Var.h.getAdapter();
        yt0 yt0Var = tv0Var.H;
        if (adapter != yt0Var) {
            if (tv0.v(tv0Var, ps0Var.h.getAdapter()) == -1) {
                if (ps0Var.h.getAdapter() != hu0Var) {
                    i11 = ps0Var.x.J;
                } else if (ps0Var.h.getAdapter() == hu0Var && tv0Var.t1[5].a.isEmpty()) {
                    i11 = ps0Var.x.J;
                } else {
                    qs0 qs0Var = ps0Var.x;
                    qs0Var.B1();
                    i11 = qs0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, ps0Var.x.J);
    }
}
