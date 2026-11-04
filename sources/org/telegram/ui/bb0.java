package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb0 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.TL_auth_resetLoginEmail d;

    public /* synthetic */ bb0(lb0 lb0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i3) {
        this.a = i3;
        this.b = lb0Var;
        this.c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 0;
                final lb0 lb0Var = this.b;
                final Bundle bundle = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.eb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i10;
                        String str2;
                        int i11;
                        int i12 = i3;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        lb0 lb0Var2 = lb0Var;
                        switch (i12) {
                            case 0:
                                xd0 xd0Var = lb0Var2.a0;
                                if (xd0Var.getParentActivity() != null) {
                                    lb0Var2.W = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i10 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                                    org.telegram.ui.Components.t4.e0(i10, tL_error2, xd0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                                    break;
                                                } else {
                                                    xd0Var.D1(0, true, null, true);
                                                    xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lb0Var2.getContext());
                                                String M0 = org.telegram.messenger.bd.M0(2131748737, null);
                                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                                s1Var.S = M0;
                                                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131748738, org.telegram.messenger.bd.a(mf.b.c().b("+" + lb0Var2.M))));
                                                k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        xd0Var.p1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                xd0 xd0Var2 = lb0Var2.a0;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i11 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                            org.telegram.ui.Components.t4.e0(i11, tL_error2, xd0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                            break;
                                        } else {
                                            xd0Var2.D1(0, true, null, true);
                                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = lb0Var2.E.getString("emailPattern");
                                        lb0Var2.y = true;
                                    }
                                    xd0Var2.p1(bundle2, tL_auth_sentCode, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final lb0 lb0Var2 = this.b;
                final Bundle bundle2 = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.eb0
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
                        lb0 lb0Var22 = lb0Var2;
                        switch (i12) {
                            case 0:
                                xd0 xd0Var = lb0Var22.a0;
                                if (xd0Var.getParentActivity() != null) {
                                    lb0Var22.W = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i102 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                                    org.telegram.ui.Components.t4.e0(i102, tL_error2, xd0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                                    break;
                                                } else {
                                                    xd0Var.D1(0, true, null, true);
                                                    xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lb0Var22.getContext());
                                                String M0 = org.telegram.messenger.bd.M0(2131748737, null);
                                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                                s1Var.S = M0;
                                                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131748738, org.telegram.messenger.bd.a(mf.b.c().b("+" + lb0Var22.M))));
                                                k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        xd0Var.p1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                xd0 xd0Var2 = lb0Var22.a0;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i11 = ((org.telegram.ui.ActionBar.d2) xd0Var2).currentAccount;
                                            org.telegram.ui.Components.t4.e0(i11, tL_error2, xd0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                            break;
                                        } else {
                                            xd0Var2.D1(0, true, null, true);
                                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = lb0Var22.E.getString("emailPattern");
                                        lb0Var22.y = true;
                                    }
                                    xd0Var2.p1(bundle22, tL_auth_sentCode, true);
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
