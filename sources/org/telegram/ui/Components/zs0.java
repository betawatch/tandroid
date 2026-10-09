package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zs0 extends g.o {
    public final /* synthetic */ xs0 c;
    public final /* synthetic */ bw0 d;

    public zs0(bw0 bw0Var, xs0 xs0Var) {
        this.d = bw0Var;
        this.c = xs0Var;
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
        bw0 bw0Var = this.d;
        int[] iArr = bw0Var.m1;
        pu0 pu0Var = bw0Var.O;
        xs0 xs0Var = this.c;
        int i11 = iArr[bw0.p0(xs0Var.F) ? 1 : 0];
        s4.i0 adapter = xs0Var.h.getAdapter();
        gu0 gu0Var = bw0Var.H;
        if (adapter != gu0Var) {
            if (bw0.u(bw0Var, xs0Var.h.getAdapter()) == -1) {
                if (xs0Var.h.getAdapter() != pu0Var) {
                    i11 = xs0Var.x.J;
                } else if (xs0Var.h.getAdapter() == pu0Var && bw0Var.t1[5].a.isEmpty()) {
                    i11 = xs0Var.x.J;
                } else {
                    ys0 ys0Var = xs0Var.x;
                    ys0Var.B1();
                    i11 = ys0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, xs0Var.x.J);
    }
}
