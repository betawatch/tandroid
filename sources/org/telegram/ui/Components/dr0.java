package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dr0 extends f2.w {
    public final /* synthetic */ br0 c;
    public final /* synthetic */ hu0 d;

    public dr0(hu0 hu0Var, br0 br0Var) {
        this.d = hu0Var;
        this.c = br0Var;
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
    @Override // f2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i10) {
        hu0 hu0Var = this.d;
        int[] iArr = hu0Var.i1;
        us0 us0Var = hu0Var.K;
        br0 br0Var = this.c;
        int i11 = iArr[hu0.p0(br0Var.B) ? 1 : 0];
        f2.q0 adapter = br0Var.h.getAdapter();
        ls0 ls0Var = hu0Var.D;
        if (adapter != ls0Var) {
            if (hu0.u(hu0Var, br0Var.h.getAdapter()) == -1) {
                if (br0Var.h.getAdapter() != us0Var) {
                    i11 = br0Var.x.J;
                } else if (br0Var.h.getAdapter() == us0Var && hu0Var.p1[5].a.isEmpty()) {
                    i11 = br0Var.x.J;
                } else {
                    cr0 cr0Var = br0Var.x;
                    cr0Var.B1();
                    i11 = cr0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, br0Var.x.J);
    }
}
