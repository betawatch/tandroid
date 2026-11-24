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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class af6 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ff6 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ af6(ff6 ff6Var, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.b = ff6Var;
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
        ff6 ff6Var = this.b;
        switch (b) {
            case 0:
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    ff6Var.s = password;
                    TwoStepVerificationActivity.f0(password);
                    ff6Var.n(str2, str);
                    break;
                }
                break;
            default:
                mh6 mh6Var = ff6Var.H;
                byte b2 = 1;
                if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i = ((d) mh6Var).currentAccount;
                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new df6(ff6Var, str2, str, b2), 8);
                    break;
                } else {
                    mh6Var.y1(false, true);
                    if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                        if (tL_error != null) {
                            ff6Var.x = false;
                            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                mh6Var.z1(jb6.M0(2131745804, null), tL_error.text);
                                break;
                            } else {
                                int intValue = Utilities.z(tL_error.text).intValue();
                                mh6Var.z1(jb6.M0(2131745804, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
                                break;
                            }
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
                        alertDialog$Builder.j(jb6.M0(2131751708, null), new nv4(ff6Var, tLObject, (byte) 19));
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        he heVar = alertDialog$Builder.a;
                        if (isEmpty) {
                            heVar.U = jb6.M0(2131742462, null);
                        } else {
                            heVar.U = jb6.M0(2131742467, null);
                        }
                        heVar.S = jb6.M0(2131743618, null);
                        Dialog showDialog = mh6Var.showDialog(heVar);
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

    public /* synthetic */ af6(ff6 ff6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.b = ff6Var;
        this.c = tL_error;
        this.f = tLObject;
        this.d = str;
        this.e = str2;
    }
}
