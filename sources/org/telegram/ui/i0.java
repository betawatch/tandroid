package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                return !((org.telegram.ui.Wallet.a2) this.h).m;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5, org.telegram.ui.ActionBar.y2
    public void onOpenAnimationEnd() {
        switch (this.f) {
            case 1:
                ((org.telegram.ui.Components.ir0) this.h).Y = true;
                break;
        }
    }
}
