package ge;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import zd.x0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class h extends x0 {
    public c c;

    @Override // zd.a0
    public final void c(id.h hVar, Runnable runnable) {
        c cVar = this.c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.n;
        cVar.b(runnable, k.g);
    }
}
