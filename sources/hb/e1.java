package hb;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public class e1 extends eb.u {
    @Override // eb.u
    public final Object read(mb.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e) {
            throw new eb.j(e);
        }
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
