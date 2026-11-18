package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class kq0 extends g.p {
    public final /* synthetic */ iq0 c;
    public final /* synthetic */ gt0 d;

    public kq0(gt0 gt0Var, iq0 iq0Var) {
        this.d = gt0Var;
        this.c = iq0Var;
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
        gt0 gt0Var = this.d;
        int[] iArr = gt0Var.p1;
        wr0 wr0Var = gt0Var.R;
        iq0 iq0Var = this.c;
        int i10 = iArr[gt0.z0(iq0Var.F) ? 1 : 0];
        v4.i0 adapter = iq0Var.h.getAdapter();
        nr0 nr0Var = gt0Var.K;
        if (adapter != nr0Var) {
            if (gt0.x(gt0Var, iq0Var.h.getAdapter()) == -1) {
                if (iq0Var.h.getAdapter() != wr0Var) {
                    i10 = iq0Var.x.J;
                } else if (iq0Var.h.getAdapter() == wr0Var && gt0Var.w1[5].a.isEmpty()) {
                    i10 = iq0Var.x.J;
                } else {
                    jq0 jq0Var = iq0Var.x;
                    jq0Var.B1();
                    i10 = jq0Var.R.get(i7);
                }
            }
        }
        return Math.min(i10, iq0Var.x.J);
    }
}
