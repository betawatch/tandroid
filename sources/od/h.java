package od;

import hd.y0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class h extends y0 {
    public c c;

    @Override // hd.a0
    public final void c(qc.h hVar, Runnable runnable) {
        c cVar = this.c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.n;
        cVar.b(runnable, k.g);
    }
}
