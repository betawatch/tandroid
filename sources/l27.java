// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class l27 extends k27 {
    public final /* synthetic */ byte u3;
    public final /* synthetic */ o27 v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l27(o27 o27Var, int i, TLRPC.TL_message tL_message, int i2) {
        super(i, tL_message, true, false);
        this.v3 = o27Var;
        this.u3 = i2;
    }

    @Override // k27
    public final boolean m5() {
        if (this.v3.k) {
            return false;
        }
        return super.m5();
    }

    @Override // k27
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.u3 == 2) {
            this.v3.b(this);
        }
    }
}
