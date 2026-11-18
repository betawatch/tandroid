package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ tb0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ pb0(tb0 tb0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = tb0Var;
        this.c = tL_error;
        this.d = str;
        this.e = str2;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        TLObject tLObject = this.f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.c;
        tb0 tb0Var = this.b;
        switch (i10) {
            case 0:
                tb0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    tb0Var.s = password;
                    TwoStepVerificationActivity.r0(password);
                    tb0Var.n(str2, str);
                    break;
                }
                break;
            default:
                de0 de0Var = tb0Var.H;
                int i11 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new sb0(tb0Var, str2, str, i11), 8);
                    break;
                } else {
                    de0Var.C1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            tb0Var.x = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, intValue < 60 ? org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, null), new at(22, tb0Var, tLObject));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        if (isEmpty) {
                            u1Var.U = org.telegram.messenger.gd.M0(2131742541, null);
                        } else {
                            u1Var.U = org.telegram.messenger.gd.M0(2131742546, null);
                        }
                        u1Var.S = org.telegram.messenger.gd.M0(2131743694, null);
                        Dialog showDialog = de0Var.showDialog(u1Var);
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

    public /* synthetic */ pb0(tb0 tb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = tb0Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
