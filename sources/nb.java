// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nb implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bc b;

    public /* synthetic */ nb(bc bcVar, byte b) {
        this.a = b;
        this.b = bcVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        bc bcVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new pf2(bcVar, (TLRPC.UserFull) obj, (byte) 22));
                break;
            case 1:
                bcVar.b0.commission_permille = ((Integer) obj).intValue();
                bcVar.L0();
                break;
            default:
                bcVar.b0.duration_months = ((Integer) bcVar.d0.get(((Integer) obj).intValue())).intValue();
                bcVar.L0();
                break;
        }
    }
}
