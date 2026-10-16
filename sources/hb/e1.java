package hb;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
