package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vr0 extends f2.v {
    public final /* synthetic */ tr0 c;
    public final /* synthetic */ yu0 d;

    public vr0(yu0 yu0Var, tr0 tr0Var) {
        this.d = yu0Var;
        this.c = tr0Var;
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
        yu0 yu0Var = this.d;
        int[] iArr = yu0Var.j1;
        lt0 lt0Var = yu0Var.L;
        tr0 tr0Var = this.c;
        int i11 = iArr[yu0.p0(tr0Var.C) ? 1 : 0];
        f2.p0 adapter = tr0Var.h.getAdapter();
        ct0 ct0Var = yu0Var.E;
        if (adapter != ct0Var) {
            if (yu0.u(yu0Var, tr0Var.h.getAdapter()) == -1) {
                if (tr0Var.h.getAdapter() != lt0Var) {
                    i11 = tr0Var.x.J;
                } else if (tr0Var.h.getAdapter() == lt0Var && yu0Var.q1[5].a.isEmpty()) {
                    i11 = tr0Var.x.J;
                } else {
                    ur0 ur0Var = tr0Var.x;
                    ur0Var.B1();
                    i11 = ur0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, tr0Var.x.J);
    }
}
