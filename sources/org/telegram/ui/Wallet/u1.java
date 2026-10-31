package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements q20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u1(e2 e2Var, a2 a2Var, f11 f11Var, boolean z10, h0 h0Var) {
        this.c = e2Var;
        this.d = a2Var;
        this.e = f11Var;
        this.b = z10;
        this.f = h0Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                e2 e2Var = (e2) this.c;
                a2 a2Var = (a2) this.d;
                f11 f11Var = (f11) this.e;
                h0 h0Var = (h0) this.f;
                byte[] bArr = (byte[]) obj;
                if (!e2Var.j(a2Var) && e2Var.A(a2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = a2Var.a.id;
                    tonconnectclaimrequest.msg_id = a2Var.b;
                    tonconnectclaimrequest.app_request_id = a2Var.d;
                    boolean z10 = this.b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    e2Var.f.sendRequestTyped(tonconnectclaimrequest, new a3.b(1), new v1(e2Var, bArr, a2Var, f11Var, z10, h0Var));
                    break;
                } else {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    f11Var.a("Request expired or wallet changed");
                    break;
                }
                break;
            default:
                rh.e4 e4Var = (rh.e4) this.c;
                gf.e eVar = (gf.e) this.d;
                Runnable runnable = (Runnable) this.e;
                DialogInterface dialogInterface = (DialogInterface) this.f;
                if (!((Boolean) obj).booleanValue()) {
                    eVar.c(false);
                    dialogInterface.dismiss();
                    runnable.run();
                    break;
                } else {
                    d20 i10 = d20.i(e4Var.a);
                    i10.y = null;
                    i10.v(false);
                    e4Var.V1(this.b, eVar, runnable);
                    break;
                }
        }
    }

    public /* synthetic */ u1(rh.e4 e4Var, boolean z10, gf.e eVar, Runnable runnable, DialogInterface dialogInterface) {
        this.c = e4Var;
        this.b = z10;
        this.d = eVar;
        this.e = runnable;
        this.f = dialogInterface;
    }
}
