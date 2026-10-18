package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b8(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                c5.i iVar = (c5.i) this.b;
                tc tcVar = (tc) this.c;
                int i10 = iVar.a;
                boolean z10 = i10 == 0;
                AndroidUtilities.runOnUIThread(new x7(tcVar, z10, z10 ? null : BillingController.getResponseCodeString(i10), 1));
                break;
            case 1:
                c5.i iVar2 = (c5.i) this.b;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.c;
                int i11 = iVar2.a;
                boolean z11 = i11 == 0;
                AndroidUtilities.runOnUIThread(new x7(s1Var, z11, z11 ? null : BillingController.getResponseCodeString(i11), 2));
                break;
            case 2:
                ei.f6.Z((ei.xa) this.b, (qg.u0) this.c, (Integer) obj);
                break;
            case 3:
                org.telegram.ui.h5 h5Var = (org.telegram.ui.h5) this.b;
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.c;
                org.telegram.ui.i5[] i5VarArr = c5Var.i;
                org.telegram.ui.e5 e5Var = c5Var.j;
                if (!h5Var.E) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            h5Var.a(org.telegram.ui.c5.a((TLRPC.Chat) e5Var.c, (TLRPC.ChatFull) obj, i5VarArr));
                            break;
                        }
                    } else {
                        h5Var.a(org.telegram.ui.c5.c((TLRPC.User) e5Var.c, (TLRPC.UserFull) obj, i5VarArr));
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
                ug.u uVar = (ug.u) this.c;
                if (iVar4.a == 0) {
                    AndroidUtilities.runOnUIThread(new tg.p(uVar, 6));
                    break;
                }
                break;
        }
    }
}
