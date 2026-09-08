package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class m0 extends s4.o {
    public final /* synthetic */ s0 b;

    public m0(s0 s0Var) {
        this.b = s0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        s0 s0Var = this.b;
        q0 q0Var = (q0) s0Var.Y2.get(i10);
        q0 q0Var2 = (q0) s0Var.X2.get(i11);
        if (!q0Var.b(q0Var2)) {
            return false;
        }
        int i12 = q0Var.d;
        if (i12 != 4) {
            return i12 == 6 ? q0Var.c.equals(q0Var2.c) : i12 == 7;
        }
        TLObject tLObject = q0Var.f;
        if (tLObject instanceof TLRPC.User) {
            TLObject tLObject2 = q0Var2.f;
            if (tLObject2 instanceof TLRPC.User) {
                return ((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id;
            }
        }
        if (!(tLObject instanceof TLRPC.Chat)) {
            return false;
        }
        TLObject tLObject3 = q0Var2.f;
        return (tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id;
    }

    @Override // s4.o
    public final int d() {
        return this.b.X2.size();
    }

    @Override // s4.o
    public final int e() {
        return this.b.Y2.size();
    }
}
