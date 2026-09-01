package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ c(f0 f0Var, int i10) {
        this.a = i10;
        this.b = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                if (!f0Var.H0) {
                    f0Var.A0.setVisibility(8);
                    break;
                }
                break;
            case 1:
                f0 f0Var2 = this.b;
                if (f0Var2.H0) {
                    f0Var2.z0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.b.x0.b);
                break;
            case 3:
                f0 f0Var3 = this.b;
                f0Var3.l0(0, 0, false);
                f0Var3.dismiss();
                break;
            default:
                f0.Q(this.b);
                break;
        }
    }
}
