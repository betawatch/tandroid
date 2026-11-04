package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dm extends sf.b {
    public final /* synthetic */ org.telegram.ui.Cells.q1 d;
    public final /* synthetic */ hm e;

    public dm(hm hmVar, org.telegram.ui.Cells.q1 q1Var) {
        this.e = hmVar;
        this.d = q1Var;
    }

    @Override // sf.b
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        org.telegram.messenger.g0.i3(new aj(this.e.a, 9), 250L);
    }

    @Override // sf.b
    public final void d() {
        hm hmVar = this.e;
        wm wmVar = hmVar.a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        wmVar.Xb = q1Var.getMessageObject().f1();
        wm wmVar2 = hmVar.a;
        wmVar2.Yb = 2;
        wmVar2.Zb = null;
        q1Var.invalidate();
    }
}
