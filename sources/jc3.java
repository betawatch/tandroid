// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jc3 extends d64 implements Executor {
    public static final jc3 c = new jc3();
    public static final fy2 d;

    static {
        u7c u7cVar = u7c.c;
        int i = ifb.a;
        if (64 >= i) {
            i = 64;
        }
        d = u7cVar.e(bxe.b(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(k34.a, runnable);
    }

    @Override // fy2
    public final String toString() {
        return "Dispatchers.IO";
    }
}
