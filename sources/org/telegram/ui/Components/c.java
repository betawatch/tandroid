package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ c(e0 e0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                if (!e0Var.K0) {
                    e0Var.D0.setVisibility(8);
                    break;
                }
                break;
            case 1:
                e0 e0Var2 = this.b;
                if (e0Var2.K0) {
                    e0Var2.C0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.b.A0.b);
                break;
            case 3:
                e0 e0Var3 = this.b;
                e0Var3.l0(0, 0, false);
                e0Var3.dismiss();
                break;
            default:
                e0.Q(this.b);
                break;
        }
    }
}
