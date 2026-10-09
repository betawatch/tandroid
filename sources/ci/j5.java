package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f90;
import org.telegram.ui.ha0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                q6.Z((nb) this.b, (pg.u0) this.c, (Integer) obj);
                break;
            case 1:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.b;
                org.telegram.ui.x4 x4Var = (org.telegram.ui.x4) this.c;
                org.telegram.ui.d5[] d5VarArr = x4Var.i;
                org.telegram.ui.z4 z4Var = x4Var.j;
                if (!c5Var.E) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            c5Var.a(org.telegram.ui.x4.a((TLRPC.Chat) z4Var.c, (TLRPC.ChatFull) obj, d5VarArr));
                            break;
                        }
                    } else {
                        c5Var.a(org.telegram.ui.x4.c((TLRPC.User) z4Var.c, (TLRPC.UserFull) obj, d5VarArr));
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
                tg.v vVar = (tg.v) this.c;
                if (hVar2.a == 0) {
                    AndroidUtilities.runOnUIThread(new rg.x1(vVar, 10));
                    break;
                }
                break;
            case 4:
                c5.h hVar3 = (c5.h) this.b;
                f90 f90Var = (f90) this.c;
                int i10 = hVar3.a;
                boolean z10 = i10 == 0;
                AndroidUtilities.runOnUIThread(new ha0(f90Var, z10, z10 ? null : BillingController.getResponseCodeString(i10), 16));
                break;
            default:
                c5.h hVar4 = (c5.h) this.b;
                qh.r rVar = (qh.r) this.c;
                int i11 = hVar4.a;
                boolean z11 = i11 == 0;
                AndroidUtilities.runOnUIThread(new ha0(rVar, z11, z11 ? null : BillingController.getResponseCodeString(i11), 17));
                break;
        }
    }
}
