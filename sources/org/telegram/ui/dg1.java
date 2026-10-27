package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dg1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ fg1 a;

    public dg1(fg1 fg1Var) {
        this.a = fg1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        fg1 fg1Var = this.a;
        if (i10 == -1) {
            if (fg1Var.G >= 0) {
                j5Var = ((org.telegram.ui.ActionBar.r2) fg1Var).parentLayout;
                if (j5Var.getFragmentStack().size() == 1) {
                    fg1Var.J0();
                    return;
                }
            }
            fg1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg1Var.getParentActivity());
            TL_account.Password password = fg1Var.U;
            String string = (password == null || !password.has_password) ? LocaleController.getString(R.string.CancelPasswordQuestion) : LocaleController.getString(R.string.CancelEmailQuestion);
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.T = string;
            e2Var.R = string2;
            alertDialog$Builder.k(string3, new jl0(this, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.a;
            fg1Var.showDialog(e2Var2);
            TextView textView = (TextView) e2Var2.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
            }
        }
    }
}
