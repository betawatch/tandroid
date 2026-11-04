package kg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i0 extends u4.o {
    public final /* synthetic */ n0 b;

    public i0(n0 n0Var) {
        this.b = n0Var;
    }

    @Override // u4.o
    public final boolean a(int i3, int i10) {
        return true;
    }

    @Override // u4.o
    public final boolean b(int i3, int i10) {
        n0 n0Var = this.b;
        l0 l0Var = (l0) n0Var.g3.get(i3);
        l0 l0Var2 = (l0) n0Var.f3.get(i10);
        if (!l0Var.b(l0Var2)) {
            return false;
        }
        int i11 = l0Var.d;
        if (i11 != 4) {
            return i11 == 6 ? l0Var.c.equals(l0Var2.c) : i11 == 7;
        }
        TLObject tLObject = l0Var.f;
        if (tLObject instanceof TLRPC.User) {
            TLObject tLObject2 = l0Var2.f;
            if (tLObject2 instanceof TLRPC.User) {
                return ((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id;
            }
        }
        if (!(tLObject instanceof TLRPC.Chat)) {
            return false;
        }
        TLObject tLObject3 = l0Var2.f;
        return (tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id;
    }

    @Override // u4.o
    public final int d() {
        return this.b.f3.size();
    }

    @Override // u4.o
    public final int e() {
        return this.b.g3.size();
    }
}
