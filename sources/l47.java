// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class l47 extends k47 {
    public final /* synthetic */ byte u3;
    public final /* synthetic */ o47 v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l47(o47 o47Var, int i, TLRPC.TL_message tL_message, int i2) {
        super(i, tL_message, true, false);
        this.v3 = o47Var;
        this.u3 = i2;
    }

    @Override // k47
    public final boolean m5() {
        if (this.v3.k) {
            return false;
        }
        return super.m5();
    }

    @Override // k47
    public final void n0(TLRPC.User user) {
        super.n0(user);
        if (this.u3 == 2) {
            this.v3.b(this);
        }
    }
}
