package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c90;
import org.telegram.ui.gm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                o6.Z((mb) this.b, (qg.s0) this.c, (Integer) obj);
                break;
            case 1:
                org.telegram.ui.g5 g5Var = (org.telegram.ui.g5) this.b;
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.c;
                org.telegram.ui.h5[] h5VarArr = b5Var.i;
                org.telegram.ui.d5 d5Var = b5Var.j;
                if (!g5Var.E) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            g5Var.a(org.telegram.ui.b5.a((TLRPC.Chat) d5Var.c, (TLRPC.ChatFull) obj, h5VarArr));
                            break;
                        }
                    } else {
                        g5Var.a(org.telegram.ui.b5.c((TLRPC.User) d5Var.c, (TLRPC.UserFull) obj, h5VarArr));
                        break;
                    }
                }
                break;
            case 2:
                c5.i iVar = (c5.i) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                if (iVar.a == 0) {
                    AndroidUtilities.runOnUIThread(new wa(2, callback));
                    break;
                }
                break;
            case 3:
                c5.i iVar2 = (c5.i) this.b;
                ug.v vVar = (ug.v) this.c;
                if (iVar2.a == 0) {
                    AndroidUtilities.runOnUIThread(new ri.h0(vVar, 16));
                    break;
                }
                break;
            case 4:
                c5.i iVar3 = (c5.i) this.b;
                c90 c90Var = (c90) this.c;
                int i10 = iVar3.a;
                boolean z10 = i10 == 0;
                AndroidUtilities.runOnUIThread(new gm0(c90Var, z10, z10 ? null : BillingController.getResponseCodeString(i10), 17));
                break;
            default:
                c5.i iVar4 = (c5.i) this.b;
                rh.r rVar = (rh.r) this.c;
                int i11 = iVar4.a;
                boolean z11 = i11 == 0;
                AndroidUtilities.runOnUIThread(new gm0(rVar, z11, z11 ? null : BillingController.getResponseCodeString(i11), 18));
                break;
        }
    }
}
