package gb;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
