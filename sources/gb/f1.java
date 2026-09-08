package gb;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class f1 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
