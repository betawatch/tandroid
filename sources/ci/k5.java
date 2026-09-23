package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e80;
import org.telegram.ui.vl0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                q6.Z((nb) this.b, (pg.t0) this.c, (Integer) obj);
                break;
            case 1:
                org.telegram.ui.d5 d5Var = (org.telegram.ui.d5) this.b;
                org.telegram.ui.y4 y4Var = (org.telegram.ui.y4) this.c;
                org.telegram.ui.e5[] e5VarArr = y4Var.i;
                org.telegram.ui.a5 a5Var = y4Var.j;
                if (!d5Var.E) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            d5Var.a(org.telegram.ui.y4.a((TLRPC.Chat) a5Var.c, (TLRPC.ChatFull) obj, e5VarArr));
                            break;
                        }
                    } else {
                        d5Var.a(org.telegram.ui.y4.c((TLRPC.User) a5Var.c, (TLRPC.UserFull) obj, e5VarArr));
                        break;
                    }
                }
                break;
            case 2:
                c5.h hVar = (c5.h) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                if (hVar.a == 0) {
                    AndroidUtilities.runOnUIThread(new xa(2, callback));
                    break;
                }
                break;
            case 3:
                c5.h hVar2 = (c5.h) this.b;
                tg.w wVar = (tg.w) this.c;
                if (hVar2.a == 0) {
                    AndroidUtilities.runOnUIThread(new rg.w1(wVar, 6));
                    break;
                }
                break;
            case 4:
                c5.h hVar3 = (c5.h) this.b;
                e80 e80Var = (e80) this.c;
                int i10 = hVar3.a;
                boolean z10 = i10 == 0;
                AndroidUtilities.runOnUIThread(new vl0(e80Var, z10, z10 ? null : BillingController.getResponseCodeString(i10), 13));
                break;
            default:
                c5.h hVar4 = (c5.h) this.b;
                ai.m0 m0Var = (ai.m0) this.c;
                int i11 = hVar4.a;
                boolean z11 = i11 == 0;
                AndroidUtilities.runOnUIThread(new vl0(m0Var, z11, z11 ? null : BillingController.getResponseCodeString(i11), 14));
                break;
        }
    }
}
