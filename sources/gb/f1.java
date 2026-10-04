package gb;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
