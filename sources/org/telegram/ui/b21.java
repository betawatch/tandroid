package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b21 extends org.telegram.ui.ActionBar.t2 {
    public static final /* synthetic */ int m1 = 0;
    public TLRPC.TL_authorization j1;
    public SessionsActivity k1;
    public org.telegram.ui.Components.fh0 l1;

    public static void I0(b21 b21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.bd.M0(2131751767, null)}, new u(11, b21Var, str));
        alertDialog$Builder.p();
    }

    public static void J0(b21 b21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = b21Var.j1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(b21Var.a).sendRequest(changeauthorizationsettings, new ei.u5(28));
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        this.l1.d();
    }
}
