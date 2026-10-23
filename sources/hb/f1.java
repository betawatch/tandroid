package hb;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public class f1 extends eb.u {
    @Override // eb.u
    public final Object read(mb.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
