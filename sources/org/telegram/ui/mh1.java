package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class mh1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ oh1 a;

    public mh1(oh1 oh1Var) {
        this.a = oh1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        oh1 oh1Var = this.a;
        if (i10 == -1) {
            if (oh1Var.G >= 0) {
                b5Var = ((org.telegram.ui.ActionBar.m2) oh1Var).parentLayout;
                if (b5Var.getFragmentStack().size() == 1) {
                    oh1Var.I0();
                    return;
                }
            }
            oh1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oh1Var.getParentActivity());
            TL_account.Password password = oh1Var.U;
            String string = (password == null || !password.has_password) ? LocaleController.getString(R.string.CancelPasswordQuestion) : LocaleController.getString(R.string.CancelEmailQuestion);
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.T = string;
            a2Var.R = string2;
            alertDialog$Builder.k(string3, new lq0(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.a;
            oh1Var.showDialog(a2Var2);
            TextView textView = (TextView) a2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
            }
        }
    }
}
