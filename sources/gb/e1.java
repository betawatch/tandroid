package gb;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
