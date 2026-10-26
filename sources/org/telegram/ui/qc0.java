package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg0 b;

    public /* synthetic */ qc0(gg0 gg0Var, int i10) {
        this.a = i10;
        this.b = gg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = false;
                break;
            case 1:
                gg0 gg0Var = this.b;
                gg0Var.v0 = false;
                gg0Var.C1(true, true);
                break;
            default:
                gg0 gg0Var2 = this.b;
                if (gg0Var2.getParentActivity() != null && !gg0Var2.getParentActivity().isFinishing() && gg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gg0Var2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new wc0(gg0Var2, 1));
                    alertDialog$Builder.p();
                    break;
                }
                break;
        }
    }
}
