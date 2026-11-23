package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lq0 extends g.p {
    public final /* synthetic */ jq0 c;
    public final /* synthetic */ it0 d;

    public lq0(it0 it0Var, jq0 jq0Var) {
        this.d = it0Var;
        this.c = jq0Var;
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
        it0 it0Var = this.d;
        int[] iArr = it0Var.p1;
        xr0 xr0Var = it0Var.R;
        jq0 jq0Var = this.c;
        int i10 = iArr[it0.z0(jq0Var.F) ? 1 : 0];
        v4.i0 adapter = jq0Var.h.getAdapter();
        or0 or0Var = it0Var.K;
        if (adapter != or0Var) {
            if (it0.x(it0Var, jq0Var.h.getAdapter()) == -1) {
                if (jq0Var.h.getAdapter() != xr0Var) {
                    i10 = jq0Var.x.J;
                } else if (jq0Var.h.getAdapter() == xr0Var && it0Var.w1[5].a.isEmpty()) {
                    i10 = jq0Var.x.J;
                } else {
                    kq0 kq0Var = jq0Var.x;
                    kq0Var.B1();
                    i10 = kq0Var.R.get(i7);
                }
            }
        }
        return Math.min(i10, jq0Var.x.J);
    }
}
