package ge;

import ee.t;
import java.util.concurrent.Executor;
import zd.u0;
import zd.x;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d extends u0 implements Executor {
    public static final d c = new d();
    public static final x d;

    static {
        l lVar = l.c;
        int i7 = t.a;
        if (64 >= i7) {
            i7 = 64;
        }
        d = lVar.f(ee.a.j(i7, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // zd.x
    public final void c(id.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(id.i.a, runnable);
    }

    @Override // zd.x
    public final String toString() {
        return "Dispatchers.IO";
    }
}
