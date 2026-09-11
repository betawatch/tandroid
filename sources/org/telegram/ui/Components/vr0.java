package org.telegram.ui.Components;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class vr0 extends g.p {
    public final /* synthetic */ tr0 c;
    public final /* synthetic */ xu0 d;

    public vr0(xu0 xu0Var, tr0 tr0Var) {
        this.d = xu0Var;
        this.c = tr0Var;
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
        xu0 xu0Var = this.d;
        int[] iArr = xu0Var.m1;
        lt0 lt0Var = xu0Var.O;
        tr0 tr0Var = this.c;
        int i11 = iArr[xu0.p0(tr0Var.F) ? 1 : 0];
        s4.h0 adapter = tr0Var.h.getAdapter();
        ct0 ct0Var = xu0Var.H;
        if (adapter != ct0Var) {
            if (xu0.u(xu0Var, tr0Var.h.getAdapter()) == -1) {
                if (tr0Var.h.getAdapter() != lt0Var) {
                    i11 = tr0Var.x.J;
                } else if (tr0Var.h.getAdapter() == lt0Var && xu0Var.t1[5].a.isEmpty()) {
                    i11 = tr0Var.x.J;
                } else {
                    ur0 ur0Var = tr0Var.x;
                    ur0Var.B1();
                    i11 = ur0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, tr0Var.x.J);
    }
}
