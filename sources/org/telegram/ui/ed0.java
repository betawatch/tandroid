package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    public /* synthetic */ ed0(qg0 qg0Var, int i10) {
        this.a = i10;
        this.b = qg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qg0 qg0Var = this.b;
                qg0Var.r0 = false;
                qg0Var.x1(true, true);
                break;
            case 1:
                this.b.c0 = false;
                break;
            default:
                qg0 qg0Var2 = this.b;
                if (qg0Var2.getParentActivity() != null && !qg0Var2.getParentActivity().isFinishing() && qg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg0Var2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new jd0(qg0Var2, 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
