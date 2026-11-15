package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.di0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k6(v8 v8Var, z10 z10Var, boolean[] zArr, boolean[] zArr2, Object obj, int i7) {
        this.a = i7;
        this.b = z10Var;
        this.c = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                z10 z10Var = (z10) this.b;
                boolean[] zArr = (boolean[]) this.d;
                s10 s10Var = (s10) this.e;
                if (z10Var != null && !this.c[0]) {
                    z10Var.a(Boolean.FALSE);
                    if (!zArr[0]) {
                        s10Var.a("cancelled", 0L);
                        zArr[0] = true;
                        break;
                    }
                }
                break;
            case 1:
                z10 z10Var2 = (z10) this.b;
                boolean[] zArr2 = (boolean[]) this.d;
                z10 z10Var3 = (z10) this.e;
                if (z10Var2 != null && !this.c[0]) {
                    z10Var2.a(Boolean.FALSE);
                    if (!zArr2[0] && z10Var3 != null) {
                        z10Var3.a("cancelled");
                        zArr2[0] = true;
                        break;
                    }
                }
                break;
            case 2:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.b;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.d;
                org.telegram.ui.ActionBar.u2[] u2VarArr2 = (org.telegram.ui.ActionBar.u2[]) this.e;
                this.c[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.u2 u2Var = u2VarArr[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                    u2VarArr[0] = null;
                }
                di0.a = null;
                org.telegram.ui.ActionBar.u2 u2Var2 = u2VarArr2[0];
                if (u2Var2 != null) {
                    u2Var2.dismiss();
                    u2VarArr2[0] = null;
                    break;
                }
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.b;
                fi.i7 i7Var = (fi.i7) this.d;
                String str = (String) this.e;
                v0Var.getClass();
                boolean[] zArr3 = this.c;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    v0Var.x(i7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str, "req_id"));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k6(org.telegram.ui.web.v0 v0Var, boolean[] zArr, fi.i7 i7Var, String str) {
        this.a = 3;
        this.b = v0Var;
        this.c = zArr;
        this.d = i7Var;
        this.e = str;
    }

    public /* synthetic */ k6(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.u2[] u2VarArr, org.telegram.ui.ActionBar.u2[] u2VarArr2) {
        this.a = 2;
        this.c = zArr;
        this.b = inputtonconnectoauthsessionArr;
        this.d = u2VarArr;
        this.e = u2VarArr2;
    }
}
