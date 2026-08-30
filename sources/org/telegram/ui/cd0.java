package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;

    public /* synthetic */ cd0(ng0 ng0Var, int i10) {
        this.a = i10;
        this.b = ng0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ng0 ng0Var = this.b;
                ng0Var.o0 = false;
                ng0Var.x1(true, true);
                break;
            case 1:
                this.b.Z = false;
                break;
            default:
                ng0 ng0Var2 = this.b;
                if (ng0Var2.getParentActivity() != null && !ng0Var2.getParentActivity().isFinishing() && ng0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng0Var2.getParentActivity());
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new hd0(ng0Var2, 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
