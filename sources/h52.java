// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class h52 implements gk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n52 b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ h52(n52 n52Var, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, byte b) {
        this.a = b;
        this.b = n52Var;
        this.c = tL_messageMediaVenue;
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        n52 n52Var = this.b;
        switch (b) {
            case 0:
                n52Var.o0.b(this.c, n52Var.p0, z, i, 0L);
                n52Var.b.a(true);
                break;
            default:
                n52Var.o0.b(this.c, n52Var.p0, z, i, 0L);
                n52Var.b.a(true);
                break;
        }
    }
}
