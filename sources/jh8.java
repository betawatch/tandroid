// default package

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jh8 extends zg8 {
    public final TLRPC.Document b;
    public final Object c;

    public jh8(Object obj, TLRPC.Document document) {
        this.b = document;
        this.c = obj;
        r47.H2(document);
        ImageReceiver imageReceiver = this.a;
        boolean z = r47.t4(document) || r47.M4(document);
        r47.K2(document, true);
        imageReceiver.c0(jn5.b(document), "38_38", lp3.f(document, aob.cd, 1.0f, null), document.size, z ? "webp" : null, obj, 0);
    }

    @Override // zg8
    public final void c(Canvas canvas, int i, int i2) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(0.0f, 0.0f, i, i2);
        imageReceiver.h(canvas, null);
    }
}
