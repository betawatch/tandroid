package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cr0 extends g.o {
    public final /* synthetic */ ar0 c;
    public final /* synthetic */ zt0 d;

    public cr0(zt0 zt0Var, ar0 ar0Var) {
        this.d = zt0Var;
        this.c = ar0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r3.h.getAdapter().d(r9) == 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r5.d(r9) == 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r1 = 1;
     */
    @Override // g.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i10) {
        zt0 zt0Var = this.d;
        int[] iArr = zt0Var.o1;
        ns0 ns0Var = zt0Var.Q;
        ar0 ar0Var = this.c;
        int i11 = iArr[zt0.x0(ar0Var.E) ? 1 : 0];
        s4.g0 adapter = ar0Var.h.getAdapter();
        es0 es0Var = zt0Var.J;
        if (adapter != es0Var) {
            if (zt0.v(zt0Var, ar0Var.h.getAdapter()) == -1) {
                if (ar0Var.h.getAdapter() != ns0Var) {
                    i11 = ar0Var.x.J;
                } else if (ar0Var.h.getAdapter() == ns0Var && zt0Var.v1[5].a.isEmpty()) {
                    i11 = ar0Var.x.J;
                } else {
                    br0 br0Var = ar0Var.x;
                    br0Var.B1();
                    i11 = br0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, ar0Var.x.J);
    }
}
