// default package

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ef6 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ if6 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ ef6(if6 if6Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = if6Var;
        this.c = tL_error;
        this.d = str;
        this.e = str2;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        TLObject tLObject = this.f;
        String str = this.e;
        String str2 = this.d;
        TLRPC.TL_error tL_error = this.c;
        if6 if6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if6Var.s = password;
                    TwoStepVerificationActivity.e0(password);
                    if6Var.n(str2, str);
                    break;
                }
                break;
            default:
                qh6 qh6Var = if6Var.H;
                byte b2 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i = ((e) qh6Var).currentAccount;
                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new hf6(if6Var, str2, str, b2), 8);
                    break;
                } else {
                    qh6Var.y1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            if6Var.x = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                qh6Var.z1(ob6.M0(2131745798, null), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                qh6Var.z1(ob6.M0(2131745798, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
                        alertDialog$Builder.j(ob6.M0(2131751736, null), new u34(if6Var, tLObject, (byte) 23));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        id idVar = alertDialog$Builder.a;
                        if (isEmpty) {
                            idVar.U = ob6.M0(2131742430, null);
                        } else {
                            idVar.U = ob6.M0(2131742435, null);
                        }
                        idVar.S = ob6.M0(2131743586, null);
                        Dialog showDialog = qh6Var.showDialog(idVar);
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

    public /* synthetic */ ef6(if6 if6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = if6Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
