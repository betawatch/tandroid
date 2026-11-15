package ge;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import zd.u0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
