package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c8 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c8(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                c5.i iVar = (c5.i) this.b;
                uc ucVar = (uc) this.c;
                int i10 = iVar.a;
                boolean z10 = i10 == 0;
                AndroidUtilities.runOnUIThread(new y7(ucVar, z10, z10 ? null : BillingController.getResponseCodeString(i10), 1));
                break;
            case 1:
                c5.i iVar2 = (c5.i) this.b;
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.c;
                int i11 = iVar2.a;
                boolean z11 = i11 == 0;
                AndroidUtilities.runOnUIThread(new y7(r1Var, z11, z11 ? null : BillingController.getResponseCodeString(i11), 2));
                break;
            case 2:
                ei.f6.Y((ei.xa) this.b, (qg.u0) this.c, (Integer) obj);
                break;
            case 3:
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
            case 4:
                c5.i iVar3 = (c5.i) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                if (iVar3.a == 0) {
                    AndroidUtilities.runOnUIThread(new ei.ia(2, callback));
                    break;
                }
                break;
            default:
                c5.i iVar4 = (c5.i) this.b;
                ug.t tVar = (ug.t) this.c;
                if (iVar4.a == 0) {
                    AndroidUtilities.runOnUIThread(new tg.p(tVar, 6));
                    break;
                }
                break;
        }
    }
}
