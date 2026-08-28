package of;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j0 extends f2.s {
    public final /* synthetic */ o0 b;

    public j0(o0 o0Var) {
        this.b = o0Var;
    }

    @Override // f2.s
    public final boolean a(int i9, int i10) {
        return true;
    }

    @Override // f2.s
    public final boolean b(int i9, int i10) {
        o0 o0Var = this.b;
        m0 m0Var = (m0) o0Var.U2.get(i9);
        m0 m0Var2 = (m0) o0Var.T2.get(i10);
        if (!m0Var.b(m0Var2)) {
            return false;
        }
        int i11 = m0Var.d;
        if (i11 != 4) {
            return i11 == 6 ? m0Var.c.equals(m0Var2.c) : i11 == 7;
        }
        TLObject tLObject = m0Var.f;
        if (tLObject instanceof TLRPC.User) {
            TLObject tLObject2 = m0Var2.f;
            if (tLObject2 instanceof TLRPC.User) {
                return ((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id;
            }
        }
        if (!(tLObject instanceof TLRPC.Chat)) {
            return false;
        }
        TLObject tLObject3 = m0Var2.f;
        return (tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id;
    }

    @Override // f2.s
    public final int d() {
        return this.b.T2.size();
    }

    @Override // f2.s
    public final int e() {
        return this.b.U2.size();
    }
}
