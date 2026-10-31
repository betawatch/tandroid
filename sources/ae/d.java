package ae;

import java.util.concurrent.Executor;
import td.a0;
import td.x0;
import yd.v;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends x0 implements Executor {
    public static final d c = new d();
    public static final a0 d;

    static {
        a0 a0Var = m.c;
        int i10 = v.a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j10 = yd.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 < 1) {
            throw new IllegalArgumentException(i0.a.i(j10, "Expected positive parallelism level, but got ").toString());
        }
        if (j10 < l.d) {
            if (j10 < 1) {
                throw new IllegalArgumentException(i0.a.i(j10, "Expected positive parallelism level, but got ").toString());
            }
            a0Var = new yd.i(a0Var, j10);
        }
        d = a0Var;
    }

    @Override // td.a0
    public final void c(cd.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(cd.i.a, runnable);
    }

    @Override // td.a0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
