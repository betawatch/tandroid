package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i0 extends org.telegram.ui.ActionBar.d5 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ i0(Object obj, int i10) {
        this.r = i10;
        this.s = obj;
    }

    @Override // org.telegram.ui.ActionBar.d5, org.telegram.ui.ActionBar.t2
    public void w() {
        switch (this.r) {
            case 1:
                ((org.telegram.ui.Components.pp0) this.s).Q1 = true;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d5, org.telegram.ui.ActionBar.t2
    public boolean y() {
        boolean z10;
        switch (this.r) {
            case 0:
                h4 h4Var = (h4) this.s;
                org.telegram.ui.Cells.k9 k9Var = h4Var.Q0;
                if (k9Var == null || !k9Var.x()) {
                    return true;
                }
                h4Var.Q0.f(false);
                return false;
            case 1:
            default:
                return super.y();
            case 2:
                z10 = ((org.telegram.ui.Wallet.a2) this.s).m;
                break;
            case 3:
                z10 = ((org.telegram.ui.Wallet.u2) this.s).d;
                break;
        }
        return !z10;
    }
}
