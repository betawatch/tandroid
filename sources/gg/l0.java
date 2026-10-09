package gg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l0 extends s4.o {
    public final /* synthetic */ r0 b;

    public l0(r0 r0Var) {
        this.b = r0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        r0 r0Var = this.b;
        p0 p0Var = (p0) r0Var.W2.get(i10);
        p0 p0Var2 = (p0) r0Var.V2.get(i11);
        if (!p0Var.b(p0Var2)) {
            return false;
        }
        int i12 = p0Var.d;
        if (i12 != 4) {
            return i12 == 6 ? p0Var.c.equals(p0Var2.c) : i12 == 7;
        }
        TLObject tLObject = p0Var.f;
        if (tLObject instanceof TLRPC.User) {
            TLObject tLObject2 = p0Var2.f;
            if (tLObject2 instanceof TLRPC.User) {
                return ((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id;
            }
        }
        if (!(tLObject instanceof TLRPC.Chat)) {
            return false;
        }
        TLObject tLObject3 = p0Var2.f;
        return (tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id;
    }

    @Override // s4.o
    public final int d() {
        return this.b.V2.size();
    }

    @Override // s4.o
    public final int e() {
        return this.b.W2.size();
    }
}
