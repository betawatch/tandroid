package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h0 extends org.telegram.ui.ActionBar.m5 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ h0(Object obj, int i10) {
        this.r = i10;
        this.s = obj;
    }

    @Override // org.telegram.ui.ActionBar.m5, org.telegram.ui.ActionBar.d3
    public boolean g() {
        switch (this.r) {
            case 0:
                j4 j4Var = (j4) this.s;
                org.telegram.ui.Cells.s9 s9Var = j4Var.Q0;
                if (s9Var == null || !s9Var.x()) {
                    return true;
                }
                j4Var.Q0.f(false);
                return false;
            case 1:
            default:
                return super.g();
            case 2:
                return !((org.telegram.ui.Wallet.a2) this.s).m;
        }
    }

    @Override // org.telegram.ui.ActionBar.m5, org.telegram.ui.ActionBar.d3
    public void onOpenAnimationEnd() {
        switch (this.r) {
            case 1:
                ((org.telegram.ui.Components.mr0) this.s).Z = true;
                break;
        }
    }
}
