package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class md0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah0 b;

    public /* synthetic */ md0(ah0 ah0Var, int i10) {
        this.a = i10;
        this.b = ah0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = false;
                break;
            case 1:
                ah0 ah0Var = this.b;
                ah0Var.r0 = false;
                ah0Var.x1(true, true);
                break;
            default:
                ah0 ah0Var2 = this.b;
                if (ah0Var2.getParentActivity() != null && !ah0Var2.getParentActivity().isFinishing() && ah0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new sd0(ah0Var2, 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
