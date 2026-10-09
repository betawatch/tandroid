package he;

import ae.b0;
import ae.z0;
import fe.v;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d extends z0 implements Executor {
    public static final d c = new d();
    public static final b0 d;

    static {
        b0 b0Var = l.c;
        int i10 = v.a;
        if (64 >= i10) {
            i10 = 64;
        }
        int j3 = fe.a.j(i10, 12, "kotlinx.coroutines.io.parallelism");
        b0Var.getClass();
        if (j3 < 1) {
            throw new IllegalArgumentException(hg.c.h(j3, "Expected positive parallelism level, but got ").toString());
        }
        if (j3 < k.d) {
            if (j3 < 1) {
                throw new IllegalArgumentException(hg.c.h(j3, "Expected positive parallelism level, but got ").toString());
            }
            b0Var = new fe.i(b0Var, j3);
        }
        d = b0Var;
    }

    @Override // ae.b0
    public final void c(jd.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(jd.i.a, runnable);
    }

    @Override // ae.b0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
