// default package

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h4c extends AtomicReference implements Runnable {
    public static final sw d;
    public static final sw e;
    public static final sw f;
    public static final sw h;
    public final /* synthetic */ byte a = 1;
    public final Callable b;
    public final /* synthetic */ Object c;

    static {
        byte b = 8;
        d = new sw(b);
        e = new sw(b);
        byte b2 = 16;
        f = new sw(b2);
        h = new sw(b2);
    }

    public h4c(fff fffVar, Callable callable) {
        this.c = fffVar;
        callable.getClass();
        this.b = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        qr5 qr5Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof qr5;
            sw swVar = e;
            if (!z2) {
                if (runnable != swVar) {
                    break;
                }
            } else {
                qr5Var = (qr5) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == swVar || compareAndSet(runnable, swVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(qr5Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        kef kefVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof kef;
            sw swVar = h;
            if (!z2) {
                if (runnable != swVar) {
                    break;
                }
            } else {
                kefVar = (kef) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == swVar || compareAndSet(runnable, swVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(kefVar);
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
                i4c i4cVar = (i4c) obj2;
                Thread currentThread = Thread.currentThread();
                if (compareAndSet(null, currentThread)) {
                    boolean isDone = i4cVar.isDone();
                    sw swVar = d;
                    if (!isDone) {
                        try {
                            obj = callable.call();
                        } catch (Throwable th) {
                            try {
                                if (th instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                }
                                if (!compareAndSet(currentThread, swVar)) {
                                    a(currentThread);
                                }
                                if (isDone) {
                                    return;
                                }
                                i4cVar.m(th);
                                return;
                            } finally {
                                if (!compareAndSet(currentThread, swVar)) {
                                    a(currentThread);
                                }
                                if (!isDone) {
                                    i4cVar.l(null);
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
                fff fffVar = (fff) obj2;
                Thread currentThread2 = Thread.currentThread();
                if (compareAndSet(null, currentThread2)) {
                    boolean isDone2 = fffVar.isDone();
                    sw swVar2 = f;
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
                                if (!compareAndSet(currentThread2, swVar2)) {
                                    b(currentThread2);
                                }
                                if (wdf.f.f(fffVar, null, new pdf(th2))) {
                                    wdf.g(fffVar);
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                if (!compareAndSet(currentThread2, swVar2)) {
                                    b(currentThread2);
                                }
                                if (wdf.f.f(fffVar, null, wdf.h)) {
                                    wdf.g(fffVar);
                                }
                                throw th3;
                            }
                        }
                    }
                    if (!compareAndSet(currentThread2, swVar2)) {
                        b(currentThread2);
                    }
                    if (isDone2) {
                        return;
                    }
                    if (call == null) {
                        call = wdf.h;
                    }
                    if (wdf.f.f(fffVar, null, call)) {
                        wdf.g(fffVar);
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
                } else if (runnable instanceof qr5) {
                    str = "running=[INTERRUPTED]";
                } else if (runnable instanceof Thread) {
                    str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
                }
                StringBuilder k = b10.k(str, ", ");
                k.append(callable.toString());
                return k.toString();
            default:
                Runnable runnable2 = (Runnable) get();
                if (runnable2 == f) {
                    str = "running=[DONE]";
                } else if (runnable2 instanceof kef) {
                    str = "running=[INTERRUPTED]";
                } else if (runnable2 instanceof Thread) {
                    str = kt6.o("running=[RUNNING ON ", ((Thread) runnable2).getName(), "]");
                }
                return kt6.o(str, ", ", callable.toString());
        }
    }

    public h4c(i4c i4cVar, Callable callable) {
        this.c = i4cVar;
        callable.getClass();
        this.b = callable;
    }
}
