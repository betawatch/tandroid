package bg;

import fh.w5;
import gh.u5;
import kh.g6;
import kh.ya;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b5;
import org.telegram.ui.c5;
import org.telegram.ui.w4;
import org.telegram.ui.y4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                n2.g gVar = (n2.g) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                if (gVar.a == 0) {
                    AndroidUtilities.runOnUIThread(new s0(1, callback));
                    break;
                }
                break;
            case 1:
                n2.g gVar2 = (n2.g) this.b;
                z0 z0Var = (z0) this.c;
                if (gVar2.a == 0) {
                    AndroidUtilities.runOnUIThread(new af.e(z0Var, 11));
                    break;
                }
                break;
            case 2:
                n2.g gVar3 = (n2.g) this.b;
                w5 w5Var = (w5) this.c;
                int i9 = gVar3.a;
                boolean z10 = i9 == 0;
                AndroidUtilities.runOnUIThread(new u5(w5Var, z10, z10 ? null : BillingController.getResponseCodeString(i9), 1));
                break;
            case 3:
                n2.g gVar4 = (n2.g) this.b;
                y0 y0Var = (y0) this.c;
                int i10 = gVar4.a;
                boolean z11 = i10 == 0;
                AndroidUtilities.runOnUIThread(new u5(y0Var, z11, z11 ? null : BillingController.getResponseCodeString(i10), 2));
                break;
            case 4:
                g6.Z((ya) this.b, (xf.s0) this.c, (Integer) obj);
                break;
            default:
                b5 b5Var = (b5) this.b;
                w4 w4Var = (w4) this.c;
                c5[] c5VarArr = w4Var.i;
                y4 y4Var = w4Var.j;
                if (!b5Var.A) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            b5Var.a(w4.a((TLRPC.Chat) y4Var.c, (TLRPC.ChatFull) obj, c5VarArr));
                            break;
                        }
                    } else {
                        b5Var.a(w4.c((TLRPC.User) y4Var.c, (TLRPC.UserFull) obj, c5VarArr));
                        break;
                    }
                }
                break;
        }
    }
}
