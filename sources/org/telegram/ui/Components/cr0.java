package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cr0 extends f2.x {
    public final /* synthetic */ ar0 c;
    public final /* synthetic */ eu0 d;

    public cr0(eu0 eu0Var, ar0 ar0Var) {
        this.d = eu0Var;
        this.c = ar0Var;
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
    @Override // f2.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i9) {
        eu0 eu0Var = this.d;
        int[] iArr = eu0Var.i1;
        ss0 ss0Var = eu0Var.K;
        ar0 ar0Var = this.c;
        int i10 = iArr[eu0.p0(ar0Var.B) ? 1 : 0];
        f2.r0 adapter = ar0Var.h.getAdapter();
        js0 js0Var = eu0Var.D;
        if (adapter != js0Var) {
            if (eu0.u(eu0Var, ar0Var.h.getAdapter()) == -1) {
                if (ar0Var.h.getAdapter() != ss0Var) {
                    i10 = ar0Var.x.J;
                } else if (ar0Var.h.getAdapter() == ss0Var && eu0Var.p1[5].a.isEmpty()) {
                    i10 = ar0Var.x.J;
                } else {
                    br0 br0Var = ar0Var.x;
                    br0Var.B1();
                    i10 = br0Var.R.get(i9);
                }
            }
        }
        return Math.min(i10, ar0Var.x.J);
    }
}
