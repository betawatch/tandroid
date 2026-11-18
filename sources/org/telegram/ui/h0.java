package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class h0 extends org.telegram.ui.ActionBar.w4 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ h0(Object obj, int i7) {
        this.r = i7;
        this.s = obj;
    }

    @Override // org.telegram.ui.ActionBar.w4, org.telegram.ui.ActionBar.r2
    public void v() {
        switch (this.r) {
            case 1:
                ((org.telegram.ui.Components.yo0) this.s).U1 = true;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.w4, org.telegram.ui.ActionBar.r2
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
                z10 = ((org.telegram.ui.Wallet.h2) this.s).m;
                break;
            case 3:
                z10 = ((org.telegram.ui.Wallet.y2) this.s).d;
                break;
        }
        return !z10;
    }
}
