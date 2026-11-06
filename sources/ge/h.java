package ge;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import zd.u0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class h extends u0 {
    public c c;

    @Override // zd.x
    public final void c(id.h hVar, Runnable runnable) {
        c cVar = this.c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.n;
        cVar.b(runnable, false);
    }
}
