package di;

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.messenger.i10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.a31;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements w10 {
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

    @Override // org.telegram.messenger.w10
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
                    i10 i7 = i10.i(f6Var.a);
                    i7.y = null;
                    i7.v(false);
                    f6Var.i2(this.b, bVar, runnable);
                    break;
                }
            default:
                org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.c;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.d;
                a31 a31Var = (a31) this.e;
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) this.f;
                byte[] bArr = (byte[]) obj;
                if (!m2Var.j(i2Var) && m2Var.A(i2Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = i2Var.a.id;
                    tonconnectclaimrequest.msg_id = i2Var.b;
                    tonconnectclaimrequest.app_request_id = i2Var.d;
                    boolean z10 = this.b;
                    tonconnectclaimrequest.declined = z10;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    m2Var.f.sendRequestTyped(tonconnectclaimrequest, new d3.b(1), new org.telegram.ui.Wallet.d2(m2Var, bArr, i2Var, a31Var, z10, s0Var));
                    break;
                } else {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    a31Var.a("Request expired or wallet changed");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x2(org.telegram.ui.Wallet.m2 m2Var, org.telegram.ui.Wallet.i2 i2Var, a31 a31Var, boolean z10, org.telegram.ui.Wallet.s0 s0Var) {
        this.c = m2Var;
        this.d = i2Var;
        this.e = a31Var;
        this.b = z10;
        this.f = s0Var;
    }
}
