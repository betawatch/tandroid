// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class g7a implements RequestDelegate {
    public final /* synthetic */ String a;
    public final /* synthetic */ i7a b;

    public g7a(i7a i7aVar, String str) {
        this.b = i7aVar;
        this.a = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new dn9(this, this.a, (byte) 25));
    }
}
