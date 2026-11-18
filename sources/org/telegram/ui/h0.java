package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                org.telegram.ui.Cells.j9 j9Var = g4Var.R0;
                if (j9Var == null || !j9Var.x()) {
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
