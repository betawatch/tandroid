package org.telegram.ui.Components;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ss0 extends g.o {
    public final /* synthetic */ qs0 c;
    public final /* synthetic */ uv0 d;

    public ss0(uv0 uv0Var, qs0 qs0Var) {
        this.d = uv0Var;
        this.c = qs0Var;
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
    @Override // g.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i10) {
        uv0 uv0Var = this.d;
        int[] iArr = uv0Var.m1;
        iu0 iu0Var = uv0Var.O;
        qs0 qs0Var = this.c;
        int i11 = iArr[uv0.q0(qs0Var.F) ? 1 : 0];
        s4.g0 adapter = qs0Var.h.getAdapter();
        zt0 zt0Var = uv0Var.H;
        if (adapter != zt0Var) {
            if (uv0.v(uv0Var, qs0Var.h.getAdapter()) == -1) {
                if (qs0Var.h.getAdapter() != iu0Var) {
                    i11 = qs0Var.x.J;
                } else if (qs0Var.h.getAdapter() == iu0Var && uv0Var.t1[5].a.isEmpty()) {
                    i11 = qs0Var.x.J;
                } else {
                    rs0 rs0Var = qs0Var.x;
                    rs0Var.B1();
                    i11 = rs0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, qs0Var.x.J);
    }
}
