// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
