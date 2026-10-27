package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd0 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ TLRPC.TL_auth_resetLoginEmail d;

    public /* synthetic */ hd0(qd0 qd0Var, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i10) {
        this.a = i10;
        this.b = qd0Var;
        this.c = bundle;
        this.d = tL_auth_resetLoginEmail;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final qd0 qd0Var = this.b;
                final Bundle bundle = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kd0
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
                        qd0 qd0Var2 = qd0Var;
                        switch (i13) {
                            case 0:
                                ig0 ig0Var = qd0Var2.W;
                                if (ig0Var.getParentActivity() != null) {
                                    qd0Var2.V = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i11 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                                                    org.telegram.ui.Components.g5.e0(i11, tL_error2, ig0Var, tL_auth_resetLoginEmail2, new Object[0]);
                                                    break;
                                                } else {
                                                    ig0Var.z1(0, true, null, true);
                                                    ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qd0Var2.getContext());
                                                String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                                e2Var.R = string;
                                                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(kf.b.c().b("+" + qd0Var2.L))));
                                                org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        ig0Var.l1(bundle2, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ig0 ig0Var2 = qd0Var2.W;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i12 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                            org.telegram.ui.Components.g5.e0(i12, tL_error2, ig0Var2, tL_auth_resetLoginEmail2, new Object[0]);
                                            break;
                                        } else {
                                            ig0Var2.z1(0, true, null, true);
                                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = qd0Var2.y.getString("emailPattern");
                                        qd0Var2.x = true;
                                    }
                                    ig0Var2.l1(bundle2, tL_auth_sentCode, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final qd0 qd0Var2 = this.b;
                final Bundle bundle2 = this.c;
                final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.kd0
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
                        qd0 qd0Var22 = qd0Var2;
                        switch (i13) {
                            case 0:
                                ig0 ig0Var = qd0Var22.W;
                                if (ig0Var.getParentActivity() != null) {
                                    qd0Var22.V = false;
                                    if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                        if (tL_error2 != null && (str = tL_error2.text) != null) {
                                            if (!str.contains("TASK_ALREADY_EXISTS")) {
                                                if (!tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    i112 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                                                    org.telegram.ui.Components.g5.e0(i112, tL_error2, ig0Var, tL_auth_resetLoginEmail22, new Object[0]);
                                                    break;
                                                } else {
                                                    ig0Var.z1(0, true, null, true);
                                                    ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                    break;
                                                }
                                            } else {
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qd0Var22.getContext());
                                                String string = LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle);
                                                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                                                e2Var.R = string;
                                                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(kf.b.c().b("+" + qd0Var22.L))));
                                                org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                                                break;
                                            }
                                        }
                                    } else {
                                        ig0Var.l1(bundle22, (TLRPC.TL_auth_sentCode) tLObject2, true);
                                        break;
                                    }
                                }
                                break;
                            default:
                                ig0 ig0Var2 = qd0Var22.W;
                                if (!(tLObject2 instanceof TLRPC.TL_auth_sentCode)) {
                                    if (tL_error2 != null && (str2 = tL_error2.text) != null) {
                                        if (!str2.contains("PHONE_CODE_EXPIRED")) {
                                            i12 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                            org.telegram.ui.Components.g5.e0(i12, tL_error2, ig0Var2, tL_auth_resetLoginEmail22, new Object[0]);
                                            break;
                                        } else {
                                            ig0Var2.z1(0, true, null, true);
                                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            break;
                                        }
                                    }
                                } else {
                                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject2;
                                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                                        auth_sentcodetype.email_pattern = qd0Var22.y.getString("emailPattern");
                                        qd0Var22.x = true;
                                    }
                                    ig0Var2.l1(bundle22, tL_auth_sentCode, true);
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
