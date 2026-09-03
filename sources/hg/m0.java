package hg;

import lh.i5;
import mh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b5;
import org.telegram.ui.e5;
import org.telegram.ui.f5;
import org.telegram.ui.z4;
import qh.a5;
import qh.e9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                    AndroidUtilities.runOnUIThread(new eh.m(t0Var, 14));
                    break;
                }
                break;
            case 2:
                p2.h hVar3 = (p2.h) this.b;
                i5 i5Var = (i5) this.c;
                int i10 = hVar3.a;
                boolean z4 = i10 == 0;
                AndroidUtilities.runOnUIThread(new r5(i5Var, z4, z4 ? null : BillingController.getResponseCodeString(i10), 1));
                break;
            case 3:
                p2.h hVar4 = (p2.h) this.b;
                eh.w wVar = (eh.w) this.c;
                int i11 = hVar4.a;
                boolean z10 = i11 == 0;
                AndroidUtilities.runOnUIThread(new r5(wVar, z10, z10 ? null : BillingController.getResponseCodeString(i11), 2));
                break;
            case 4:
                e5 e5Var = (e5) this.b;
                z4 z4Var = (z4) this.c;
                f5[] f5VarArr = z4Var.i;
                b5 b5Var = z4Var.j;
                if (!e5Var.B) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            e5Var.a(z4.a((TLRPC.Chat) b5Var.c, (TLRPC.ChatFull) obj, f5VarArr));
                            break;
                        }
                    } else {
                        e5Var.a(z4.c((TLRPC.User) b5Var.c, (TLRPC.UserFull) obj, f5VarArr));
                        break;
                    }
                }
                break;
            default:
                a5.Z((e9) this.b, (dg.e1) this.c, (Integer) obj);
                break;
        }
    }
}
