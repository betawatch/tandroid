// default package

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hg6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rg6 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ hg6(rg6 rg6Var, Bundle bundle, byte b) {
        this.a = b;
        this.b = rg6Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                rg6 rg6Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        gm.c3(new k16(rg6Var, tL_error, (byte) 23));
                        break;
                    }
                } else {
                    gm.c3(new dt5(rg6Var, this.c, tLObject, (byte) 25));
                    break;
                }
                break;
            default:
                gm.c3(new d65(this.b, tL_error, this.c, tLObject, (byte) 18));
                break;
        }
    }
}
