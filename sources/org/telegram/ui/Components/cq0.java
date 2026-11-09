package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cq0 extends g.p {
    public final /* synthetic */ aq0 c;
    public final /* synthetic */ zs0 d;

    public cq0(zs0 zs0Var, aq0 aq0Var) {
        this.d = zs0Var;
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
        zs0 zs0Var = this.d;
        int[] iArr = zs0Var.o1;
        pr0 pr0Var = zs0Var.Q;
        aq0 aq0Var = this.c;
        int i10 = iArr[zs0.z0(aq0Var.E) ? 1 : 0];
        v4.g0 adapter = aq0Var.h.getAdapter();
        fr0 fr0Var = zs0Var.J;
        if (adapter != fr0Var) {
            if (zs0.x(zs0Var, aq0Var.h.getAdapter()) == -1) {
                if (aq0Var.h.getAdapter() != pr0Var) {
                    i10 = aq0Var.x.J;
                } else if (aq0Var.h.getAdapter() == pr0Var && zs0Var.v1[5].a.isEmpty()) {
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
