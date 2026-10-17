package ac;

import ai.c1;
import android.content.Context;
import x7.ha;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class e extends c1 {
    public final rb.g b;

    public e(rb.g gVar) {
        super(6);
        this.b = gVar;
    }

    @Override // ai.c1
    public final Object Q0(Object obj) {
        zb.a aVar = (zb.a) obj;
        Context b10 = this.b.b();
        k6.e.b.getClass();
        return new f(aVar, k6.e.a(b10) >= 204700000 ? new a(b10, aVar) : new c(b10, aVar), ha.b());
    }
}
