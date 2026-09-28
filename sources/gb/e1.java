package gb;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public class e1 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e) {
            throw new db.j(e);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
