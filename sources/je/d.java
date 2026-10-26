package je;

import ce.a0;
import ce.y0;
import he.w;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d extends y0 implements Executor {
    public static final d c = new d();
    public static final a0 d;

    static {
        a0 a0Var = l.c;
        int i10 = w.a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j10 = he.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 < 1) {
            throw new IllegalArgumentException(ic.a.i(j10, "Expected positive parallelism level, but got ").toString());
        }
        if (j10 < k.d) {
            if (j10 < 1) {
                throw new IllegalArgumentException(ic.a.i(j10, "Expected positive parallelism level, but got ").toString());
            }
            a0Var = new he.i(a0Var, j10);
        }
        d = a0Var;
    }

    @Override // ce.a0
    public final void c(ld.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(ld.i.a, runnable);
    }

    @Override // ce.a0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
