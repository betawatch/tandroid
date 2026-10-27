package ig;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m0 extends s4.p {
    public final /* synthetic */ r0 b;

    public m0(r0 r0Var) {
        this.b = r0Var;
    }

    @Override // s4.p
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.p
    public final boolean b(int i10, int i11) {
        r0 r0Var = this.b;
        p0 p0Var = (p0) r0Var.g3.get(i10);
        p0 p0Var2 = (p0) r0Var.f3.get(i11);
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

    @Override // s4.p
    public final int d() {
        return this.b.f3.size();
    }

    @Override // s4.p
    public final int e() {
        return this.b.g3.size();
    }
}
