package ac;

import android.content.Context;
import b2.h;
import x7.ha;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class e extends h {
    public final rb.g b;

    public e(rb.g gVar) {
        super(5);
        this.b = gVar;
    }

    @Override // b2.h
    public final Object Q0(Object obj) {
        zb.a aVar = (zb.a) obj;
        Context b10 = this.b.b();
        k6.e.b.getClass();
        return new f(aVar, k6.e.a(b10) >= 204700000 ? new a(b10, aVar) : new c(b10, aVar), ha.b());
    }
}
