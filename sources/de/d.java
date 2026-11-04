package de;

import be.u;
import java.util.concurrent.Executor;
import wd.u0;
import wd.x;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends u0 implements Executor {
    public static final d c = new d();
    public static final x d;

    static {
        l lVar = l.c;
        int i3 = u.a;
        if (64 >= i3) {
            i3 = 64;
        }
        d = lVar.f(be.a.j(i3, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // wd.x
    public final void c(fd.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(fd.i.a, runnable);
    }

    @Override // wd.x
    public final String toString() {
        return "Dispatchers.IO";
    }
}
