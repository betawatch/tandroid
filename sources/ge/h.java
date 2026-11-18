package ge;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import zd.u0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
