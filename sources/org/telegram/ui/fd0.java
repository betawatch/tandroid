package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd0 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.TL_auth_resetLoginEmail d;

    public /* synthetic */ fd0(pd0 pd0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i9) {
        this.a = i9;
        this.b = pd0Var;
        this.c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final pd0 pd0Var = this.b;
                final Bundle bundle = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.id0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i10;
                        String str2;
                        int i11;
                        int i12 = i9;
                        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = tL_auth_resetLoginEmail;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Bundle bundle2 = bundle;
                        TLObject tLObject2 = tLObject;
                        pd0 pd0Var2 = pd0Var;
                        switch (i12) {
                            case 0:
                                fg0 fg0Var = pd0Var2.S;
                                if (fg0Var.getParentActivity() != null) {
                                    pd0Var2.R = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                                    org.telegram.ui.Components.y4.f0(i10, tL_error2, fg0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                                    break;
                                                } else {
                                                    fg0Var.u1(0, true, null, true);
                                                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd0Var2.getContext());
                                                String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                                c2Var.N = string;
                                                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(ne.b.c().b("+" + pd0Var2.H))));
                                                org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        fg0Var.g1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                fg0 fg0Var2 = pd0Var2.S;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i11 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                            org.telegram.ui.Components.y4.f0(i11, tL_error2, fg0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                            break;
                                        } else {
                                            fg0Var2.u1(0, true, null, true);
                                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = pd0Var2.y.getString("emailPattern");
                                        pd0Var2.x = true;
                                    }
                                    fg0Var2.g1(bundle2, tL_auth_sentCode, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final pd0 pd0Var2 = this.b;
                final Bundle bundle2 = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.id0
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
                        pd0 pd0Var22 = pd0Var2;
                        switch (i12) {
                            case 0:
                                fg0 fg0Var = pd0Var22.S;
                                if (fg0Var.getParentActivity() != null) {
                                    pd0Var22.R = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i102 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                                    org.telegram.ui.Components.y4.f0(i102, tL_error2, fg0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                                    break;
                                                } else {
                                                    fg0Var.u1(0, true, null, true);
                                                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd0Var22.getContext());
                                                String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                                c2Var.N = string;
                                                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(ne.b.c().b("+" + pd0Var22.H))));
                                                org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        fg0Var.g1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                fg0 fg0Var2 = pd0Var22.S;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i11 = ((org.telegram.ui.ActionBar.o2) fg0Var2).currentAccount;
                                            org.telegram.ui.Components.y4.f0(i11, tL_error2, fg0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                            break;
                                        } else {
                                            fg0Var2.u1(0, true, null, true);
                                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = pd0Var22.y.getString("emailPattern");
                                        pd0Var22.x = true;
                                    }
                                    fg0Var2.g1(bundle22, tL_auth_sentCode, true);
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
