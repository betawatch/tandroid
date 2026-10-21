package ie;

import be.a0;
import be.y0;
import ge.v;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class d extends y0 implements Executor {
    public static final d c = new d();
    public static final a0 d;

    static {
        a0 a0Var = l.c;
        int i10 = v.a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j10 = ge.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 < 1) {
            throw new IllegalArgumentException(i2.e.j(j10, "Expected positive parallelism level, but got ").toString());
        }
        if (j10 < k.d) {
            if (j10 < 1) {
                throw new IllegalArgumentException(i2.e.j(j10, "Expected positive parallelism level, but got ").toString());
            }
            a0Var = new ge.i(a0Var, j10);
        }
        d = a0Var;
    }

    @Override // be.a0
    public final void c(kd.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(kd.i.a, runnable);
    }

    @Override // be.a0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
