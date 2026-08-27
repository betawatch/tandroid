package a9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q implements Executor {
    public static final Logger f = Logger.getLogger(q.class.getName());
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int c = 1;
    public long d = 0;
    public final o e = new o(this);

    public q(Executor executor) {
        y5.l.h(executor);
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y5.l.h(runnable);
        synchronized (this.b) {
            int i10 = this.c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.d;
                n nVar = new n(0, runnable);
                this.b.add(nVar);
                this.c = 2;
                try {
                    this.a.execute(this.e);
                    if (this.c != 2) {
                        return;
                    }
                    synchronized (this.b) {
                        try {
                            if (this.d == j10 && this.c == 2) {
                                this.c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e9) {
                    synchronized (this.b) {
                        try {
                            int i11 = this.c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.b.removeLastOccurrence(nVar)) {
                                z10 = false;
                            }
                            if (!(e9 instanceof RejectedExecutionException) || z10) {
                                throw e9;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.a + "}";
    }
}
