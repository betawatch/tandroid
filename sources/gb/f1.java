package gb;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
