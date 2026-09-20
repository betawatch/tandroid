package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class hs0 extends g.p {
    public final /* synthetic */ fs0 c;
    public final /* synthetic */ jv0 d;

    public hs0(jv0 jv0Var, fs0 fs0Var) {
        this.d = jv0Var;
        this.c = fs0Var;
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
        jv0 jv0Var = this.d;
        int[] iArr = jv0Var.m1;
        xt0 xt0Var = jv0Var.O;
        fs0 fs0Var = this.c;
        int i11 = iArr[jv0.p0(fs0Var.F) ? 1 : 0];
        s4.h0 adapter = fs0Var.h.getAdapter();
        ot0 ot0Var = jv0Var.H;
        if (adapter != ot0Var) {
            if (jv0.u(jv0Var, fs0Var.h.getAdapter()) == -1) {
                if (fs0Var.h.getAdapter() != xt0Var) {
                    i11 = fs0Var.x.J;
                } else if (fs0Var.h.getAdapter() == xt0Var && jv0Var.t1[5].a.isEmpty()) {
                    i11 = fs0Var.x.J;
                } else {
                    gs0 gs0Var = fs0Var.x;
                    gs0Var.B1();
                    i11 = gs0Var.R.get(i10);
                }
            }
        }
        return Math.min(i11, fs0Var.x.J);
    }
}
