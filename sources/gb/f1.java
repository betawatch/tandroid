package gb;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
