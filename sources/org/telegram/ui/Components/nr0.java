package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nr0 extends f2.v {
    public final /* synthetic */ lr0 c;
    public final /* synthetic */ qu0 d;

    public nr0(qu0 qu0Var, lr0 lr0Var) {
        this.d = qu0Var;
        this.c = lr0Var;
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
        qu0 qu0Var = this.d;
        int[] iArr = qu0Var.i1;
        dt0 dt0Var = qu0Var.K;
        lr0 lr0Var = this.c;
        int i11 = iArr[qu0.p0(lr0Var.B) ? 1 : 0];
        f2.p0 adapter = lr0Var.h.getAdapter();
        us0 us0Var = qu0Var.D;
        if (adapter != us0Var) {
            if (qu0.u(qu0Var, lr0Var.h.getAdapter()) == -1) {
                if (lr0Var.h.getAdapter() != dt0Var) {
                    i11 = lr0Var.x.J;
                } else if (lr0Var.h.getAdapter() == dt0Var && qu0Var.p1[5].a.isEmpty()) {
                    i11 = lr0Var.x.J;
                } else {
                    mr0 mr0Var = lr0Var.x;
                    mr0Var.B1();
                    i11 = mr0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, lr0Var.x.J);
    }
}
