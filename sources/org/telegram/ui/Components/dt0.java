package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dt0 extends g.o {
    public final /* synthetic */ bt0 c;
    public final /* synthetic */ bw0 d;

    public dt0(bw0 bw0Var, bt0 bt0Var) {
        this.d = bw0Var;
        this.c = bt0Var;
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
        int[] iArr = bw0Var.o1;
        pu0 pu0Var = bw0Var.Q;
        bt0 bt0Var = this.c;
        int i11 = iArr[bw0.w0(bt0Var.E) ? 1 : 0];
        s4.h0 adapter = bt0Var.h.getAdapter();
        fu0 fu0Var = bw0Var.J;
        if (adapter != fu0Var) {
            if (bw0.w(bw0Var, bt0Var.h.getAdapter()) == -1) {
                if (bt0Var.h.getAdapter() != pu0Var) {
                    i11 = bt0Var.w.J;
                } else if (bt0Var.h.getAdapter() == pu0Var && bw0Var.v1[5].a.isEmpty()) {
                    i11 = bt0Var.w.J;
                } else {
                    ct0 ct0Var = bt0Var.w;
                    ct0Var.C1();
                    i11 = ct0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, bt0Var.w.J);
    }
}
