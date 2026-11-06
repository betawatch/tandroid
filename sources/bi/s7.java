package bi;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.bi0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.d;
                org.telegram.ui.ActionBar.v2[] v2VarArr2 = (org.telegram.ui.ActionBar.v2[]) this.e;
                this.c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.v2 v2Var = v2VarArr[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                    v2VarArr[0] = null;
                }
                bi0.a = null;
                org.telegram.ui.ActionBar.v2 v2Var2 = v2VarArr2[0];
                if (v2Var2 != null) {
                    v2Var2.dismiss();
                    v2VarArr2[0] = null;
                    break;
                }
                break;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.b;
                di.o7 o7Var = (di.o7) this.d;
                String str = (String) this.e;
                x0Var.getClass();
                boolean[] zArr3 = this.c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    x0Var.x(o7Var, "requested_chat_failed", org.telegram.ui.web.x0.A(str, "req_id"));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s7(org.telegram.ui.web.x0 x0Var, boolean[] zArr, di.o7 o7Var, String str) {
        this.a = 3;
        this.b = x0Var;
        this.c = zArr;
        this.d = o7Var;
        this.e = str;
    }

    public /* synthetic */ s7(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.v2[] v2VarArr, org.telegram.ui.ActionBar.v2[] v2VarArr2) {
        this.a = 2;
        this.c = zArr;
        this.b = inputtonconnectoauthsessionArr;
        this.d = v2VarArr;
        this.e = v2VarArr2;
    }
}
