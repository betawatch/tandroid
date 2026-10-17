package hb;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public class f1 extends eb.u {
    @Override // eb.u
    public final Object read(mb.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
