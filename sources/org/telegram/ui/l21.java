package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l21 extends org.telegram.ui.ActionBar.w2 {
    public static final /* synthetic */ int p1 = 0;
    public TLRPC.TL_authorization m1;
    public SessionsActivity n1;
    public org.telegram.ui.Components.qh0 o1;

    public static void J0(l21 l21Var, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l21Var.getContext());
        alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.gd.N0(2131751755, null)}, new og.j(12, l21Var, str));
        alertDialog$Builder.p();
    }

    public static void K0(l21 l21Var) {
        TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
        TLRPC.TL_authorization tL_authorization = l21Var.m1;
        changeauthorizationsettings.encrypted_requests_disabled = tL_authorization.encrypted_requests_disabled;
        changeauthorizationsettings.call_requests_disabled = tL_authorization.call_requests_disabled;
        changeauthorizationsettings.flags = 3;
        changeauthorizationsettings.hash = tL_authorization.hash;
        ConnectionsManager.getInstance(l21Var.a).sendRequest(changeauthorizationsettings, new fi.l5(28));
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        this.o1.d();
    }
}
