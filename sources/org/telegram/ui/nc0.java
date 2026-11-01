package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc0 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.TL_auth_resetLoginEmail d;

    public /* synthetic */ nc0(vc0 vc0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i10) {
        this.a = i10;
        this.b = vc0Var;
        this.c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final vc0 vc0Var = this.b;
                final Bundle bundle = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.qc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i11;
                        String str2;
                        int i12;
                        int i13 = i10;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        vc0 vc0Var2 = vc0Var;
                        switch (i13) {
                            case 0:
                                gf0 gf0Var = vc0Var2.W;
                                if (gf0Var.getParentActivity() != null) {
                                    vc0Var2.V = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i11 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                                                    org.telegram.ui.Components.s4.e0(i11, tL_error2, gf0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                                    break;
                                                } else {
                                                    gf0Var.D1(0, true, null, true);
                                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vc0Var2.getContext());
                                                String L0 = org.telegram.messenger.dd.L0(2131748740, null);
                                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                                x1Var.R = L0;
                                                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131748741, org.telegram.messenger.dd.a(af.b.c().b("+" + vc0Var2.L))));
                                                i0.a.w(null, 2131747847, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        gf0Var.p1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                gf0 gf0Var2 = vc0Var2.W;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i12 = ((org.telegram.ui.ActionBar.k2) gf0Var2).currentAccount;
                                            org.telegram.ui.Components.s4.e0(i12, tL_error2, gf0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                            break;
                                        } else {
                                            gf0Var2.D1(0, true, null, true);
                                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = vc0Var2.D.getString("emailPattern");
                                        vc0Var2.y = true;
                                    }
                                    gf0Var2.p1(bundle2, tL_auth_sentCode, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final vc0 vc0Var2 = this.b;
                final Bundle bundle2 = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.qc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i112;
                        String str2;
                        int i12;
                        int i13 = i11;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail22 = tL_auth_resetLoginEmail2;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle22 = bundle2;
                        TLObject tLObject2 = tLObject;
                        vc0 vc0Var22 = vc0Var2;
                        switch (i13) {
                            case 0:
                                gf0 gf0Var = vc0Var22.W;
                                if (gf0Var.getParentActivity() != null) {
                                    vc0Var22.V = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i112 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                                                    org.telegram.ui.Components.s4.e0(i112, tL_error2, gf0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                                    break;
                                                } else {
                                                    gf0Var.D1(0, true, null, true);
                                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vc0Var22.getContext());
                                                String L0 = org.telegram.messenger.dd.L0(2131748740, null);
                                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                                x1Var.R = L0;
                                                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131748741, org.telegram.messenger.dd.a(af.b.c().b("+" + vc0Var22.L))));
                                                i0.a.w(null, 2131747847, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        gf0Var.p1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                gf0 gf0Var2 = vc0Var22.W;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i12 = ((org.telegram.ui.ActionBar.k2) gf0Var2).currentAccount;
                                            org.telegram.ui.Components.s4.e0(i12, tL_error2, gf0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                            break;
                                        } else {
                                            gf0Var2.D1(0, true, null, true);
                                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = vc0Var22.D.getString("emailPattern");
                                        vc0Var22.y = true;
                                    }
                                    gf0Var2.p1(bundle22, tL_auth_sentCode, true);
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
