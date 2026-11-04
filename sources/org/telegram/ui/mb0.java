package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ qb0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ mb0(qb0 qb0Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = qb0Var;
        this.c = tL_error;
        this.d = str;
        this.e = str2;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i10 = this.a;
        TLObject tLObject = this.f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.c;
        qb0 qb0Var = this.b;
        switch (i10) {
            case 0:
                qb0Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    qb0Var.s = password;
                    TwoStepVerificationActivity.r0(password);
                    qb0Var.n(str2, str);
                    break;
                }
                break;
            default:
                xd0 xd0Var = qb0Var.H;
                int i11 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                    ConnectionsManager.getInstance(i3).sendRequest(getpassword, new pb0(qb0Var, str2, str, i11), 8);
                    break;
                } else {
                    xd0Var.t1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            qb0Var.x = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xd0Var.getParentActivity());
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new org.telegram.ui.Components.i41(29, qb0Var, tLObject));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        if (isEmpty) {
                            s1Var.U = org.telegram.messenger.bd.M0(2131742809, null);
                        } else {
                            s1Var.U = org.telegram.messenger.bd.M0(2131742814, null);
                        }
                        s1Var.S = org.telegram.messenger.bd.M0(2131743941, null);
                        Dialog showDialog = xd0Var.showDialog(s1Var);
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

    public /* synthetic */ mb0(qb0 qb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = qb0Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
