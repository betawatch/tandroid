package ie;

import be.a0;
import be.y0;
import ge.v;
import i2.o1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
            throw new IllegalArgumentException(o1.k(j10, "Expected positive parallelism level, but got ").toString());
        }
        if (j10 < k.d) {
            if (j10 < 1) {
                throw new IllegalArgumentException(o1.k(j10, "Expected positive parallelism level, but got ").toString());
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
