package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xr0 extends g.p {
    public final /* synthetic */ vr0 c;
    public final /* synthetic */ zu0 d;

    public xr0(zu0 zu0Var, vr0 vr0Var) {
        this.d = zu0Var;
        this.c = vr0Var;
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
        zu0 zu0Var = this.d;
        int[] iArr = zu0Var.m1;
        nt0 nt0Var = zu0Var.O;
        vr0 vr0Var = this.c;
        int i11 = iArr[zu0.p0(vr0Var.F) ? 1 : 0];
        s4.h0 adapter = vr0Var.h.getAdapter();
        et0 et0Var = zu0Var.H;
        if (adapter != et0Var) {
            if (zu0.u(zu0Var, vr0Var.h.getAdapter()) == -1) {
                if (vr0Var.h.getAdapter() != nt0Var) {
                    i11 = vr0Var.x.J;
                } else if (vr0Var.h.getAdapter() == nt0Var && zu0Var.t1[5].a.isEmpty()) {
                    i11 = vr0Var.x.J;
                } else {
                    wr0 wr0Var = vr0Var.x;
                    wr0Var.B1();
                    i11 = wr0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, vr0Var.x.J);
    }
}
