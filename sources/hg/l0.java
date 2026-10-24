package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class l0 extends s4.o {
    public final /* synthetic */ q0 b;

    public l0(q0 q0Var) {
        this.b = q0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        q0 q0Var = this.b;
        o0 o0Var = (o0) q0Var.Z2.get(i10);
        o0 o0Var2 = (o0) q0Var.Y2.get(i11);
        if (!o0Var.b(o0Var2)) {
            return false;
        }
        int i12 = o0Var.d;
        if (i12 != 4) {
            return i12 == 6 ? o0Var.c.equals(o0Var2.c) : i12 == 7;
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

    @Override // s4.o
    public final int d() {
        return this.b.Y2.size();
    }

    @Override // s4.o
    public final int e() {
        return this.b.Z2.size();
    }
}
