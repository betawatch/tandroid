package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class n21 extends org.telegram.ui.ActionBar.w2 {
    public static final /* synthetic */ int p1 = 0;
    public TLRPC.TL_authorization m1;
    public SessionsActivity n1;
    public org.telegram.ui.Components.rh0 o1;

    public static void J0(n21 n21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.gd.N0(2131751755, null)}, new og.j(12, n21Var, str));
        alertDialog$Builder.p();
    }

    public static void K0(n21 n21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = n21Var.m1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(n21Var.a).sendRequest(changeauthorizationsettings, new fi.l5(28));
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        this.o1.d();
    }
}
