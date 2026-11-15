package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class or0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr0 b;

    public /* synthetic */ or0(xr0 xr0Var, int i7) {
        this.a = i7;
        this.b = xr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xr0 xr0Var = this.b;
                org.telegram.messenger.g0.h3(new or0(xr0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = xr0Var.M;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = xr0Var.M;
                    q1Var2.d6 = null;
                    q1Var2.invalidate();
                }
                tl tlVar = xr0Var.f0;
                if (tlVar != null) {
                    org.telegram.messenger.g0.h3(tlVar);
                    xr0Var.f0 = null;
                    break;
                }
                break;
            case 1:
                this.b.c(false);
                break;
            case 2:
                this.b.c(false);
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }

    public /* synthetic */ or0(xr0 xr0Var, boolean z10) {
        this.a = 0;
        this.b = xr0Var;
    }
}
