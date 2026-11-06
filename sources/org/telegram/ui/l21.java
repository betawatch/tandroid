package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l21 extends org.telegram.ui.ActionBar.v2 {
    public static final /* synthetic */ int l1 = 0;
    public TLRPC.TL_authorization i1;
    public SessionsActivity j1;
    public org.telegram.ui.Components.ch0 k1;

    public static void I0(l21 l21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131751767, null)}, new og.j(12, l21Var, str));
        alertDialog$Builder.p();
    }

    public static void J0(l21 l21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = l21Var.i1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(l21Var.a).sendRequest(changeauthorizationsettings, new di.u5(28));
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        this.k1.d();
    }
}
