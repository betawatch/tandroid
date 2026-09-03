package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;

    public /* synthetic */ ed0(pg0 pg0Var, int i10) {
        this.a = i10;
        this.b = pg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pg0 pg0Var = this.b;
                pg0Var.o0 = false;
                pg0Var.x1(true, true);
                break;
            case 1:
                this.b.Z = false;
                break;
            default:
                pg0 pg0Var2 = this.b;
                if (pg0Var2.getParentActivity() != null && !pg0Var2.getParentActivity().isFinishing() && pg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pg0Var2.getParentActivity());
                    alertDialog$Builder.a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new jd0(pg0Var2, 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
