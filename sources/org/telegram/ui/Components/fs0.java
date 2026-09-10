package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fs0 extends g.p {
    public final /* synthetic */ ds0 c;
    public final /* synthetic */ iv0 d;

    public fs0(iv0 iv0Var, ds0 ds0Var) {
        this.d = iv0Var;
        this.c = ds0Var;
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
    @Override // g.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i10) {
        iv0 iv0Var = this.d;
        int[] iArr = iv0Var.m1;
        vt0 vt0Var = iv0Var.O;
        ds0 ds0Var = this.c;
        int i11 = iArr[iv0.p0(ds0Var.F) ? 1 : 0];
        s4.h0 adapter = ds0Var.h.getAdapter();
        mt0 mt0Var = iv0Var.H;
        if (adapter != mt0Var) {
            if (iv0.u(iv0Var, ds0Var.h.getAdapter()) == -1) {
                if (ds0Var.h.getAdapter() != vt0Var) {
                    i11 = ds0Var.x.J;
                } else if (ds0Var.h.getAdapter() == vt0Var && iv0Var.t1[5].a.isEmpty()) {
                    i11 = ds0Var.x.J;
                } else {
                    es0 es0Var = ds0Var.x;
                    es0Var.B1();
                    i11 = es0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, ds0Var.x.J);
    }
}
