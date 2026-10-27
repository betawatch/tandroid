package bi;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.fl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s7(ca caVar, Utilities.Callback callback, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                boolean[] zArr = (boolean[]) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                if (callback != null && !this.c[0]) {
                    callback.run(Boolean.FALSE);
                    if (!zArr[0]) {
                        callback2.run("cancelled", 0L);
                        zArr[0] = true;
                        break;
                    }
                }
                break;
            case 1:
                Utilities.Callback callback3 = (Utilities.Callback) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                Utilities.Callback callback4 = (Utilities.Callback) this.e;
                if (callback3 != null && !this.c[0]) {
                    callback3.run(Boolean.FALSE);
                    if (!zArr2[0] && callback4 != null) {
                        callback4.run("cancelled");
                        zArr2[0] = true;
                        break;
                    }
                }
                break;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.b;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.d;
                org.telegram.ui.ActionBar.k3[] k3VarArr2 = (org.telegram.ui.ActionBar.k3[]) this.e;
                this.c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.k3 k3Var = k3VarArr[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                    k3VarArr[0] = null;
                }
                fl0.a = null;
                org.telegram.ui.ActionBar.k3 k3Var2 = k3VarArr2[0];
                if (k3Var2 != null) {
                    k3Var2.dismiss();
                    k3VarArr2[0] = null;
                    break;
                }
                break;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
                di.x7 x7Var = (di.x7) this.d;
                String str = (String) this.e;
                a1Var.getClass();
                boolean[] zArr3 = this.c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    a1Var.x(x7Var, "requested_chat_failed", org.telegram.ui.web.a1.A(str, "req_id"));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s7(org.telegram.ui.web.a1 a1Var, boolean[] zArr, di.x7 x7Var, String str) {
        this.a = 3;
        this.b = a1Var;
        this.c = zArr;
        this.d = x7Var;
        this.e = str;
    }

    public /* synthetic */ s7(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.k3[] k3VarArr, org.telegram.ui.ActionBar.k3[] k3VarArr2) {
        this.a = 2;
        this.c = zArr;
        this.b = inputtonconnectoauthsessionArr;
        this.d = k3VarArr;
        this.e = k3VarArr2;
    }
}
