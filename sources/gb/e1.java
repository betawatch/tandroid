package gb;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
