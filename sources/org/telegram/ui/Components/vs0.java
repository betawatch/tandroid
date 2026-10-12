package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class vs0 extends g.o {
    public final /* synthetic */ ts0 c;
    public final /* synthetic */ xv0 d;

    public vs0(xv0 xv0Var, ts0 ts0Var) {
        this.d = xv0Var;
        this.c = ts0Var;
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
        xv0 xv0Var = this.d;
        int[] iArr = xv0Var.m1;
        lu0 lu0Var = xv0Var.O;
        ts0 ts0Var = this.c;
        int i11 = iArr[xv0.p0(ts0Var.F) ? 1 : 0];
        s4.g0 adapter = ts0Var.h.getAdapter();
        cu0 cu0Var = xv0Var.H;
        if (adapter != cu0Var) {
            if (xv0.u(xv0Var, ts0Var.h.getAdapter()) == -1) {
                if (ts0Var.h.getAdapter() != lu0Var) {
                    i11 = ts0Var.x.J;
                } else if (ts0Var.h.getAdapter() == lu0Var && xv0Var.t1[5].a.isEmpty()) {
                    i11 = ts0Var.x.J;
                } else {
                    us0 us0Var = ts0Var.x;
                    us0Var.B1();
                    i11 = us0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, ts0Var.x.J);
    }
}
