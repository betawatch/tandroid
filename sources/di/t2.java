package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.m10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements z10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t2(c6 c6Var, boolean z10, vf.b bVar, Runnable runnable, DialogInterface dialogInterface) {
        this.c = c6Var;
        this.b = z10;
        this.d = bVar;
        this.e = runnable;
        this.f = dialogInterface;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.c;
                vf.b bVar = (vf.b) this.d;
                Runnable runnable = (Runnable) this.e;
                DialogInterface dialogInterface = (DialogInterface) this.f;
                if (!((Boolean) obj).booleanValue()) {
                    bVar.c(false);
                    dialogInterface.dismiss();
                    runnable.run();
                    break;
                } else {
                    m10 i7 = m10.i(c6Var.a);
                    i7.y = null;
                    i7.v(false);
                    c6Var.W1(this.b, bVar, runnable);
                    break;
                }
            default:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.c;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.d;
                x21 x21Var = (x21) this.e;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f;
                byte[] bArr = (byte[]) obj;
                if (!d2Var.j(z1Var) && d2Var.A(z1Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = z1Var.a.id;
                    tonconnectclaimrequest.msg_id = z1Var.b;
                    tonconnectclaimrequest.app_request_id = z1Var.d;
                    boolean z10 = this.b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    d2Var.f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.u1(d2Var, bArr, z1Var, x21Var, z10, i0Var));
                    break;
                } else {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    x21Var.a("Request expired or wallet changed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t2(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, x21 x21Var, boolean z10, org.telegram.ui.Wallet.i0 i0Var) {
        this.c = d2Var;
        this.d = z1Var;
        this.e = x21Var;
        this.b = z10;
        this.f = i0Var;
    }
}
