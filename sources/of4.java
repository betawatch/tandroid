// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class of4 extends zde {
    public final /* synthetic */ tf4 a;

    public of4(tf4 tf4Var) {
        this.a = tf4Var;
    }

    @Override // zde
    public final boolean b(int i, int i2) {
        tf4 tf4Var = this.a;
        rf4 rf4Var = (rf4) tf4Var.g3.get(i);
        rf4 rf4Var2 = (rf4) tf4Var.f3.get(i2);
        if (!rf4Var.b(rf4Var2)) {
            return false;
        }
        byte b = rf4Var.d;
        if (b != 4) {
            return b == 6 ? rf4Var.c.equals(rf4Var2.c) : b == 7;
        }
        TLObject tLObject = rf4Var.f;
        if (tLObject instanceof TLRPC.User) {
            TLObject tLObject2 = rf4Var2.f;
            if (tLObject2 instanceof TLRPC.User) {
                return ((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id;
            }
        }
        if (!(tLObject instanceof TLRPC.Chat)) {
            return false;
        }
        TLObject tLObject3 = rf4Var2.f;
        return (tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id;
    }

    @Override // zde
    public final int c() {
        return this.a.f3.size();
    }

    @Override // zde
    public final int d() {
        return this.a.g3.size();
    }
}
