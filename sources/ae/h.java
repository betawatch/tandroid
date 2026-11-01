package ae;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import td.x0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class h extends x0 {
    public c c;

    @Override // td.a0
    public final void c(cd.h hVar, Runnable runnable) {
        c cVar = this.c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.n;
        cVar.b(runnable, l.g);
    }
}
