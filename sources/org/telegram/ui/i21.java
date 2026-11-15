package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i21 extends org.telegram.ui.ActionBar.u2 {
    public static final /* synthetic */ int p1 = 0;
    public TLRPC.TL_authorization m1;
    public SessionsActivity n1;
    public org.telegram.ui.Components.fh0 o1;

    public static void I0(i21 i21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131751767, null)}, new og.j(12, i21Var, str));
        alertDialog$Builder.p();
    }

    public static void J0(i21 i21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = i21Var.m1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(i21Var.a).sendRequest(changeauthorizationsettings, new fi.m5(28));
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        this.o1.d();
    }
}
