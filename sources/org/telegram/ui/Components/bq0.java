package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bq0 extends g.p {
    public final /* synthetic */ zp0 c;
    public final /* synthetic */ ys0 d;

    public bq0(ys0 ys0Var, zp0 zp0Var) {
        this.d = ys0Var;
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
    public final int i(int i7) {
        ys0 ys0Var = this.d;
        int[] iArr = ys0Var.o1;
        or0 or0Var = ys0Var.Q;
        zp0 zp0Var = this.c;
        int i10 = iArr[ys0.z0(zp0Var.E) ? 1 : 0];
        v4.g0 adapter = zp0Var.h.getAdapter();
        er0 er0Var = ys0Var.J;
        if (adapter != er0Var) {
            if (ys0.x(ys0Var, zp0Var.h.getAdapter()) == -1) {
                if (zp0Var.h.getAdapter() != or0Var) {
                    i10 = zp0Var.x.J;
                } else if (zp0Var.h.getAdapter() == or0Var && ys0Var.v1[5].a.isEmpty()) {
                    i10 = zp0Var.x.J;
                } else {
                    aq0 aq0Var = zp0Var.x;
                    aq0Var.B1();
                    i10 = aq0Var.R.get(i7);
                }
            }
        }
        return Math.min(i10, zp0Var.x.J);
    }
}
