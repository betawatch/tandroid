// default package

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class a7f implements bpd {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(a7f.class.getName());
    public static final g3f f;
    public static final Object h;
    public volatile Object a;
    public volatile hee b;
    public volatile a2f c;

    static {
        g3f lyeVar;
        try {
            lyeVar = new uoe(AtomicReferenceFieldUpdater.newUpdater(a2f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(a2f.class, a2f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a7f.class, a2f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a7f.class, hee.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a7f.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            lyeVar = new lye();
        }
        Throwable th2 = th;
        f = lyeVar;
        if (th2 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    public static void d(a7f a7fVar) {
        a2f a2fVar;
        g3f g3fVar;
        hee heeVar;
        hee heeVar2;
        hee heeVar3;
        do {
            a2fVar = a7fVar.c;
            g3fVar = f;
        } while (!g3fVar.e(a7fVar, a2fVar, a2f.c));
        while (true) {
            heeVar = null;
            if (a2fVar == null) {
                break;
            }
            Thread thread = a2fVar.a;
            if (thread != null) {
                a2fVar.a = null;
                LockSupport.unpark(thread);
            }
            a2fVar = a2fVar.b;
        }
        do {
            heeVar2 = a7fVar.b;
        } while (!g3fVar.c(a7fVar, heeVar2, hee.d));
        while (true) {
            heeVar3 = heeVar;
            heeVar = heeVar2;
            if (heeVar == null) {
                break;
            }
            heeVar2 = heeVar.c;
            heeVar.c = heeVar3;
        }
        while (heeVar3 != null) {
            Runnable runnable = heeVar3.a;
            hee heeVar4 = heeVar3.c;
            f(runnable, heeVar3.b);
            heeVar3 = heeVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", td4.r("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object h(Object obj) {
        if (obj instanceof kvd) {
            CancellationException cancellationException = ((kvd) obj).a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c8e) {
            throw new ExecutionException(((c8e) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (this instanceof ScheduledFuture) {
            return wi8.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // bpd
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        hee heeVar = this.b;
        hee heeVar2 = hee.d;
        if (heeVar != heeVar2) {
            hee heeVar3 = new hee(runnable, executor);
            do {
                heeVar3.c = heeVar;
                if (f.c(this, heeVar, heeVar3)) {
                    return;
                } else {
                    heeVar = this.b;
                }
            } while (heeVar != heeVar2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!f.d(this, obj, d ? new kvd(new CancellationException("Future.cancel() was called.")) : z ? kvd.b : kvd.c)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[");
                sb.append(e3.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void g(a2f a2fVar) {
        a2fVar.a = null;
        while (true) {
            a2f a2fVar2 = this.c;
            if (a2fVar2 != a2f.c) {
                a2f a2fVar3 = null;
                while (a2fVar2 != null) {
                    a2f a2fVar4 = a2fVar2.b;
                    if (a2fVar2.a != null) {
                        a2fVar3 = a2fVar2;
                    } else if (a2fVar3 != null) {
                        a2fVar3.b = a2fVar4;
                        if (a2fVar3.a == null) {
                            break;
                        }
                    } else if (f.e(this, a2fVar2, a2fVar4)) {
                    }
                    a2fVar2 = a2fVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return h(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            a2f a2fVar = this.c;
            a2f a2fVar2 = a2f.c;
            if (a2fVar != a2fVar2) {
                a2f a2fVar3 = new a2f();
                do {
                    g3f g3fVar = f;
                    g3fVar.a(a2fVar3, a2fVar);
                    if (g3fVar.e(this, a2fVar, a2fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(a2fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(a2fVar3);
                    } else {
                        a2fVar = this.c;
                    }
                } while (a2fVar != a2fVar2);
            }
            return h(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String a7fVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = true;
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = wi8.n(nanos2, concat, " nanoseconds ");
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(kt6.o(str, " for ", a7fVar));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof kvd;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof kvd) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                concat = a();
            } catch (RuntimeException e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                wi8.z("PENDING, info=[", concat, "]", sb);
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return h(obj2);
            }
            a2f a2fVar = this.c;
            a2f a2fVar2 = a2f.c;
            if (a2fVar != a2fVar2) {
                a2f a2fVar3 = new a2f();
                do {
                    g3f g3fVar = f;
                    g3fVar.a(a2fVar3, a2fVar);
                    if (g3fVar.e(this, a2fVar, a2fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                g(a2fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    a2fVar = this.c;
                } while (a2fVar != a2fVar2);
            }
            return h(this.a);
        }
        throw new InterruptedException();
    }
}
