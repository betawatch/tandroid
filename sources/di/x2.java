package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.k10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.p51;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements y10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x2(f6 f6Var, boolean z10, vf.b bVar, Runnable runnable, DialogInterface dialogInterface) {
        this.c = f6Var;
        this.b = z10;
        this.d = bVar;
        this.e = runnable;
        this.f = dialogInterface;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.c;
                vf.b bVar = (vf.b) this.d;
                Runnable runnable = (Runnable) this.e;
                DialogInterface dialogInterface = (DialogInterface) this.f;
                if (!((Boolean) obj).booleanValue()) {
                    bVar.c(false);
                    dialogInterface.dismiss();
                    runnable.run();
                    break;
                } else {
                    k10 i7 = k10.i(f6Var.a);
                    i7.y = null;
                    i7.v(false);
                    f6Var.i2(this.b, bVar, runnable);
                    break;
                }
            default:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.c;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.d;
                p51 p51Var = (p51) this.e;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.f;
                byte[] bArr = (byte[]) obj;
                if (!l2Var.j(h2Var) && l2Var.A(h2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = h2Var.a.id;
                    tonconnectclaimrequest.msg_id = h2Var.b;
                    tonconnectclaimrequest.app_request_id = h2Var.d;
                    boolean z10 = this.b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    l2Var.f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.c2(l2Var, bArr, h2Var, p51Var, z10, r0Var));
                    break;
                } else {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    p51Var.a("Request expired or wallet changed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x2(org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.h2 h2Var, p51 p51Var, boolean z10, org.telegram.ui.Wallet.r0 r0Var) {
        this.c = l2Var;
        this.d = h2Var;
        this.e = p51Var;
        this.b = z10;
        this.f = r0Var;
    }
}
