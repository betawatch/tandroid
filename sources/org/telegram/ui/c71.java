package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c71 extends org.telegram.ui.ActionBar.k3 {
    public static final /* synthetic */ int e = 0;
    public TLRPC.TL_authorization b;
    public SessionsActivity c;
    public org.telegram.ui.Components.bk0 d;

    public static void m(c71 c71Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c71Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new ng.j(12, c71Var, str));
        alertDialog$Builder.p();
    }

    public static void n(c71 c71Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = c71Var.b;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(c71Var.currentAccount).sendRequest(changeauthorizationsettings, new di.d6(22));
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        this.d.d();
    }
}
