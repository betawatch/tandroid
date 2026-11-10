package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ rb0 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.TL_auth_resetLoginEmail d;

    public /* synthetic */ ib0(rb0 rb0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i7) {
        this.a = i7;
        this.b = rb0Var;
        this.c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final rb0 rb0Var = this.b;
                final Bundle bundle = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.lb0
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
                        rb0 rb0Var2 = rb0Var;
                        switch (i12) {
                            case 0:
                                fe0 fe0Var = rb0Var2.W;
                                if (fe0Var.getParentActivity() != null) {
                                    rb0Var2.V = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i10 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                                                    org.telegram.ui.Components.u4.c0(i10, tL_error2, fe0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                                    break;
                                                } else {
                                                    fe0Var.M1(0, true, null, true);
                                                    fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rb0Var2.getContext());
                                                String M0 = org.telegram.messenger.id.M0(2131748729, null);
                                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                                u1Var.R = M0;
                                                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131748730, org.telegram.messenger.id.a(pf.b.c().b("+" + rb0Var2.L))));
                                                jg.g.C(null, 2131747831, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        fe0Var.y1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                fe0 fe0Var2 = rb0Var2.W;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i11 = ((org.telegram.ui.ActionBar.f2) fe0Var2).currentAccount;
                                            org.telegram.ui.Components.u4.c0(i11, tL_error2, fe0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                            break;
                                        } else {
                                            fe0Var2.M1(0, true, null, true);
                                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = rb0Var2.D.getString("emailPattern");
                                        rb0Var2.y = true;
                                    }
                                    fe0Var2.y1(bundle2, tL_auth_sentCode, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final rb0 rb0Var2 = this.b;
                final Bundle bundle2 = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.lb0
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
                        rb0 rb0Var22 = rb0Var2;
                        switch (i12) {
                            case 0:
                                fe0 fe0Var = rb0Var22.W;
                                if (fe0Var.getParentActivity() != null) {
                                    rb0Var22.V = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i102 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                                                    org.telegram.ui.Components.u4.c0(i102, tL_error2, fe0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                                    break;
                                                } else {
                                                    fe0Var.M1(0, true, null, true);
                                                    fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rb0Var22.getContext());
                                                String M0 = org.telegram.messenger.id.M0(2131748729, null);
                                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                                u1Var.R = M0;
                                                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131748730, org.telegram.messenger.id.a(pf.b.c().b("+" + rb0Var22.L))));
                                                jg.g.C(null, 2131747831, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        fe0Var.y1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                fe0 fe0Var2 = rb0Var22.W;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i11 = ((org.telegram.ui.ActionBar.f2) fe0Var2).currentAccount;
                                            org.telegram.ui.Components.u4.c0(i11, tL_error2, fe0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                            break;
                                        } else {
                                            fe0Var2.M1(0, true, null, true);
                                            fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = rb0Var22.D.getString("emailPattern");
                                        rb0Var22.y = true;
                                    }
                                    fe0Var2.y1(bundle22, tL_auth_sentCode, true);
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
