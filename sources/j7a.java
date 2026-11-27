// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class j7a implements RequestDelegate {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ k7a b;

    public j7a(k7a k7aVar, Runnable runnable) {
        this.b = k7aVar;
        this.a = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new jr9((Object) this, (Object) tLObject, (Object) this.a, (byte) 9));
    }
}
