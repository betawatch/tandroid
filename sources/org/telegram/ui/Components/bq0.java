package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class bq0 extends g.p {
    public final /* synthetic */ zp0 c;
    public final /* synthetic */ xs0 d;

    public bq0(xs0 xs0Var, zp0 zp0Var) {
        this.d = xs0Var;
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
        xs0 xs0Var = this.d;
        int[] iArr = xs0Var.o1;
        nr0 nr0Var = xs0Var.Q;
        zp0 zp0Var = this.c;
        int i10 = iArr[xs0.z0(zp0Var.E) ? 1 : 0];
        v4.g0 adapter = zp0Var.h.getAdapter();
        dr0 dr0Var = xs0Var.J;
        if (adapter != dr0Var) {
            if (xs0.x(xs0Var, zp0Var.h.getAdapter()) == -1) {
                if (zp0Var.h.getAdapter() != nr0Var) {
                    i10 = zp0Var.x.J;
                } else if (zp0Var.h.getAdapter() == nr0Var && xs0Var.v1[5].a.isEmpty()) {
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
