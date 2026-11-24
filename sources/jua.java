// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jua implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jva b;

    public /* synthetic */ jua(jva jvaVar, byte b) {
        this.a = b;
        this.b = jvaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        jva jvaVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new nua(jvaVar, tLObject, (byte) 0));
                break;
            case 1:
                gm.c3(new nua(jvaVar, tLObject, (byte) 1));
                break;
            case 2:
                gm.c3(new nua(jvaVar, tLObject, (byte) 2));
                break;
            case 3:
                gm.c3(new nua(jvaVar, tLObject, (byte) 3));
                break;
            default:
                gm.c3(new nua(jvaVar, tLObject, (byte) 4));
                break;
        }
    }
}
