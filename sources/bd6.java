// default package

import android.app.Dialog;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bd6 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ gd6 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ bd6(gd6 gd6Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = gd6Var;
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
        gd6 gd6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    gd6Var.s = password;
                    TwoStepVerificationActivity.e0(password);
                    gd6Var.n(str2, str);
                    break;
                }
                break;
            default:
                mf6 mf6Var = gd6Var.H;
                byte b2 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i = ((d) mf6Var).currentAccount;
                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new ed6(gd6Var, str2, str, b2), 8);
                    break;
                } else {
                    mf6Var.x1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            gd6Var.x = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                mf6Var.y1(k96.M0(2131745878, null), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                mf6Var.y1(k96.M0(2131745878, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
                        alertDialog$Builder.j(k96.M0(2131751759, null), new h45(gd6Var, tLObject, (byte) 18));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        hd hdVar = alertDialog$Builder.a;
                        if (isEmpty) {
                            hdVar.U = k96.M0(2131742536, null);
                        } else {
                            hdVar.U = k96.M0(2131742541, null);
                        }
                        hdVar.S = k96.M0(2131743692, null);
                        Dialog showDialog = mf6Var.showDialog(hdVar);
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

    public /* synthetic */ bd6(gd6 gd6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = gd6Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
