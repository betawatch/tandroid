package ge;

import ee.t;
import java.util.concurrent.Executor;
import zd.u0;
import zd.x;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
