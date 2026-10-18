package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class qs0 extends g.o {
    public final /* synthetic */ os0 c;
    public final /* synthetic */ sv0 d;

    public qs0(sv0 sv0Var, os0 os0Var) {
        this.d = sv0Var;
        this.c = os0Var;
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
        sv0 sv0Var = this.d;
        int[] iArr = sv0Var.m1;
        gu0 gu0Var = sv0Var.O;
        os0 os0Var = this.c;
        int i11 = iArr[sv0.q0(os0Var.F) ? 1 : 0];
        s4.g0 adapter = os0Var.h.getAdapter();
        xt0 xt0Var = sv0Var.H;
        if (adapter != xt0Var) {
            if (sv0.v(sv0Var, os0Var.h.getAdapter()) == -1) {
                if (os0Var.h.getAdapter() != gu0Var) {
                    i11 = os0Var.x.J;
                } else if (os0Var.h.getAdapter() == gu0Var && sv0Var.t1[5].a.isEmpty()) {
                    i11 = os0Var.x.J;
                } else {
                    ps0 ps0Var = os0Var.x;
                    ps0Var.B1();
                    i11 = ps0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, os0Var.x.J);
    }
}
