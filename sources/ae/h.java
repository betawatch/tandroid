package ae;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import td.x0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
