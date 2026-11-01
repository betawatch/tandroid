package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz0 b;

    public /* synthetic */ oz0(qz0 qz0Var, int i10) {
        this.a = i10;
        this.b = qz0Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = this.a;
        qz0 qz0Var = this.b;
        switch (i11) {
            case 0:
                qz0Var.a();
                break;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qz0Var.getContext());
                String L0 = org.telegram.messenger.dd.L0(2131744001, null);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                x1Var2.T = L0;
                x1Var2.R = org.telegram.messenger.dd.L0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751653, null), new oz0(qz0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, qz0Var.getContext(), null);
                x1Var3.i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(qz0Var.d).sendRequest(deleteaccount, new t20(6, qz0Var, x1Var3));
                x1Var3.show();
                break;
        }
    }
}
