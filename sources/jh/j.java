package jh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.v5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j extends ih.f {
    public final TLRPC.Document b;
    public final Object c;

    public j(Object obj, TLRPC.Document document) {
        this.b = document;
        this.c = obj;
        jj.H2(document);
        ImageReceiver imageReceiver = this.a;
        boolean z10 = jj.u4(document) || jj.N4(document);
        jj.K2(document, true);
        imageReceiver.p0(ic.b(document), "38_38", v5.f(document, t6.Zc, 1.0f, null), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override // ih.f
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i10, i11);
        imageReceiver.h(canvas, null);
    }
}
