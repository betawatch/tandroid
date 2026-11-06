package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob0 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.TL_auth_resetLoginEmail d;

    public /* synthetic */ fb0(ob0 ob0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i7) {
        this.a = i7;
        this.b = ob0Var;
        this.c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final ob0 ob0Var = this.b;
                final Bundle bundle = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ib0
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
                        ob0 ob0Var2 = ob0Var;
                        switch (i12) {
                            case 0:
                                ce0 ce0Var = ob0Var2.W;
                                if (ce0Var.getParentActivity() != null) {
                                    ob0Var2.V = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i10 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                                                    org.telegram.ui.Components.v4.c0(i10, tL_error2, ce0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                                    break;
                                                } else {
                                                    ce0Var.M1(0, true, null, true);
                                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ob0Var2.getContext());
                                                String M0 = org.telegram.messenger.hd.M0(2131748728, null);
                                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                                u1Var.R = M0;
                                                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131748729, org.telegram.messenger.hd.a(pf.b.c().b("+" + ob0Var2.L))));
                                                jg.g.C(null, 2131747830, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        ce0Var.y1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ce0 ce0Var2 = ob0Var2.W;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i11 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                                            org.telegram.ui.Components.v4.c0(i11, tL_error2, ce0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                            break;
                                        } else {
                                            ce0Var2.M1(0, true, null, true);
                                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ob0Var2.D.getString("emailPattern");
                                        ob0Var2.y = true;
                                    }
                                    ce0Var2.y1(bundle2, tL_auth_sentCode, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final ob0 ob0Var2 = this.b;
                final Bundle bundle2 = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ib0
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
                        ob0 ob0Var22 = ob0Var2;
                        switch (i12) {
                            case 0:
                                ce0 ce0Var = ob0Var22.W;
                                if (ce0Var.getParentActivity() != null) {
                                    ob0Var22.V = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i102 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                                                    org.telegram.ui.Components.v4.c0(i102, tL_error2, ce0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                                    break;
                                                } else {
                                                    ce0Var.M1(0, true, null, true);
                                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ob0Var22.getContext());
                                                String M0 = org.telegram.messenger.hd.M0(2131748728, null);
                                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                                u1Var.R = M0;
                                                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131748729, org.telegram.messenger.hd.a(pf.b.c().b("+" + ob0Var22.L))));
                                                jg.g.C(null, 2131747830, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        ce0Var.y1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ce0 ce0Var2 = ob0Var22.W;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i11 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                                            org.telegram.ui.Components.v4.c0(i11, tL_error2, ce0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                            break;
                                        } else {
                                            ce0Var2.M1(0, true, null, true);
                                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = ob0Var22.D.getString("emailPattern");
                                        ob0Var22.y = true;
                                    }
                                    ce0Var2.y1(bundle22, tL_auth_sentCode, true);
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
