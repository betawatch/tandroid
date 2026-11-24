// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jj6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ak6 b;

    public /* synthetic */ jj6(ak6 ak6Var, byte b) {
        this.a = b;
        this.b = ak6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        byte b2 = 0;
        ak6 ak6Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new pj6(ak6Var, tL_error, tLObject, b2));
                break;
            default:
                gm.c3(new lj6(ak6Var, tL_error, b2));
                break;
        }
    }
}
