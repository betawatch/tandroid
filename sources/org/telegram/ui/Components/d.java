package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ d(g0 g0Var, int i10) {
        this.a = i10;
        this.b = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                if (!g0Var.K0) {
                    g0Var.D0.setVisibility(8);
                    break;
                }
                break;
            case 1:
                g0 g0Var2 = this.b;
                if (g0Var2.K0) {
                    g0Var2.C0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.b.A0.b);
                break;
            case 3:
                g0 g0Var3 = this.b;
                g0Var3.l0(0, 0, false);
                g0Var3.dismiss();
                break;
            default:
                g0.Q(this.b);
                break;
        }
    }
}
