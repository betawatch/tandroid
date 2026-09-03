package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ og0 b;

    public /* synthetic */ dd0(og0 og0Var, int i10) {
        this.a = i10;
        this.b = og0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                og0 og0Var = this.b;
                og0Var.o0 = false;
                og0Var.x1(true, true);
                break;
            case 1:
                this.b.Z = false;
                break;
            default:
                og0 og0Var2 = this.b;
                if (og0Var2.getParentActivity() != null && !og0Var2.getParentActivity().isFinishing() && og0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og0Var2.getParentActivity());
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new id0(og0Var2, 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
