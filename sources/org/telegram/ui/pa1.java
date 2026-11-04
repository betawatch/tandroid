package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pa1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ra1 a;

    public pa1(ra1 ra1Var) {
        this.a = ra1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        org.telegram.ui.ActionBar.q4 q4Var;
        ra1 ra1Var = this.a;
        if (i3 == -1) {
            if (ra1Var.H >= 0) {
                q4Var = ((org.telegram.ui.ActionBar.d2) ra1Var).parentLayout;
                if (q4Var.getFragmentStack().size() == 1) {
                    ra1Var.N0();
                    return;
                }
            }
            ra1Var.finishFragment();
            return;
        }
        if (i3 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ra1Var.getParentActivity());
            TL_account.Password password = ra1Var.V;
            String M0 = (password == null || !password.has_password) ? org.telegram.messenger.bd.M0(2131752578, null) : org.telegram.messenger.bd.M0(2131752586, null);
            String M02 = org.telegram.messenger.bd.M0(2131752585, null);
            String M03 = org.telegram.messenger.bd.M0(2131754950, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.U = M0;
            s1Var.S = M02;
            alertDialog$Builder.k(M03, new ci0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            ra1Var.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
            }
        }
    }
}
