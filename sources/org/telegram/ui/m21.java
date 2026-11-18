package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class m21 extends org.telegram.ui.ActionBar.x2 {
    public static final /* synthetic */ int p1 = 0;
    public TLRPC.TL_authorization m1;
    public SessionsActivity n1;
    public org.telegram.ui.Components.ph0 o1;

    public static void J0(m21 m21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.gd.M0(2131751756, null)}, new og.j(12, m21Var, str));
        alertDialog$Builder.p();
    }

    public static void K0(m21 m21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = m21Var.m1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(m21Var.a).sendRequest(changeauthorizationsettings, new fi.k5(28));
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        super.show();
        this.o1.d();
    }
}
