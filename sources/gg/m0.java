package gg;

import kh.h5;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b5;
import org.telegram.ui.d5;
import org.telegram.ui.g5;
import ph.c5;
import ph.h9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                p2.h hVar = (p2.h) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                if (hVar.a == 0) {
                    AndroidUtilities.runOnUIThread(new n0(1, callback));
                    break;
                }
                break;
            case 1:
                p2.h hVar2 = (p2.h) this.b;
                t0 t0Var = (t0) this.c;
                if (hVar2.a == 0) {
                    AndroidUtilities.runOnUIThread(new e3.h(t0Var, 12));
                    break;
                }
                break;
            case 2:
                p2.h hVar3 = (p2.h) this.b;
                h5 h5Var = (h5) this.c;
                int i10 = hVar3.a;
                boolean z4 = i10 == 0;
                AndroidUtilities.runOnUIThread(new r5(h5Var, z4, z4 ? null : BillingController.getResponseCodeString(i10), 1));
                break;
            case 3:
                p2.h hVar4 = (p2.h) this.b;
                dh.v vVar = (dh.v) this.c;
                int i11 = hVar4.a;
                boolean z10 = i11 == 0;
                AndroidUtilities.runOnUIThread(new r5(vVar, z10, z10 ? null : BillingController.getResponseCodeString(i11), 2));
                break;
            case 4:
                g5 g5Var = (g5) this.b;
                b5 b5Var = (b5) this.c;
                org.telegram.ui.h5[] h5VarArr = b5Var.i;
                d5 d5Var = b5Var.j;
                if (!g5Var.B) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            g5Var.a(b5.a((TLRPC.Chat) d5Var.c, (TLRPC.ChatFull) obj, h5VarArr));
                            break;
                        }
                    } else {
                        g5Var.a(b5.c((TLRPC.User) d5Var.c, (TLRPC.UserFull) obj, h5VarArr));
                        break;
                    }
                }
                break;
            default:
                c5.Z((h9) this.b, (cg.f1) this.c, (Integer) obj);
                break;
        }
    }
}
