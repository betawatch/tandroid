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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class lgf implements x76 {
    public static final boolean d;
    public static final Logger e;
    public static final v8f f;
    public static final Object h;
    public volatile Object a;
    public volatile fgf b;
    public volatile jgf c;

    static {
        boolean z;
        v8f hgfVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = Logger.getLogger(lgf.class.getName());
        try {
            hgfVar = new igf();
            th = null;
            th2 = null;
        } catch (Error | RuntimeException e2) {
            try {
                th2 = e2;
                hgfVar = new ggf(AtomicReferenceFieldUpdater.newUpdater(jgf.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(jgf.class, jgf.class, "b"), AtomicReferenceFieldUpdater.newUpdater(lgf.class, jgf.class, "c"), AtomicReferenceFieldUpdater.newUpdater(lgf.class, fgf.class, "b"), AtomicReferenceFieldUpdater.newUpdater(lgf.class, Object.class, "a"));
                th = null;
            } catch (Error | RuntimeException e3) {
                hgfVar = new hgf();
                th = e3;
                th2 = e2;
            }
        }
        f = hgfVar;
        if (th != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    public static Object e(lgf lgfVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = lgfVar.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void g(lgf lgfVar) {
        for (jgf b = f.b(lgfVar); b != null; b = b.b) {
            Thread thread = b.a;
            if (thread != null) {
                b.a = null;
                LockSupport.unpark(thread);
            }
        }
        lgfVar.d();
        fgf a = f.a(lgfVar);
        fgf fgfVar = null;
        while (a != null) {
            fgf fgfVar2 = a.c;
            a.c = fgfVar;
            fgfVar = a;
            a = fgfVar2;
        }
        while (fgfVar != null) {
            Runnable runnable = fgfVar.a;
            fgf fgfVar3 = fgfVar.c;
            runnable.getClass();
            Executor executor = fgfVar.b;
            executor.getClass();
            h(runnable, executor);
            fgfVar = fgfVar3;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", qd4.q("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    public static final Object j(Object obj) {
        if (obj instanceof dgf) {
            RuntimeException runtimeException = ((dgf) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof egf) {
            throw new ExecutionException(((egf) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a() {
        if (this instanceof ScheduledFuture) {
            return ik8.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // x76
    public final void b(Runnable runnable, Executor executor) {
        fgf fgfVar;
        fgf fgfVar2 = fgf.d;
        if (!isDone() && (fgfVar = this.b) != fgfVar2) {
            fgf fgfVar3 = new fgf(runnable, executor);
            do {
                fgfVar3.c = fgfVar;
                if (f.e(this, fgfVar, fgfVar3)) {
                    return;
                } else {
                    fgfVar = this.b;
                }
            } while (fgfVar != fgfVar2);
        }
        h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        dgf dgfVar;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            dgfVar = new dgf(z, new CancellationException("Future.cancel() was called."));
        } else {
            dgfVar = z ? dgf.c : dgf.d;
            dgfVar.getClass();
        }
        if (!f.f(this, obj, dgfVar)) {
            return false;
        }
        g(this);
        return true;
    }

    public final void f(StringBuilder sb) {
        try {
            Object e2 = e(this);
            sb.append("SUCCESS, result=[");
            if (e2 == null) {
                sb.append("null");
            } else if (e2 == this) {
                sb.append("this future");
            } else {
                sb.append(e2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(e2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x009c -> B:27:0x006b). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        long nanoTime;
        jgf jgfVar = jgf.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return j(obj);
        }
        long j3 = 0;
        long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            jgf jgfVar2 = this.c;
            if (jgfVar2 != jgfVar) {
                jgf jgfVar3 = new jgf();
                while (true) {
                    v8f v8fVar = f;
                    v8fVar.c(jgfVar3, jgfVar2);
                    boolean g = v8fVar.g(this, jgfVar2, jgfVar3);
                    j2 = j3;
                    if (!g) {
                        jgfVar2 = this.c;
                        if (jgfVar2 == jgfVar) {
                            break;
                        }
                        j3 = j2;
                    } else {
                        while (true) {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                i(jgfVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return j(obj2);
                            }
                            nanoTime = nanoTime2 - System.nanoTime();
                            if (nanoTime < 1000) {
                                i(jgfVar3);
                                break;
                            }
                            nanos = nanoTime;
                        }
                    }
                }
            }
            Object obj3 = this.a;
            obj3.getClass();
            return j(obj3);
        }
        j2 = 0;
        if (nanos <= j2) {
            String lgfVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j2) {
                String concat = str.concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                boolean z = true;
                if (convert != j2 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > j2) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = ik8.n(nanos2, concat, " nanoseconds ");
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(qd4.y(str, " for ", lgfVar));
        }
        Object obj5 = this.a;
        if (obj5 != null) {
            return j(obj5);
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        nanoTime = nanoTime2 - System.nanoTime();
        nanos = nanoTime;
        if (nanos <= j2) {
        }
    }

    public final void i(jgf jgfVar) {
        jgfVar.a = null;
        while (true) {
            jgf jgfVar2 = this.c;
            if (jgfVar2 != jgf.c) {
                jgf jgfVar3 = null;
                while (jgfVar2 != null) {
                    jgf jgfVar4 = jgfVar2.b;
                    if (jgfVar2.a != null) {
                        jgfVar3 = jgfVar2;
                    } else if (jgfVar3 != null) {
                        jgfVar3.b = jgfVar4;
                        if (jgfVar3.a == null) {
                            break;
                        }
                    } else if (f.g(this, jgfVar2, jgfVar4)) {
                    }
                    jgfVar2 = jgfVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof dgf;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r3.isEmpty() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.a instanceof dgf) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            f(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                concat = a();
                int i = y2e.a;
                if (concat != null) {
                }
                concat = null;
            } catch (RuntimeException | StackOverflowError e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (concat != null) {
                ik8.z(", info=[", concat, "]", sb);
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                f(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        jgf jgfVar = jgf.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return j(obj2);
            }
            jgf jgfVar2 = this.c;
            if (jgfVar2 != jgfVar) {
                jgf jgfVar3 = new jgf();
                do {
                    v8f v8fVar = f;
                    v8fVar.c(jgfVar3, jgfVar2);
                    if (v8fVar.g(this, jgfVar2, jgfVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(jgfVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return j(obj);
                    }
                    jgfVar2 = this.c;
                } while (jgfVar2 != jgfVar);
            }
            Object obj3 = this.a;
            obj3.getClass();
            return j(obj3);
        }
        throw new InterruptedException();
    }
}
