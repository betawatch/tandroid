package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class aj0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aj0(org.telegram.ui.web.z0 z0Var, boolean[] zArr, org.telegram.ui.web.x0 x0Var, String str) {
        this.a = 1;
        this.c = z0Var;
        this.b = zArr;
        this.d = x0Var;
        this.e = str;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.c;
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) this.d;
                org.telegram.ui.ActionBar.z2[] z2VarArr2 = (org.telegram.ui.ActionBar.z2[]) this.e;
                this.b[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                org.telegram.ui.ActionBar.z2 z2Var = z2VarArr[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                    z2VarArr[0] = null;
                }
                jj0.a = null;
                org.telegram.ui.ActionBar.z2 z2Var2 = z2VarArr2[0];
                if (z2Var2 != null) {
                    z2Var2.dismiss();
                    z2VarArr2[0] = null;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.c;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.d;
                String str = (String) this.e;
                z0Var.getClass();
                boolean[] zArr = this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    z0Var.y(x0Var, "requested_chat_failed", org.telegram.ui.web.z0.A(str, "req_id"));
                    break;
                }
                break;
            case 2:
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.c;
                boolean[] zArr2 = (boolean[]) this.d;
                org.telegram.messenger.j20 j20Var = (org.telegram.messenger.j20) this.e;
                if (q20Var != null && !this.b[0]) {
                    q20Var.a(Boolean.FALSE);
                    if (!zArr2[0]) {
                        j20Var.a("cancelled", 0L);
                        zArr2[0] = true;
                        break;
                    }
                }
                break;
            default:
                org.telegram.messenger.q20 q20Var2 = (org.telegram.messenger.q20) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                org.telegram.messenger.q20 q20Var3 = (org.telegram.messenger.q20) this.e;
                if (q20Var2 != null && !this.b[0]) {
                    q20Var2.a(Boolean.FALSE);
                    if (!zArr3[0] && q20Var3 != null) {
                        q20Var3.a("cancelled");
                        zArr3[0] = true;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ aj0(rh.e6 e6Var, org.telegram.messenger.q20 q20Var, boolean[] zArr, boolean[] zArr2, Object obj, int i10) {
        this.a = i10;
        this.c = q20Var;
        this.b = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    public /* synthetic */ aj0(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, org.telegram.ui.ActionBar.z2[] z2VarArr, org.telegram.ui.ActionBar.z2[] z2VarArr2) {
        this.a = 0;
        this.b = zArr;
        this.c = inputtonconnectoauthsessionArr;
        this.d = z2VarArr;
        this.e = z2VarArr2;
    }
}
