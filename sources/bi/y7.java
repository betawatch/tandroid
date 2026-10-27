package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y7 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y7(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                d5.i iVar = (d5.i) this.b;
                lc lcVar = (lc) this.c;
                int i10 = iVar.a;
                boolean z10 = i10 == 0;
                AndroidUtilities.runOnUIThread(new u7(lcVar, z10, z10 ? null : BillingController.getResponseCodeString(i10), 1));
                break;
            case 1:
                d5.i iVar2 = (d5.i) this.b;
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.c;
                int i11 = iVar2.a;
                boolean z11 = i11 == 0;
                AndroidUtilities.runOnUIThread(new u7(r1Var, z11, z11 ? null : BillingController.getResponseCodeString(i11), 2));
                break;
            case 2:
                fi.e6.X((fi.ta) this.b, (rg.s0) this.c, (Integer) obj);
                break;
            case 3:
                org.telegram.ui.f5 f5Var = (org.telegram.ui.f5) this.b;
                org.telegram.ui.a5 a5Var = (org.telegram.ui.a5) this.c;
                org.telegram.ui.g5[] g5VarArr = a5Var.i;
                org.telegram.ui.c5 c5Var = a5Var.j;
                if (!f5Var.E) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            f5Var.a(org.telegram.ui.a5.a((TLRPC.Chat) c5Var.c, (TLRPC.ChatFull) obj, g5VarArr));
                            break;
                        }
                    } else {
                        f5Var.a(org.telegram.ui.a5.c((TLRPC.User) c5Var.c, (TLRPC.UserFull) obj, g5VarArr));
                        break;
                    }
                }
                break;
            case 4:
                d5.i iVar3 = (d5.i) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                if (iVar3.a == 0) {
                    AndroidUtilities.runOnUIThread(new fi.ea(2, callback));
                    break;
                }
                break;
            default:
                d5.i iVar4 = (d5.i) this.b;
                vg.v vVar = (vg.v) this.c;
                if (iVar4.a == 0) {
                    AndroidUtilities.runOnUIThread(new ti.g(vVar, 9));
                    break;
                }
                break;
        }
    }
}
