package bi;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                    k7Var.U1(this.b, bVar, runnable);
                    break;
                }
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.c;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.d;
                org.telegram.ui.Wallet.s sVar = (org.telegram.ui.Wallet.s) this.e;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f;
                byte[] bArr = (byte[]) obj;
                if (!d2Var.j(z1Var) && d2Var.A(z1Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = z1Var.a.id;
                    tonconnectclaimrequest.msg_id = z1Var.b;
                    tonconnectclaimrequest.app_request_id = z1Var.d;
                    boolean z9 = this.b;
                    tonconnectclaimrequest.declined = z9;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    d2Var.f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.u1(d2Var, bArr, z1Var, sVar, z9, i0Var));
                    break;
                } else {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    sVar.a("Request expired or wallet changed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n3(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, org.telegram.ui.Wallet.s sVar, boolean z9, org.telegram.ui.Wallet.i0 i0Var) {
        this.c = d2Var;
        this.d = z1Var;
        this.e = sVar;
        this.b = z9;
        this.f = i0Var;
    }
}
