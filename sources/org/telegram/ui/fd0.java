package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg0 b;

    public /* synthetic */ fd0(rg0 rg0Var, int i10) {
        this.a = i10;
        this.b = rg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rg0 rg0Var = this.b;
                rg0Var.r0 = false;
                rg0Var.x1(true, true);
                break;
            case 1:
                this.b.c0 = false;
                break;
            default:
                rg0 rg0Var2 = this.b;
                if (rg0Var2.getParentActivity() != null && !rg0Var2.getParentActivity().isFinishing() && rg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rg0Var2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new kd0(rg0Var2, 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
