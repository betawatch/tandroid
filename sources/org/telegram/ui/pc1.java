package org.telegram.ui;

import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pc1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ rc1 a;

    public pc1(rc1 rc1Var) {
        this.a = rc1Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        rc1 rc1Var = this.a;
        if (i10 == -1) {
            if (rc1Var.G >= 0) {
                z4Var = ((org.telegram.ui.ActionBar.k2) rc1Var).parentLayout;
                if (z4Var.getFragmentStack().size() == 1) {
                    rc1Var.N0();
                    return;
                }
            }
            rc1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rc1Var.getParentActivity());
            TL_account.Password password = rc1Var.U;
            String L0 = (password == null || !password.has_password) ? org.telegram.messenger.dd.L0(2131752578, null) : org.telegram.messenger.dd.L0(2131752586, null);
            String L02 = org.telegram.messenger.dd.L0(2131752585, null);
            String L03 = org.telegram.messenger.dd.L0(2131754950, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.T = L0;
            x1Var.R = L02;
            alertDialog$Builder.k(L03, new rj0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            rc1Var.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
            }
        }
    }
}
