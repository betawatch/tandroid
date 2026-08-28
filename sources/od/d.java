package od;

import hd.a0;
import hd.y0;
import j3.r0;
import java.util.concurrent.Executor;
import md.v;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends y0 implements Executor {
    public static final d c = new d();
    public static final a0 d;

    static {
        a0 a0Var = l.c;
        int i9 = v.a;
        if (64 >= i9) {
            i9 = 64;
        }
        int j10 = md.a.j(i9, 12, "kotlinx.coroutines.io.parallelism");
        a0Var.getClass();
        if (j10 < 1) {
            throw new IllegalArgumentException(r0.l(j10, "Expected positive parallelism level, but got ").toString());
        }
        if (j10 < k.d) {
            if (j10 < 1) {
                throw new IllegalArgumentException(r0.l(j10, "Expected positive parallelism level, but got ").toString());
            }
            a0Var = new md.i(a0Var, j10);
        }
        d = a0Var;
    }

    @Override // hd.a0
    public final void c(qc.h hVar, Runnable runnable) {
        d.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(qc.i.a, runnable);
    }

    @Override // hd.a0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
