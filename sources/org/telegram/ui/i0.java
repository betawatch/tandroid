package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i0 extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ i0(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.e5, org.telegram.ui.ActionBar.y2
    public boolean h() {
        switch (this.f) {
            case 0:
                k4 k4Var = (k4) this.h;
                org.telegram.ui.Cells.o9 o9Var = k4Var.P0;
                if (o9Var == null || !o9Var.x()) {
                    return true;
                }
                k4Var.P0.f(false);
                return false;
            case 1:
            default:
                return super.h();
            case 2:
                return !((org.telegram.ui.Wallet.z1) this.h).m;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5, org.telegram.ui.ActionBar.y2
    public void onOpenAnimationEnd() {
        switch (this.f) {
            case 1:
                ((org.telegram.ui.Components.jr0) this.h).Y = true;
                break;
        }
    }
}
