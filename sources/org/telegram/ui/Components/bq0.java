package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bq0 extends g.p {
    public final /* synthetic */ zp0 c;
    public final /* synthetic */ ws0 d;

    public bq0(ws0 ws0Var, zp0 zp0Var) {
        this.d = ws0Var;
        this.c = zp0Var;
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
    public final int i(int i3) {
        ws0 ws0Var = this.d;
        int[] iArr = ws0Var.p1;
        mr0 mr0Var = ws0Var.R;
        zp0 zp0Var = this.c;
        int i10 = iArr[ws0.z0(zp0Var.F) ? 1 : 0];
        u4.h0 adapter = zp0Var.h.getAdapter();
        dr0 dr0Var = ws0Var.K;
        if (adapter != dr0Var) {
            if (ws0.x(ws0Var, zp0Var.h.getAdapter()) == -1) {
                if (zp0Var.h.getAdapter() != mr0Var) {
                    i10 = zp0Var.x.J;
                } else if (zp0Var.h.getAdapter() == mr0Var && ws0Var.w1[5].a.isEmpty()) {
                    i10 = zp0Var.x.J;
                } else {
                    aq0 aq0Var = zp0Var.x;
                    aq0Var.B1();
                    i10 = aq0Var.R.get(i3);
                }
            }
        }
        return Math.min(i10, zp0Var.x.J);
    }
}
