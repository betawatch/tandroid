package bi;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n3 implements c20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n3(k7 k7Var, boolean z9, vf.b bVar, Runnable runnable, DialogInterface dialogInterface) {
        this.c = k7Var;
        this.b = z9;
        this.d = bVar;
        this.e = runnable;
        this.f = dialogInterface;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.c;
                vf.b bVar = (vf.b) this.d;
                Runnable runnable = (Runnable) this.e;
                DialogInterface dialogInterface = (DialogInterface) this.f;
                if (!((Boolean) obj).booleanValue()) {
                    bVar.c(false);
                    dialogInterface.dismiss();
                    runnable.run();
                    break;
                } else {
                    p10 i7 = p10.i(k7Var.a);
                    i7.y = null;
                    i7.v(false);
                    k7Var.V1(this.b, bVar, runnable);
                    break;
                }
            default:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.c;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.d;
                org.telegram.ui.Wallet.t tVar = (org.telegram.ui.Wallet.t) this.e;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.f;
                byte[] bArr = (byte[]) obj;
                if (!e2Var.j(a2Var) && e2Var.A(a2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = a2Var.a.id;
                    tonconnectclaimrequest.msg_id = a2Var.b;
                    tonconnectclaimrequest.app_request_id = a2Var.d;
                    boolean z9 = this.b;
                    tonconnectclaimrequest.declined = z9;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    e2Var.f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.v1(e2Var, bArr, a2Var, tVar, z9, j0Var));
                    break;
                } else {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    tVar.a("Request expired or wallet changed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n3(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, org.telegram.ui.Wallet.t tVar, boolean z9, org.telegram.ui.Wallet.j0 j0Var) {
        this.c = e2Var;
        this.d = a2Var;
        this.e = tVar;
        this.b = z9;
        this.f = j0Var;
    }
}
