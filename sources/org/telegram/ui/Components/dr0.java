package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class dr0 extends g.o {
    public final /* synthetic */ br0 c;
    public final /* synthetic */ au0 d;

    public dr0(au0 au0Var, br0 br0Var) {
        this.d = au0Var;
        this.c = br0Var;
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
    @Override // g.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(int i10) {
        au0 au0Var = this.d;
        int[] iArr = au0Var.o1;
        os0 os0Var = au0Var.Q;
        br0 br0Var = this.c;
        int i11 = iArr[au0.y0(br0Var.E) ? 1 : 0];
        s4.g0 adapter = br0Var.h.getAdapter();
        fs0 fs0Var = au0Var.J;
        if (adapter != fs0Var) {
            if (au0.v(au0Var, br0Var.h.getAdapter()) == -1) {
                if (br0Var.h.getAdapter() != os0Var) {
                    i11 = br0Var.x.J;
                } else if (br0Var.h.getAdapter() == os0Var && au0Var.v1[5].a.isEmpty()) {
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
