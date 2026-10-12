package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d90;
import org.telegram.ui.ma0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                    AndroidUtilities.runOnUIThread(new rh.j(vVar, 16));
                    break;
                }
                break;
            case 4:
                c5.i iVar3 = (c5.i) this.b;
                d90 d90Var = (d90) this.c;
                int i10 = iVar3.a;
                boolean z10 = i10 == 0;
                AndroidUtilities.runOnUIThread(new ma0(d90Var, z10, z10 ? null : BillingController.getResponseCodeString(i10), 17));
                break;
            default:
                c5.i iVar4 = (c5.i) this.b;
                rh.s sVar = (rh.s) this.c;
                int i11 = iVar4.a;
                boolean z11 = i11 == 0;
                AndroidUtilities.runOnUIThread(new ma0(sVar, z11, z11 ? null : BillingController.getResponseCodeString(i11), 18));
                break;
        }
    }
}
