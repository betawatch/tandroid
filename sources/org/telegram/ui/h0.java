package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object h;

    public /* synthetic */ h0(Object obj, int i10) {
        this.f = i10;
        this.h = obj;
    }

    @Override // org.telegram.ui.ActionBar.g5, org.telegram.ui.ActionBar.z2
    public boolean h() {
        switch (this.f) {
            case 0:
                i4 i4Var = (i4) this.h;
                org.telegram.ui.Cells.o9 o9Var = i4Var.P0;
                if (o9Var == null || !o9Var.x()) {
                    return true;
                }
                i4Var.P0.f(false);
                return false;
            case 1:
            default:
                return super.h();
            case 2:
                return !((org.telegram.ui.Wallet.z1) this.h).m;
        }
    }

    @Override // org.telegram.ui.ActionBar.g5, org.telegram.ui.ActionBar.z2
    public void onOpenAnimationEnd() {
        switch (this.f) {
            case 1:
                ((org.telegram.ui.Components.mr0) this.h).Y = true;
                break;
        }
    }
}
