package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cq0 extends g.p {
    public final /* synthetic */ aq0 c;
    public final /* synthetic */ ys0 d;

    public cq0(ys0 ys0Var, aq0 aq0Var) {
        this.d = ys0Var;
        this.c = aq0Var;
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
    @Override // g.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i7) {
        ys0 ys0Var = this.d;
        int[] iArr = ys0Var.p1;
        or0 or0Var = ys0Var.R;
        aq0 aq0Var = this.c;
        int i10 = iArr[ys0.z0(aq0Var.F) ? 1 : 0];
        v4.h0 adapter = aq0Var.h.getAdapter();
        fr0 fr0Var = ys0Var.K;
        if (adapter != fr0Var) {
            if (ys0.x(ys0Var, aq0Var.h.getAdapter()) == -1) {
                if (aq0Var.h.getAdapter() != or0Var) {
                    i10 = aq0Var.x.J;
                } else if (aq0Var.h.getAdapter() == or0Var && ys0Var.w1[5].a.isEmpty()) {
                    i10 = aq0Var.x.J;
                } else {
                    bq0 bq0Var = aq0Var.x;
                    bq0Var.B1();
                    i10 = bq0Var.R.get(i7);
                }
            }
        }
        return Math.min(i10, aq0Var.x.J);
    }
}
