package bi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h8 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h8(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                f5.f fVar = (f5.f) this.b;
                mc mcVar = (mc) this.c;
                int i7 = fVar.a;
                boolean z9 = i7 == 0;
                org.telegram.messenger.g0.h3(new u7(mcVar, z9, z9 ? null : org.telegram.messenger.r1.j(i7), 2));
                break;
            case 1:
                f5.f fVar2 = (f5.f) this.b;
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.c;
                int i10 = fVar2.a;
                boolean z10 = i10 == 0;
                org.telegram.messenger.g0.h3(new u7(t1Var, z10, z10 ? null : org.telegram.messenger.r1.j(i10), 1));
                break;
            case 2:
                fi.o5.X((fi.x9) this.b, (sg.l0) this.c, (Integer) obj);
                break;
            case 3:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.b;
                org.telegram.ui.w4 w4Var = (org.telegram.ui.w4) this.c;
                org.telegram.ui.c5[] c5VarArr = w4Var.i;
                org.telegram.ui.y4 y4Var = w4Var.j;
                if (!b5Var.E) {
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
                c20 c20Var = (c20) this.c;
                if (fVar3.a == 0) {
                    org.telegram.messenger.g0.h3(new fi.j9(c20Var, 2));
                    break;
                }
                break;
            default:
                f5.f fVar4 = (f5.f) this.b;
                wg.u uVar = (wg.u) this.c;
                if (fVar4.a == 0) {
                    org.telegram.messenger.g0.h3(new sh.b(uVar, 29));
                    break;
                }
                break;
        }
    }
}
