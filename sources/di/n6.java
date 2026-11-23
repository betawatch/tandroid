package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.gi0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n6(y8 y8Var, y10 y10Var, boolean[] zArr, boolean[] zArr2, Object obj, int i7) {
        this.a = i7;
        this.b = y10Var;
        this.c = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                y10 y10Var = (y10) this.b;
                boolean[] zArr = (boolean[]) this.d;
                r10 r10Var = (r10) this.e;
                if (y10Var != null && !this.c[0]) {
                    y10Var.a(Boolean.FALSE);
                    if (!zArr[0]) {
                        r10Var.a("cancelled", 0L);
                        zArr[0] = true;
                        break;
                    }
                }
                break;
            case 1:
                y10 y10Var2 = (y10) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                y10 y10Var3 = (y10) this.e;
                if (y10Var2 != null && !this.c[0]) {
                    y10Var2.a(Boolean.FALSE);
                    if (!zArr2[0] && y10Var3 != null) {
                        y10Var3.a("cancelled");
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
                gi0.a = null;
                org.telegram.ui.ActionBar.w2 w2Var2 = w2VarArr2[0];
                if (w2Var2 != null) {
                    w2Var2.dismiss();
                    w2VarArr2[0] = null;
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

    public /* synthetic */ n6(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.w2[] w2VarArr, org.telegram.ui.ActionBar.w2[] w2VarArr2) {
        this.a = 2;
        this.c = zArr;
        this.b = inputtonconnectoauthsessionArr;
        this.d = w2VarArr;
        this.e = w2VarArr2;
    }
}
