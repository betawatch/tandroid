// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ho0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qac b;
    public final /* synthetic */ qac c;

    public /* synthetic */ ho0(qac qacVar, qac qacVar2, byte b) {
        this.a = b;
        this.b = qacVar;
        this.c = qacVar2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gm.c3(new op6(tL_error, this.b, this.c));
                break;
            default:
                gm.c3(new l97(tL_error, this.b, tLObject, this.c, (byte) 9));
                break;
        }
    }
}
