package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bg1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ dg1 a;

    public bg1(dg1 dg1Var) {
        this.a = dg1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        dg1 dg1Var = this.a;
        if (i10 == -1) {
            if (dg1Var.G >= 0) {
                j5Var = ((org.telegram.ui.ActionBar.r2) dg1Var).parentLayout;
                if (j5Var.getFragmentStack().size() == 1) {
                    dg1Var.J0();
                    return;
                }
            }
            dg1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dg1Var.getParentActivity());
            TL_account.Password password = dg1Var.U;
            String string = (password == null || !password.has_password) ? LocaleController.getString(R.string.CancelPasswordQuestion) : LocaleController.getString(R.string.CancelEmailQuestion);
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.T = string;
            e2Var.R = string2;
            alertDialog$Builder.k(string3, new hl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.a;
            dg1Var.showDialog(e2Var2);
            TextView textView = (TextView) e2Var2.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
            }
        }
    }
}
