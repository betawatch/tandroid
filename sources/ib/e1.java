package ib;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class e1 extends fb.u {
    @Override // fb.u
    public final Object read(nb.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e) {
            throw new fb.j(e);
        }
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
