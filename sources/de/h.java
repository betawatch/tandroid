package de;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import wd.u0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class h extends u0 {
    public c c;

    @Override // wd.x
    public final void c(fd.h hVar, Runnable runnable) {
        c cVar = this.c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.n;
        cVar.b(runnable, false);
    }
}
