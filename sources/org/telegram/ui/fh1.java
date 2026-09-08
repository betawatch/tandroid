package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class fh1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ hh1 a;

    public fh1(hh1 hh1Var) {
        this.a = hh1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        hh1 hh1Var = this.a;
        if (i10 == -1) {
            if (hh1Var.G >= 0) {
                d5Var = ((org.telegram.ui.ActionBar.n2) hh1Var).parentLayout;
                if (d5Var.getFragmentStack().size() == 1) {
                    hh1Var.I0();
                    return;
                }
            }
            hh1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hh1Var.getParentActivity());
            TL_account.Password password = hh1Var.U;
            String string = (password == null || !password.has_password) ? LocaleController.getString(R.string.CancelPasswordQuestion) : LocaleController.getString(R.string.CancelEmailQuestion);
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.T = string;
            b2Var.R = string2;
            alertDialog$Builder.k(string3, new vl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
            hh1Var.showDialog(b2Var2);
            TextView textView = (TextView) b2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
            }
        }
    }
}
