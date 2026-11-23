package ge;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import zd.u0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
