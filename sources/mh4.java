// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mh4 extends qie {
    public final /* synthetic */ rh4 a;

    public mh4(rh4 rh4Var) {
        this.a = rh4Var;
    }

    @Override // qie
    public final boolean b(int i, int i2) {
        rh4 rh4Var = this.a;
        ph4 ph4Var = (ph4) rh4Var.g3.get(i);
        ph4 ph4Var2 = (ph4) rh4Var.f3.get(i2);
        if (!ph4Var.b(ph4Var2)) {
            return false;
        }
        byte b = ph4Var.d;
        if (b != 4) {
            return b == 6 ? ph4Var.c.equals(ph4Var2.c) : b == 7;
        }
        TLObject tLObject = ph4Var.f;
        if (tLObject instanceof TLRPC.User) {
            TLObject tLObject2 = ph4Var2.f;
            if (tLObject2 instanceof TLRPC.User) {
                return ((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id;
            }
        }
        if (!(tLObject instanceof TLRPC.Chat)) {
            return false;
        }
        TLObject tLObject3 = ph4Var2.f;
        return (tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id;
    }

    @Override // qie
    public final int c() {
        return this.a.f3.size();
    }

    @Override // qie
    public final int d() {
        return this.a.g3.size();
    }
}
