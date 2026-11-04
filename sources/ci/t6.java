package ci;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.yh0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t6(e9 e9Var, u10 u10Var, boolean[] zArr, boolean[] zArr2, Object obj, int i3) {
        this.a = i3;
        this.b = u10Var;
        this.c = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                u10 u10Var = (u10) this.b;
                boolean[] zArr = (boolean[]) this.d;
                n10 n10Var = (n10) this.e;
                if (u10Var != null && !this.c[0]) {
                    u10Var.a(Boolean.FALSE);
                    if (!zArr[0]) {
                        n10Var.a("cancelled", 0L);
                        zArr[0] = true;
                        break;
                    }
                }
                break;
            case 1:
                u10 u10Var2 = (u10) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                u10 u10Var3 = (u10) this.e;
                if (u10Var2 != null && !this.c[0]) {
                    u10Var2.a(Boolean.FALSE);
                    if (!zArr2[0] && u10Var3 != null) {
                        u10Var3.a("cancelled");
                        zArr2[0] = true;
                        break;
                    }
                }
                break;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.b;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.d;
                org.telegram.ui.ActionBar.t2[] t2VarArr2 = (org.telegram.ui.ActionBar.t2[]) this.e;
                this.c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.t2 t2Var = t2VarArr[0];
                if (t2Var != null) {
                    t2Var.dismiss();
                    t2VarArr[0] = null;
                }
                yh0.a = null;
                org.telegram.ui.ActionBar.t2 t2Var2 = t2VarArr2[0];
                if (t2Var2 != null) {
                    t2Var2.dismiss();
                    t2VarArr2[0] = null;
                    break;
                }
                break;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.b;
                ei.p7 p7Var = (ei.p7) this.d;
                String str = (String) this.e;
                w0Var.getClass();
                boolean[] zArr3 = this.c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    w0Var.x(p7Var, "requested_chat_failed", org.telegram.ui.web.w0.A(str, "req_id"));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t6(org.telegram.ui.web.w0 w0Var, boolean[] zArr, ei.p7 p7Var, String str) {
        this.a = 3;
        this.b = w0Var;
        this.c = zArr;
        this.d = p7Var;
        this.e = str;
    }

    public /* synthetic */ t6(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.t2[] t2VarArr, org.telegram.ui.ActionBar.t2[] t2VarArr2) {
        this.a = 2;
        this.c = zArr;
        this.b = inputtonconnectoauthsessionArr;
        this.d = t2VarArr;
        this.e = t2VarArr2;
    }
}
