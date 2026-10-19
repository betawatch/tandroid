package hb;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
