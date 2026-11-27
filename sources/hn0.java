// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hn0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pcc b;
    public final /* synthetic */ pcc c;

    public /* synthetic */ hn0(pcc pccVar, pcc pccVar2, byte b) {
        this.a = b;
        this.b = pccVar;
        this.c = pccVar2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hl.c3(new es6(tL_error, this.b, this.c));
                break;
            default:
                hl.c3(new o97(tL_error, this.b, tLObject, this.c, (byte) 9));
                break;
        }
    }
}
