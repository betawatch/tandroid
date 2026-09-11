package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d80;
import org.telegram.ui.dm0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class l5 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                q6.Z((rb) this.b, (qg.s0) this.c, (Integer) obj);
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
                    AndroidUtilities.runOnUIThread(new ab(2, callback));
                    break;
                }
                break;
            case 3:
                c5.h hVar2 = (c5.h) this.b;
                ug.w wVar = (ug.w) this.c;
                if (hVar2.a == 0) {
                    AndroidUtilities.runOnUIThread(new sg.p0(wVar, 9));
                    break;
                }
                break;
            case 4:
                c5.h hVar3 = (c5.h) this.b;
                d80 d80Var = (d80) this.c;
                int i10 = hVar3.a;
                boolean z10 = i10 == 0;
                AndroidUtilities.runOnUIThread(new dm0(d80Var, z10, z10 ? null : BillingController.getResponseCodeString(i10), 13));
                break;
            default:
                c5.h hVar4 = (c5.h) this.b;
                bi.f0 f0Var = (bi.f0) this.c;
                int i11 = hVar4.a;
                boolean z11 = i11 == 0;
                AndroidUtilities.runOnUIThread(new dm0(f0Var, z11, z11 ? null : BillingController.getResponseCodeString(i11), 14));
                break;
        }
    }
}
