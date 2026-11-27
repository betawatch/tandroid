// default package

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class h6c extends AtomicReference implements Runnable {
    public static final tv d;
    public static final tv e;
    public static final tv f;
    public static final tv h;
    public final /* synthetic */ byte a = 0;
    public final Callable b;
    public final /* synthetic */ Object c;

    static {
        byte b = 8;
        d = new tv(b);
        e = new tv(b);
        byte b2 = 16;
        f = new tv(b2);
        h = new tv(b2);
    }

    public h6c(uhf uhfVar, Callable callable) {
        this.c = uhfVar;
        callable.getClass();
        this.b = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        tr5 tr5Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof tr5;
            tv tvVar = e;
            if (!z2) {
                if (runnable != tvVar) {
                    break;
                }
            } else {
                tr5Var = (tr5) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == tvVar || compareAndSet(runnable, tvVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(tr5Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        zgf zgfVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof zgf;
            tv tvVar = h;
            if (!z2) {
                if (runnable != tvVar) {
                    break;
                }
            } else {
                zgfVar = (zgf) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == tvVar || compareAndSet(runnable, tvVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(zgfVar);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        byte b = this.a;
        Callable callable = this.b;
        Object obj = null;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                i6c i6cVar = (i6c) obj2;
                Thread currentThread = Thread.currentThread();
                if (compareAndSet(null, currentThread)) {
                    boolean isDone = i6cVar.isDone();
                    tv tvVar = d;
                    if (!isDone) {
                        try {
                            obj = callable.call();
                        } catch (Throwable th) {
                            try {
                                if (th instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                if (!compareAndSet(currentThread, tvVar)) {
                                    a(currentThread);
                                }
                                if (isDone) {
                                    return;
                                }
                                i6cVar.m(th);
                                return;
                            } finally {
                                if (!compareAndSet(currentThread, tvVar)) {
                                    a(currentThread);
                                }
                                if (!isDone) {
                                    i6cVar.l(null);
                                }
                            }
                        }
                    }
                    if (isDone) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                uhf uhfVar = (uhf) obj2;
                Thread currentThread2 = Thread.currentThread();
                if (compareAndSet(null, currentThread2)) {
                    boolean isDone2 = uhfVar.isDone();
                    tv tvVar2 = f;
                    if (isDone2) {
                        call = null;
                    } else {
                        try {
                            call = callable.call();
                        } catch (Throwable th2) {
                            try {
                                if (th2 instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                if (!compareAndSet(currentThread2, tvVar2)) {
                                    b(currentThread2);
                                }
                                if (lgf.f.f(uhfVar, null, new egf(th2))) {
                                    lgf.g(uhfVar);
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                if (!compareAndSet(currentThread2, tvVar2)) {
                                    b(currentThread2);
                                }
                                if (lgf.f.f(uhfVar, null, lgf.h)) {
                                    lgf.g(uhfVar);
                                }
                                throw th3;
                            }
                        }
                    }
                    if (!compareAndSet(currentThread2, tvVar2)) {
                        b(currentThread2);
                    }
                    if (isDone2) {
                        return;
                    }
                    if (call == null) {
                        call = lgf.h;
                    }
                    if (lgf.f.f(uhfVar, null, call)) {
                        lgf.g(uhfVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        byte b = this.a;
        Callable callable = this.b;
        String str = "running=[NOT STARTED YET]";
        switch (b) {
            case 0:
                Runnable runnable = (Runnable) get();
                if (runnable == d) {
                    str = "running=[DONE]";
                } else if (runnable instanceof tr5) {
                    str = "running=[INTERRUPTED]";
                } else if (runnable instanceof Thread) {
                    str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
                }
                StringBuilder l = c00.l(str, ", ");
                l.append(callable.toString());
                return l.toString();
            default:
                Runnable runnable2 = (Runnable) get();
                if (runnable2 == f) {
                    str = "running=[DONE]";
                } else if (runnable2 instanceof zgf) {
                    str = "running=[INTERRUPTED]";
                } else if (runnable2 instanceof Thread) {
                    str = qd4.y("running=[RUNNING ON ", ((Thread) runnable2).getName(), "]");
                }
                return qd4.y(str, ", ", callable.toString());
        }
    }

    public h6c(i6c i6cVar, Callable callable) {
        this.c = i6cVar;
        callable.getClass();
        this.b = callable;
    }
}
