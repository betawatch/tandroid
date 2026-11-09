package org.telegram.ui.Components;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ky0 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ my0 b;

    public /* synthetic */ ky0(my0 my0Var, int i7) {
        this.a = i7;
        this.b = my0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.a;
        my0 my0Var = this.b;
        switch (i10) {
            case 0:
                my0Var.a();
                break;
            case 1:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(my0Var.getContext());
                String M0 = org.telegram.messenger.id.M0(2131743976, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                u1Var2.T = M0;
                u1Var2.R = org.telegram.messenger.id.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751652, null), new ky0(my0Var, 2));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, my0Var.getContext(), null);
                u1Var3.i0 = false;
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Decline ToS update";
                ConnectionsManager.getInstance(my0Var.d).sendRequest(deleteaccount, new org.telegram.ui.ld(22, my0Var, u1Var3));
                u1Var3.show();
                break;
        }
    }
}
