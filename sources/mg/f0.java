package mg;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q70;
import org.telegram.ui.a5;
import org.telegram.ui.b5;
import org.telegram.ui.v4;
import org.telegram.ui.x4;
import org.telegram.ui.zj0;
import vh.b4;
import vh.s7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                c5.g gVar = (c5.g) this.b;
                r20 r20Var = (r20) this.c;
                if (gVar.a == 0) {
                    org.telegram.messenger.i0.g3(new g0(r20Var, 1));
                    break;
                }
                break;
            case 1:
                c5.g gVar2 = (c5.g) this.b;
                o0 o0Var = (o0) this.c;
                if (gVar2.a == 0) {
                    org.telegram.messenger.i0.g3(new lg.s(o0Var, 8));
                    break;
                }
                break;
            case 2:
                a5 a5Var = (a5) this.b;
                v4 v4Var = (v4) this.c;
                b5[] b5VarArr = v4Var.i;
                x4 x4Var = v4Var.j;
                if (!a5Var.E) {
                    if (!(obj instanceof TLRPC.UserFull)) {
                        if (obj instanceof TLRPC.ChatFull) {
                            a5Var.a(v4.a((TLRPC.Chat) x4Var.c, (TLRPC.ChatFull) obj, b5VarArr));
                            break;
                        }
                    } else {
                        a5Var.a(v4.c((TLRPC.User) x4Var.c, (TLRPC.UserFull) obj, b5VarArr));
                        break;
                    }
                }
                break;
            case 3:
                c5.g gVar3 = (c5.g) this.b;
                q70 q70Var = (q70) this.c;
                int i10 = gVar3.a;
                boolean z10 = i10 == 0;
                org.telegram.messenger.i0.g3(new zj0(q70Var, z10, z10 ? null : org.telegram.messenger.u1.j(i10), 16));
                break;
            case 4:
                c5.g gVar4 = (c5.g) this.b;
                ih.s sVar = (ih.s) this.c;
                int i11 = gVar4.a;
                boolean z11 = i11 == 0;
                org.telegram.messenger.i0.g3(new zj0(sVar, z11, z11 ? null : org.telegram.messenger.u1.j(i11), 15));
                break;
            default:
                b4.X((s7) this.b, (ig.s0) this.c, (Integer) obj);
                break;
        }
    }
}
