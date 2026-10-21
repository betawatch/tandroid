package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class j0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ j0(Object obj, int i10) {
        this.r = i10;
        this.s = obj;
    }

    @Override // org.telegram.ui.ActionBar.g5, org.telegram.ui.ActionBar.z2
    public boolean h() {
        switch (this.r) {
            case 0:
                l4 l4Var = (l4) this.s;
                org.telegram.ui.Cells.n9 n9Var = l4Var.P0;
                if (n9Var == null || !n9Var.x()) {
                    return true;
                }
                l4Var.P0.f(false);
                return false;
            case 1:
            default:
                return super.h();
            case 2:
                return !((org.telegram.ui.Wallet.b2) this.s).m;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5, org.telegram.ui.ActionBar.z2
    public void onOpenAnimationEnd() {
        switch (this.r) {
            case 1:
                ((org.telegram.ui.Components.fr0) this.s).Z = true;
                break;
        }
    }
}
