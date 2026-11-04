package ci;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.h10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.e51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements u10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a3(l6 l6Var, boolean z10, sf.b bVar, Runnable runnable, DialogInterface dialogInterface) {
        this.c = l6Var;
        this.b = z10;
        this.d = bVar;
        this.e = runnable;
        this.f = dialogInterface;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.c;
                sf.b bVar = (sf.b) this.d;
                Runnable runnable = (Runnable) this.e;
                DialogInterface dialogInterface = (DialogInterface) this.f;
                if (!((Boolean) obj).booleanValue()) {
                    bVar.c(false);
                    dialogInterface.dismiss();
                    runnable.run();
                    break;
                } else {
                    h10 i3 = h10.i(l6Var.a);
                    i3.y = null;
                    i3.v(false);
                    l6Var.V1(this.b, bVar, runnable);
                    break;
                }
            default:
                org.telegram.ui.Wallet.c2 c2Var = (org.telegram.ui.Wallet.c2) this.c;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.d;
                e51 e51Var = (e51) this.e;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f;
                byte[] bArr = (byte[]) obj;
                if (!c2Var.j(y1Var) && c2Var.A(y1Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = y1Var.a.id;
                    tonconnectclaimrequest.msg_id = y1Var.b;
                    tonconnectclaimrequest.app_request_id = y1Var.d;
                    boolean z10 = this.b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    c2Var.f.sendRequestTyped(tonconnectclaimrequest, new c3.b(1), new org.telegram.ui.Wallet.t1(c2Var, bArr, y1Var, e51Var, z10, h0Var));
                    break;
                } else {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    e51Var.a("Request expired or wallet changed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a3(org.telegram.ui.Wallet.c2 c2Var, org.telegram.ui.Wallet.y1 y1Var, e51 e51Var, boolean z10, org.telegram.ui.Wallet.h0 h0Var) {
        this.c = c2Var;
        this.d = y1Var;
        this.e = e51Var;
        this.b = z10;
        this.f = h0Var;
    }
}
