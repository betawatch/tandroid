package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb0 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.TL_auth_resetLoginEmail d;

    public /* synthetic */ gb0(pb0 pb0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i7) {
        this.a = i7;
        this.b = pb0Var;
        this.c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final pb0 pb0Var = this.b;
                final Bundle bundle = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.jb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i10;
                        String str2;
                        int i11;
                        int i12 = i7;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        pb0 pb0Var2 = pb0Var;
                        switch (i12) {
                            case 0:
                                ee0 ee0Var = pb0Var2.a0;
                                if (ee0Var.getParentActivity() != null) {
                                    pb0Var2.W = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i10 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                                                    org.telegram.ui.Components.b5.c0(i10, tL_error2, ee0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                                    break;
                                                } else {
                                                    ee0Var.M1(0, true, null, true);
                                                    ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pb0Var2.getContext());
                                                String M0 = org.telegram.messenger.gd.M0(2131748537, null);
                                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                                u1Var.S = M0;
                                                u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131748538, org.telegram.messenger.gd.a(pf.b.c().b("+" + pb0Var2.M))));
                                                org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        ee0Var.y1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ee0 ee0Var2 = pb0Var2.a0;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i11 = ((org.telegram.ui.ActionBar.h2) ee0Var2).currentAccount;
                                            org.telegram.ui.Components.b5.c0(i11, tL_error2, ee0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                            break;
                                        } else {
                                            ee0Var2.M1(0, true, null, true);
                                            ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = pb0Var2.E.getString("emailPattern");
                                        pb0Var2.y = true;
                                    }
                                    ee0Var2.y1(bundle2, tL_auth_sentCode, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final pb0 pb0Var2 = this.b;
                final Bundle bundle2 = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.jb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i102;
                        String str2;
                        int i11;
                        int i12 = i10;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail22 = tL_auth_resetLoginEmail2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle22 = bundle2;
                        TLObject tLObject2 = tLObject;
                        pb0 pb0Var22 = pb0Var2;
                        switch (i12) {
                            case 0:
                                ee0 ee0Var = pb0Var22.a0;
                                if (ee0Var.getParentActivity() != null) {
                                    pb0Var22.W = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i102 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                                                    org.telegram.ui.Components.b5.c0(i102, tL_error2, ee0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                                    break;
                                                } else {
                                                    ee0Var.M1(0, true, null, true);
                                                    ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pb0Var22.getContext());
                                                String M0 = org.telegram.messenger.gd.M0(2131748537, null);
                                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                                u1Var.S = M0;
                                                u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131748538, org.telegram.messenger.gd.a(pf.b.c().b("+" + pb0Var22.M))));
                                                org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        ee0Var.y1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ee0 ee0Var2 = pb0Var22.a0;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i11 = ((org.telegram.ui.ActionBar.h2) ee0Var2).currentAccount;
                                            org.telegram.ui.Components.b5.c0(i11, tL_error2, ee0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                            break;
                                        } else {
                                            ee0Var2.M1(0, true, null, true);
                                            ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = pb0Var22.E.getString("emailPattern");
                                        pb0Var22.y = true;
                                    }
                                    ee0Var2.y1(bundle22, tL_auth_sentCode, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
