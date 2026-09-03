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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ee0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ ae0(ee0 ee0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = ee0Var;
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
        ee0 ee0Var = this.b;
        switch (i11) {
            case 0:
                ee0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ee0Var.s = password;
                    TwoStepVerificationActivity.m0(password);
                    ee0Var.o(str2, str);
                    break;
                }
                break;
            default:
                og0 og0Var = ee0Var.B;
                int i12 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new de0(ee0Var, str2, str, i12), 8);
                    break;
                } else {
                    og0Var.k1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            ee0Var.w = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og0Var.getParentActivity());
                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new rs(24, ee0Var, tLObject));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        if (isEmpty) {
                            d2Var.Q = LocaleController.getString(R.string.YourPasswordReset);
                        } else {
                            d2Var.Q = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                        }
                        d2Var.O = LocaleController.getString(R.string.TwoStepVerificationTitle);
                        Dialog showDialog = og0Var.showDialog(d2Var);
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

    public /* synthetic */ ae0(ee0 ee0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = ee0Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
