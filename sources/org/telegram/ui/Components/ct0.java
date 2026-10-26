package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ct0 extends g.o {
    public final /* synthetic */ at0 c;
    public final /* synthetic */ aw0 d;

    public ct0(aw0 aw0Var, at0 at0Var) {
        this.d = aw0Var;
        this.c = at0Var;
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
        aw0 aw0Var = this.d;
        int[] iArr = aw0Var.o1;
        ou0 ou0Var = aw0Var.Q;
        at0 at0Var = this.c;
        int i11 = iArr[aw0.w0(at0Var.E) ? 1 : 0];
        s4.h0 adapter = at0Var.h.getAdapter();
        eu0 eu0Var = aw0Var.J;
        if (adapter != eu0Var) {
            if (aw0.w(aw0Var, at0Var.h.getAdapter()) == -1) {
                if (at0Var.h.getAdapter() != ou0Var) {
                    i11 = at0Var.w.J;
                } else if (at0Var.h.getAdapter() == ou0Var && aw0Var.v1[5].a.isEmpty()) {
                    i11 = at0Var.w.J;
                } else {
                    bt0 bt0Var = at0Var.w;
                    bt0Var.C1();
                    i11 = bt0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, at0Var.w.J);
    }
}
