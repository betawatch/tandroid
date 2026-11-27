// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class n5b implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ pcc b;
    public final /* synthetic */ c6b c;

    public n5b(c6b c6bVar, long j, pcc pccVar) {
        this.c = c6bVar;
        this.a = j;
        this.b = pccVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new z09((Object) this, (Object) tLObject, this.a, (Object) this.b, (byte) 12));
    }
}
