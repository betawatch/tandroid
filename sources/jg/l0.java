package jg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l0 extends v4.o {
    public final /* synthetic */ q0 b;

    public l0(q0 q0Var) {
        this.b = q0Var;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        q0 q0Var = this.b;
        o0 o0Var = (o0) q0Var.f3.get(i7);
        o0 o0Var2 = (o0) q0Var.e3.get(i10);
        if (!o0Var.b(o0Var2)) {
            return false;
        }
        int i11 = o0Var.d;
        if (i11 != 4) {
            return i11 == 6 ? o0Var.c.equals(o0Var2.c) : i11 == 7;
        }
        TLObject tLObject = o0Var.f;
        if (tLObject instanceof TLRPC.User) {
            TLObject tLObject2 = o0Var2.f;
            if (tLObject2 instanceof TLRPC.User) {
                return ((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id;
            }
        }
        if (!(tLObject instanceof TLRPC.Chat)) {
            return false;
        }
        TLObject tLObject3 = o0Var2.f;
        return (tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id;
    }

    @Override // v4.o
    public final int d() {
        return this.b.e3.size();
    }

    @Override // v4.o
    public final int e() {
        return this.b.f3.size();
    }
}
