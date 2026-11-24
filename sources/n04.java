// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n04 extends yp {
    public final /* synthetic */ e34 c;

    public n04(e34 e34Var) {
        this.c = e34Var;
    }

    @Override // yp
    public final int i(int i) {
        e34 e34Var = this.c;
        z24 z24Var = e34Var.A0;
        y59 adapter = e34Var.E0.getAdapter();
        w24 w24Var = e34Var.z0;
        if (adapter != w24Var) {
            if (i == z24Var.y || !(z24Var.r.get(i) == null || (z24Var.r.get(i) instanceof TLRPC.Document))) {
                return w24Var.d;
            }
            return 1;
        }
        if (i == 0) {
            return w24Var.d;
        }
        if (i == w24Var.s || !(w24Var.h.get(i) == null || (w24Var.h.get(i) instanceof TLRPC.Document))) {
            return w24Var.d;
        }
        return 1;
    }
}
