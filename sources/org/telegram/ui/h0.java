package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                ((org.telegram.ui.Components.mo0) this.s).T1 = true;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.v4, org.telegram.ui.ActionBar.q2
    public boolean x() {
        boolean z9;
        switch (this.r) {
            case 0:
                g4 g4Var = (g4) this.s;
                org.telegram.ui.Cells.i9 i9Var = g4Var.Q0;
                if (i9Var == null || !i9Var.x()) {
                    return true;
                }
                g4Var.Q0.f(false);
                return false;
            case 1:
            default:
                return super.x();
            case 2:
                z9 = ((org.telegram.ui.Wallet.z1) this.s).m;
                break;
            case 3:
                z9 = ((org.telegram.ui.Wallet.s2) this.s).d;
                break;
        }
        return !z9;
    }
}
