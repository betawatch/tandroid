package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class mq0 extends g.p {
    public final /* synthetic */ kq0 c;
    public final /* synthetic */ jt0 d;

    public mq0(jt0 jt0Var, kq0 kq0Var) {
        this.d = jt0Var;
        this.c = kq0Var;
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
        jt0 jt0Var = this.d;
        int[] iArr = jt0Var.p1;
        yr0 yr0Var = jt0Var.R;
        kq0 kq0Var = this.c;
        int i10 = iArr[jt0.z0(kq0Var.F) ? 1 : 0];
        v4.i0 adapter = kq0Var.h.getAdapter();
        pr0 pr0Var = jt0Var.K;
        if (adapter != pr0Var) {
            if (jt0.x(jt0Var, kq0Var.h.getAdapter()) == -1) {
                if (kq0Var.h.getAdapter() != yr0Var) {
                    i10 = kq0Var.x.J;
                } else if (kq0Var.h.getAdapter() == yr0Var && jt0Var.w1[5].a.isEmpty()) {
                    i10 = kq0Var.x.J;
                } else {
                    lq0 lq0Var = kq0Var.x;
                    lq0Var.B1();
                    i10 = lq0Var.R.get(i7);
                }
            }
        }
        return Math.min(i10, kq0Var.x.J);
    }
}
