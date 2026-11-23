package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h0 extends org.telegram.ui.ActionBar.v4 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ h0(Object obj, int i7) {
        this.r = i7;
        this.s = obj;
    }

    @Override // org.telegram.ui.ActionBar.v4, org.telegram.ui.ActionBar.q2
    public void v() {
        switch (this.r) {
            case 1:
                ((org.telegram.ui.Components.zo0) this.s).U1 = true;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.v4, org.telegram.ui.ActionBar.q2
    public boolean x() {
        boolean z10;
        switch (this.r) {
            case 0:
                g4 g4Var = (g4) this.s;
                org.telegram.ui.Cells.i9 i9Var = g4Var.R0;
                if (i9Var == null || !i9Var.x()) {
                    return true;
                }
                g4Var.R0.f(false);
                return false;
            case 1:
            default:
                return super.x();
            case 2:
                z10 = ((org.telegram.ui.Wallet.i2) this.s).m;
                break;
            case 3:
                z10 = ((org.telegram.ui.Wallet.z2) this.s).d;
                break;
        }
        return !z10;
    }
}
