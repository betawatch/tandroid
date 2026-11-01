package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a41 extends org.telegram.ui.ActionBar.z2 {
    public static final /* synthetic */ int l1 = 0;
    public TLRPC.TL_authorization i1;
    public SessionsActivity j1;
    public org.telegram.ui.Components.fi0 k1;

    public static void I0(a41 a41Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a41Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.dd.L0(2131751767, null)}, new eg.j(13, a41Var, str));
        alertDialog$Builder.p();
    }

    public static void J0(a41 a41Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = a41Var.i1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(a41Var.a).sendRequest(changeauthorizationsettings, new ag.c3(23));
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        this.k1.d();
    }
}
