package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class os0 extends g.p {
    public final /* synthetic */ ms0 c;
    public final /* synthetic */ qv0 d;

    public os0(qv0 qv0Var, ms0 ms0Var) {
        this.d = qv0Var;
        this.c = ms0Var;
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
        qv0 qv0Var = this.d;
        int[] iArr = qv0Var.m1;
        eu0 eu0Var = qv0Var.O;
        ms0 ms0Var = this.c;
        int i11 = iArr[qv0.p0(ms0Var.F) ? 1 : 0];
        s4.h0 adapter = ms0Var.h.getAdapter();
        vt0 vt0Var = qv0Var.H;
        if (adapter != vt0Var) {
            if (qv0.u(qv0Var, ms0Var.h.getAdapter()) == -1) {
                if (ms0Var.h.getAdapter() != eu0Var) {
                    i11 = ms0Var.x.J;
                } else if (ms0Var.h.getAdapter() == eu0Var && qv0Var.t1[5].a.isEmpty()) {
                    i11 = ms0Var.x.J;
                } else {
                    ns0 ns0Var = ms0Var.x;
                    ns0Var.B1();
                    i11 = ns0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, ms0Var.x.J);
    }
}
