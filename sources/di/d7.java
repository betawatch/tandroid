package di;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d7(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                f5.f fVar = (f5.f) this.b;
                bi.e8 e8Var = (bi.e8) this.c;
                int i7 = fVar.a;
                boolean z10 = i7 == 0;
                org.telegram.messenger.g0.g3(new p6(e8Var, z10, z10 ? null : org.telegram.messenger.r1.j(i7), 2));
                break;
            case 1:
                f5.f fVar2 = (f5.f) this.b;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.c;
                int i10 = fVar2.a;
                boolean z11 = i10 == 0;
                org.telegram.messenger.g0.g3(new p6(e0Var, z11, z11 ? null : org.telegram.messenger.r1.j(i10), 1));
                break;
            case 2:
                hi.k5.X((hi.u9) this.b, (sg.k0) this.c, (Integer) obj);
                break;
            case 3:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.b;
                org.telegram.ui.w4 w4Var = (org.telegram.ui.w4) this.c;
                org.telegram.ui.c5[] c5VarArr = w4Var.i;
                org.telegram.ui.y4 y4Var = w4Var.j;
                if (!b5Var.F) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            b5Var.a(org.telegram.ui.w4.a((TLRPC.Chat) y4Var.c, (TLRPC.ChatFull) obj, c5VarArr));
                            break;
                        }
                    } else {
                        b5Var.a(org.telegram.ui.w4.c((TLRPC.User) y4Var.c, (TLRPC.UserFull) obj, c5VarArr));
                        break;
                    }
                }
                break;
            case 4:
                f5.f fVar3 = (f5.f) this.b;
                y10 y10Var = (y10) this.c;
                if (fVar3.a == 0) {
                    org.telegram.messenger.g0.g3(new hi.h9(y10Var, 2));
                    break;
                }
                break;
            default:
                f5.f fVar4 = (f5.f) this.b;
                wg.v vVar = (wg.v) this.c;
                if (fVar4.a == 0) {
                    org.telegram.messenger.g0.g3(new v4.p(vVar, 7));
                    break;
                }
                break;
        }
    }
}
