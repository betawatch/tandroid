package bi;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.c;
                org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.d;
                org.telegram.ui.Wallet.t tVar = (org.telegram.ui.Wallet.t) this.e;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f;
                byte[] bArr = (byte[]) obj;
                if (!f2Var.j(b2Var) && f2Var.A(b2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = b2Var.a.id;
                    tonconnectclaimrequest.msg_id = b2Var.b;
                    tonconnectclaimrequest.app_request_id = b2Var.d;
                    boolean z9 = this.b;
                    tonconnectclaimrequest.declined = z9;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    f2Var.f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.w1(f2Var, bArr, b2Var, tVar, z9, k0Var));
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

    public /* synthetic */ n3(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.b2 b2Var, org.telegram.ui.Wallet.t tVar, boolean z9, org.telegram.ui.Wallet.k0 k0Var) {
        this.c = f2Var;
        this.d = b2Var;
        this.e = tVar;
        this.b = z9;
        this.f = k0Var;
    }
}
