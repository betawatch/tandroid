package eg;

import ih.i5;
import jh.r5;
import nh.ja;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c5;
import org.telegram.ui.d5;
import org.telegram.ui.x4;
import org.telegram.ui.z4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                p2.g gVar = (p2.g) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                if (gVar.a == 0) {
                    AndroidUtilities.runOnUIThread(new o0(1, callback));
                    break;
                }
                break;
            case 1:
                p2.g gVar2 = (p2.g) this.b;
                u0 u0Var = (u0) this.c;
                if (gVar2.a == 0) {
                    AndroidUtilities.runOnUIThread(new cg.m2(u0Var, 10));
                    break;
                }
                break;
            case 2:
                p2.g gVar3 = (p2.g) this.b;
                i5 i5Var = (i5) this.c;
                int i10 = gVar3.a;
                boolean z10 = i10 == 0;
                AndroidUtilities.runOnUIThread(new r5(i5Var, z10, z10 ? null : BillingController.getResponseCodeString(i10), 1));
                break;
            case 3:
                p2.g gVar4 = (p2.g) this.b;
                bh.v vVar = (bh.v) this.c;
                int i11 = gVar4.a;
                boolean z11 = i11 == 0;
                AndroidUtilities.runOnUIThread(new r5(vVar, z11, z11 ? null : BillingController.getResponseCodeString(i11), 2));
                break;
            case 4:
                t5.Z((ja) this.b, (ag.h1) this.c, (Integer) obj);
                break;
            default:
                c5 c5Var = (c5) this.b;
                x4 x4Var = (x4) this.c;
                d5[] d5VarArr = x4Var.i;
                z4 z4Var = x4Var.j;
                if (!c5Var.A) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            c5Var.a(x4.a((TLRPC.Chat) z4Var.c, (TLRPC.ChatFull) obj, d5VarArr));
                            break;
                        }
                    } else {
                        c5Var.a(x4.c((TLRPC.User) z4Var.c, (TLRPC.UserFull) obj, d5VarArr));
                        break;
                    }
                }
                break;
        }
    }
}
