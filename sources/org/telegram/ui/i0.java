package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i0 extends org.telegram.ui.ActionBar.u4 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ i0(Object obj, int i3) {
        this.r = i3;
        this.s = obj;
    }

    @Override // org.telegram.ui.ActionBar.u4, org.telegram.ui.ActionBar.n2
    public void v() {
        switch (this.r) {
            case 1:
                ((org.telegram.ui.Components.oo0) this.s).R1 = true;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.u4, org.telegram.ui.ActionBar.n2
    public boolean x() {
        boolean z10;
        switch (this.r) {
            case 0:
                i4 i4Var = (i4) this.s;
                org.telegram.ui.Cells.h9 h9Var = i4Var.R0;
                if (h9Var == null || !h9Var.x()) {
                    return true;
                }
                i4Var.R0.f(false);
                return false;
            case 1:
            default:
                return super.x();
            case 2:
                z10 = ((org.telegram.ui.Wallet.y1) this.s).m;
                break;
            case 3:
                z10 = ((org.telegram.ui.Wallet.s2) this.s).d;
                break;
        }
        return !z10;
    }
}
