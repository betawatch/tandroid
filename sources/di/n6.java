package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.gi0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n6(x8 x8Var, x10 x10Var, boolean[] zArr, boolean[] zArr2, Object obj, int i7) {
        this.a = i7;
        this.b = x10Var;
        this.c = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                x10 x10Var = (x10) this.b;
                boolean[] zArr = (boolean[]) this.d;
                q10 q10Var = (q10) this.e;
                if (x10Var != null && !this.c[0]) {
                    x10Var.a(Boolean.FALSE);
                    if (!zArr[0]) {
                        q10Var.a("cancelled", 0L);
                        zArr[0] = true;
                        break;
                    }
                }
                break;
            case 1:
                x10 x10Var2 = (x10) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                x10 x10Var3 = (x10) this.e;
                if (x10Var2 != null && !this.c[0]) {
                    x10Var2.a(Boolean.FALSE);
                    if (!zArr2[0] && x10Var3 != null) {
                        x10Var3.a("cancelled");
                        zArr2[0] = true;
                        break;
                    }
                }
                break;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.b;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) this.d;
                org.telegram.ui.ActionBar.x2[] x2VarArr2 = (org.telegram.ui.ActionBar.x2[]) this.e;
                this.c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.x2 x2Var = x2VarArr[0];
                if (x2Var != null) {
                    x2Var.dismiss();
                    x2VarArr[0] = null;
                }
                gi0.a = null;
                org.telegram.ui.ActionBar.x2 x2Var2 = x2VarArr2[0];
                if (x2Var2 != null) {
                    x2Var2.dismiss();
                    x2VarArr2[0] = null;
                    break;
                }
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.b;
                fi.f7 f7Var = (fi.f7) this.d;
                String str = (String) this.e;
                v0Var.getClass();
                boolean[] zArr3 = this.c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    v0Var.x(f7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str, "req_id"));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n6(org.telegram.ui.web.v0 v0Var, boolean[] zArr, fi.f7 f7Var, String str) {
        this.a = 3;
        this.b = v0Var;
        this.c = zArr;
        this.d = f7Var;
        this.e = str;
    }

    public /* synthetic */ n6(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.x2[] x2VarArr, org.telegram.ui.ActionBar.x2[] x2VarArr2) {
        this.a = 2;
        this.c = zArr;
        this.b = inputtonconnectoauthsessionArr;
        this.d = x2VarArr;
        this.e = x2VarArr2;
    }
}
