package bi;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ei0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s7 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s7(ea eaVar, c20 c20Var, boolean[] zArr, boolean[] zArr2, Object obj, int i7) {
        this.a = i7;
        this.b = c20Var;
        this.c = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                c20 c20Var = (c20) this.b;
                boolean[] zArr = (boolean[]) this.d;
                v10 v10Var = (v10) this.e;
                if (c20Var != null && !this.c[0]) {
                    c20Var.a(Boolean.FALSE);
                    if (!zArr[0]) {
                        v10Var.a("cancelled", 0L);
                        zArr[0] = true;
                        break;
                    }
                }
                break;
            case 1:
                c20 c20Var2 = (c20) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                c20 c20Var3 = (c20) this.e;
                if (c20Var2 != null && !this.c[0]) {
                    c20Var2.a(Boolean.FALSE);
                    if (!zArr2[0] && c20Var3 != null) {
                        c20Var3.a("cancelled");
                        zArr2[0] = true;
                        break;
                    }
                }
                break;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.b;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.d;
                org.telegram.ui.ActionBar.w2[] w2VarArr2 = (org.telegram.ui.ActionBar.w2[]) this.e;
                this.c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.w2 w2Var = w2VarArr[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    w2VarArr[0] = null;
                }
                ei0.a = null;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2VarArr2[0];
                if (w2Var2 != null) {
                    w2Var2.dismiss();
                    w2VarArr2[0] = null;
                    break;
                }
                break;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.b;
                di.p7 p7Var = (di.p7) this.d;
                String str = (String) this.e;
                x0Var.getClass();
                boolean[] zArr3 = this.c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    x0Var.x(p7Var, "requested_chat_failed", org.telegram.ui.web.x0.A(str, "req_id"));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s7(org.telegram.ui.web.x0 x0Var, boolean[] zArr, di.p7 p7Var, String str) {
        this.a = 3;
        this.b = x0Var;
        this.c = zArr;
        this.d = p7Var;
        this.e = str;
    }

    public /* synthetic */ s7(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.w2[] w2VarArr, org.telegram.ui.ActionBar.w2[] w2VarArr2) {
        this.a = 2;
        this.c = zArr;
        this.b = inputtonconnectoauthsessionArr;
        this.d = w2VarArr;
        this.e = w2VarArr2;
    }
}
