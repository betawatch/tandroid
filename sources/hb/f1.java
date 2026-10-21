package hb;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
