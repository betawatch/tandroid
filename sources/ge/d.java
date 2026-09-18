package ge;

import ee.w;
import hg.k0;
import java.util.concurrent.Executor;
import zd.a0;
import zd.x0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class d extends x0 implements Executor {
    public static final d c = new d();
    public static final a0 d;

    static {
        a0 a0Var = l.c;
        int i10 = w.a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j3 = ee.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j3 < 1) {
            throw new IllegalArgumentException(k0.h(j3, "Expected positive parallelism level, but got ").toString());
        }
        if (j3 < k.d) {
            if (j3 < 1) {
                throw new IllegalArgumentException(k0.h(j3, "Expected positive parallelism level, but got ").toString());
            }
            a0Var = new ee.i(a0Var, j3);
        }
        d = a0Var;
    }

    @Override // zd.a0
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

    @Override // zd.a0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
