package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h0 extends org.telegram.ui.ActionBar.s4 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ h0(Object obj, int i7) {
        this.r = i7;
        this.s = obj;
    }

    @Override // org.telegram.ui.ActionBar.s4, org.telegram.ui.ActionBar.o2
    public void v() {
        switch (this.r) {
            case 1:
                ((org.telegram.ui.Components.po0) this.s).U1 = true;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s4, org.telegram.ui.ActionBar.o2
    public boolean x() {
        boolean z10;
        switch (this.r) {
            case 0:
                g4 g4Var = (g4) this.s;
                org.telegram.ui.Cells.h9 h9Var = g4Var.R0;
                if (h9Var == null || !h9Var.x()) {
                    return true;
                }
                g4Var.R0.f(false);
                return false;
            case 1:
            default:
                return super.x();
            case 2:
                z10 = ((org.telegram.ui.Wallet.z1) this.s).m;
                break;
            case 3:
                z10 = ((org.telegram.ui.Wallet.r2) this.s).d;
                break;
        }
        return !z10;
    }
}
