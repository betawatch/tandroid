package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                AndroidUtilities.showKeyboard(this.b.A0.d);
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
