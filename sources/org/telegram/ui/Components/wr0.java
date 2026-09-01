package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wr0 extends f2.v {
    public final /* synthetic */ ur0 c;
    public final /* synthetic */ zu0 d;

    public wr0(zu0 zu0Var, ur0 ur0Var) {
        this.d = zu0Var;
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
    @Override // f2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i10) {
        zu0 zu0Var = this.d;
        int[] iArr = zu0Var.j1;
        mt0 mt0Var = zu0Var.L;
        ur0 ur0Var = this.c;
        int i11 = iArr[zu0.p0(ur0Var.C) ? 1 : 0];
        f2.p0 adapter = ur0Var.h.getAdapter();
        dt0 dt0Var = zu0Var.E;
        if (adapter != dt0Var) {
            if (zu0.u(zu0Var, ur0Var.h.getAdapter()) == -1) {
                if (ur0Var.h.getAdapter() != mt0Var) {
                    i11 = ur0Var.x.J;
                } else if (ur0Var.h.getAdapter() == mt0Var && zu0Var.q1[5].a.isEmpty()) {
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
