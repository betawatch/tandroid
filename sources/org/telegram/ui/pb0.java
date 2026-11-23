package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                    i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new sb0(tb0Var, str2, str, i11), 8);
                    break;
                } else {
                    de0Var.C1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            tb0Var.x = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new zs(22, tb0Var, tLObject));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        if (isEmpty) {
                            t1Var.U = org.telegram.messenger.gd.N0(2131742528, null);
                        } else {
                            t1Var.U = org.telegram.messenger.gd.N0(2131742533, null);
                        }
                        t1Var.S = org.telegram.messenger.gd.N0(2131743684, null);
                        Dialog showDialog = de0Var.showDialog(t1Var);
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
