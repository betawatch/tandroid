package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xg0 b;

    public /* synthetic */ ld0(xg0 xg0Var, int i10) {
        this.a = i10;
        this.b = xg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xg0 xg0Var = this.b;
                xg0Var.r0 = false;
                xg0Var.x1(true, true);
                break;
            case 1:
                this.b.c0 = false;
                break;
            default:
                xg0 xg0Var2 = this.b;
                if (xg0Var2.getParentActivity() != null && !xg0Var2.getParentActivity().isFinishing() && xg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qd0(xg0Var2, 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
