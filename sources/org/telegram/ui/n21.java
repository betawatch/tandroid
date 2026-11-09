package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n21 extends org.telegram.ui.ActionBar.v2 {
    public static final /* synthetic */ int l1 = 0;
    public TLRPC.TL_authorization i1;
    public SessionsActivity j1;
    public org.telegram.ui.Components.dh0 k1;

    public static void I0(n21 n21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.id.M0(2131751767, null)}, new og.j(12, n21Var, str));
        alertDialog$Builder.p();
    }

    public static void J0(n21 n21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = n21Var.i1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(n21Var.a).sendRequest(changeauthorizationsettings, new di.v5(28));
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        this.k1.d();
    }
}
