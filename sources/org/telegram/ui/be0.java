package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class be0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ge0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ be0(ge0 ge0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = ge0Var;
        this.c = tL_error;
        this.d = str;
        this.e = str2;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        TLObject tLObject = this.f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.c;
        ge0 ge0Var = this.b;
        switch (i11) {
            case 0:
                ge0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ge0Var.s = password;
                    TwoStepVerificationActivity.m0(password);
                    ge0Var.o(str2, str);
                    break;
                }
                break;
            default:
                qg0 qg0Var = ge0Var.E;
                int i12 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ee0(ge0Var, str2, str, i12), 8);
                    break;
                } else {
                    qg0Var.k1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            ge0Var.w = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg0Var.getParentActivity());
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new ow(17, ge0Var, tLObject));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        if (isEmpty) {
                            a2Var.T = LocaleController.getString(R.string.YourPasswordReset);
                        } else {
                            a2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                        }
                        a2Var.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
                        Dialog showDialog = qg0Var.showDialog(a2Var);
                        if (showDialog != null) {
                            showDialog.setCanceledOnTouchOutside(false);
                            showDialog.setCancelable(false);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ be0(ge0 ge0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = ge0Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
