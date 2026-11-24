// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o17 extends yp {
    public final /* synthetic */ u17 c;

    public o17(u17 u17Var) {
        this.c = u17Var;
    }

    @Override // yp
    public final int i(int i) {
        u17 u17Var = this.c;
        k17 k17Var = u17Var.f;
        if (i == 0) {
            return 100;
        }
        int i2 = i - 1;
        Object J = k17Var.J(i2);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (k17Var.I() != null || k17Var.V != null) {
            i = i2;
        }
        n17 n17Var = u17Var.d;
        n17Var.z1();
        return n17Var.R.get(i);
    }
}
