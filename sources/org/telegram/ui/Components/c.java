package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                if (!f0Var.K0) {
                    f0Var.D0.setVisibility(8);
                    break;
                }
                break;
            case 1:
                f0 f0Var2 = this.b;
                if (f0Var2.K0) {
                    f0Var2.C0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.b.A0.b);
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
