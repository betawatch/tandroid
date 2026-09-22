package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class wr0 extends g.p {
    public final /* synthetic */ ur0 c;
    public final /* synthetic */ yu0 d;

    public wr0(yu0 yu0Var, ur0 ur0Var) {
        this.d = yu0Var;
        this.c = ur0Var;
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
        yu0 yu0Var = this.d;
        int[] iArr = yu0Var.m1;
        mt0 mt0Var = yu0Var.O;
        ur0 ur0Var = this.c;
        int i11 = iArr[yu0.p0(ur0Var.F) ? 1 : 0];
        s4.h0 adapter = ur0Var.h.getAdapter();
        dt0 dt0Var = yu0Var.H;
        if (adapter != dt0Var) {
            if (yu0.u(yu0Var, ur0Var.h.getAdapter()) == -1) {
                if (ur0Var.h.getAdapter() != mt0Var) {
                    i11 = ur0Var.x.J;
                } else if (ur0Var.h.getAdapter() == mt0Var && yu0Var.t1[5].a.isEmpty()) {
                    i11 = ur0Var.x.J;
                } else {
                    vr0 vr0Var = ur0Var.x;
                    vr0Var.B1();
                    i11 = vr0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, ur0Var.x.J);
    }
}
