package hb;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
