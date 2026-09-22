package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class md0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg0 b;

    public /* synthetic */ md0(yg0 yg0Var, int i10) {
        this.a = i10;
        this.b = yg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yg0 yg0Var = this.b;
                yg0Var.r0 = false;
                yg0Var.x1(true, true);
                break;
            case 1:
                this.b.c0 = false;
                break;
            default:
                yg0 yg0Var2 = this.b;
                if (yg0Var2.getParentActivity() != null && !yg0Var2.getParentActivity().isFinishing() && yg0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rd0(yg0Var2, 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
