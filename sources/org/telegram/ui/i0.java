package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class i0 extends org.telegram.ui.ActionBar.k5 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ i0(Object obj, int i10) {
        this.r = i10;
        this.s = obj;
    }

    @Override // org.telegram.ui.ActionBar.k5, org.telegram.ui.ActionBar.a3
    public boolean g() {
        switch (this.r) {
            case 0:
                k4 k4Var = (k4) this.s;
                org.telegram.ui.Cells.o9 o9Var = k4Var.Q0;
                if (o9Var == null || !o9Var.x()) {
                    return true;
                }
                k4Var.Q0.f(false);
                return false;
            case 1:
            default:
                return super.g();
            case 2:
                return !((org.telegram.ui.Wallet.a2) this.s).m;
        }
    }

    @Override // org.telegram.ui.ActionBar.k5, org.telegram.ui.ActionBar.a3
    public void onOpenAnimationEnd() {
        switch (this.r) {
            case 1:
                ((org.telegram.ui.Components.ir0) this.s).Z = true;
                break;
        }
    }
}
