package org.telegram.ui;

import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gh1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ih1 a;

    public gh1(ih1 ih1Var) {
        this.a = ih1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        ih1 ih1Var = this.a;
        if (i10 == -1) {
            if (ih1Var.G >= 0) {
                d5Var = ((org.telegram.ui.ActionBar.n2) ih1Var).parentLayout;
                if (d5Var.getFragmentStack().size() == 1) {
                    ih1Var.I0();
                    return;
                }
            }
            ih1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ih1Var.getParentActivity());
            TL_account.Password password = ih1Var.U;
            String string = (password == null || !password.has_password) ? LocaleController.getString(R.string.CancelPasswordQuestion) : LocaleController.getString(R.string.CancelEmailQuestion);
            String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
            String string3 = LocaleController.getString(R.string.Abort);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.T = string;
            b2Var.R = string2;
            alertDialog$Builder.k(string3, new ol0(this, 25));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
            ih1Var.showDialog(b2Var2);
            TextView textView = (TextView) b2Var2.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
            }
        }
    }
}
