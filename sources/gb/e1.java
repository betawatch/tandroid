package gb;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public class e1 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e7) {
            throw new db.j(e7);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
