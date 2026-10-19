package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class b11 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d11 b;

    public /* synthetic */ b11(d11 d11Var, int i10) {
        this.a = i10;
        this.b = d11Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                d11 d11Var = this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d11Var.getContext());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.TosDeclineDeleteAccount);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Deactivate), new b11(d11Var, 2));
                i2.e.r(R.string.Cancel, alertDialog$Builder, null);
                break;
            default:
                d11 d11Var2 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(d11Var2.getContext(), 3, null);
                b2Var2.g0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(d11Var2.d).sendRequest(deleteaccount, new org.telegram.ui.vc(23, d11Var2, b2Var2));
                b2Var2.show();
                break;
        }
    }
}
