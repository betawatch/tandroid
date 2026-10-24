package ie;

import be.y0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class h extends y0 {
    public c c;

    @Override // be.a0
    public final void c(kd.h hVar, Runnable runnable) {
        c cVar = this.c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.n;
        cVar.b(runnable, k.g);
    }
}
