package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f81 extends org.telegram.ui.ActionBar.g3 {
    public static final /* synthetic */ int e = 0;
    public TLRPC.TL_authorization b;
    public SessionsActivity c;
    public org.telegram.ui.Components.bj0 d;

    public static void m(f81 f81Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f81Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(11, f81Var, str));
        alertDialog$Builder.o();
    }

    public static void n(f81 f81Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = f81Var.b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(f81Var.currentAccount).sendRequest(changeauthorizationsettings, new ai.t7(21));
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        this.d.d();
    }
}
