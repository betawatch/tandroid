package ci;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i7 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i7(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                e5.f fVar = (e5.f) this.b;
                ai.d6 d6Var = (ai.d6) this.c;
                int i3 = fVar.a;
                boolean z10 = i3 == 0;
                org.telegram.messenger.g0.h3(new v6(d6Var, z10, z10 ? null : org.telegram.messenger.r1.j(i3), 2));
                break;
            case 1:
                e5.f fVar2 = (e5.f) this.b;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.c;
                int i10 = fVar2.a;
                boolean z11 = i10 == 0;
                org.telegram.messenger.g0.h3(new v6(s1Var, z11, z11 ? null : org.telegram.messenger.r1.j(i10), 1));
                break;
            case 2:
                gi.m5.X((gi.x9) this.b, (tg.k0) this.c, (Integer) obj);
                break;
            case 3:
                org.telegram.ui.d5 d5Var = (org.telegram.ui.d5) this.b;
                org.telegram.ui.y4 y4Var = (org.telegram.ui.y4) this.c;
                org.telegram.ui.e5[] e5VarArr = y4Var.i;
                org.telegram.ui.a5 a5Var = y4Var.j;
                if (!d5Var.F) {
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
            case 4:
                e5.f fVar3 = (e5.f) this.b;
                u10 u10Var = (u10) this.c;
                if (fVar3.a == 0) {
                    org.telegram.messenger.g0.h3(new gi.k9(u10Var, 2));
                    break;
                }
                break;
            default:
                e5.f fVar4 = (e5.f) this.b;
                xg.v vVar = (xg.v) this.c;
                if (fVar4.a == 0) {
                    org.telegram.messenger.g0.h3(new xf.c(vVar, 4));
                    break;
                }
                break;
        }
    }
}
