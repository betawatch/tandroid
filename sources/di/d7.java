package di;

import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                bi.h8 h8Var = (bi.h8) this.c;
                int i7 = fVar.a;
                boolean z10 = i7 == 0;
                org.telegram.messenger.g0.g3(new p6(h8Var, z10, z10 ? null : org.telegram.messenger.r1.j(i7), 2));
                break;
            case 1:
                f5.f fVar2 = (f5.f) this.b;
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.c;
                int i10 = fVar2.a;
                boolean z11 = i10 == 0;
                org.telegram.messenger.g0.g3(new p6(f0Var, z11, z11 ? null : org.telegram.messenger.r1.j(i10), 1));
                break;
            case 2:
                hi.v5.Y((hi.pa) this.b, (sg.j0) this.c, (Integer) obj);
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
                w10 w10Var = (w10) this.c;
                if (fVar3.a == 0) {
                    org.telegram.messenger.g0.g3(new hi.ca(w10Var, 2));
                    break;
                }
                break;
            default:
                f5.f fVar4 = (f5.f) this.b;
                wg.u uVar = (wg.u) this.c;
                if (fVar4.a == 0) {
                    org.telegram.messenger.g0.g3(new ug.u1(uVar, 8));
                    break;
                }
                break;
        }
    }
}
