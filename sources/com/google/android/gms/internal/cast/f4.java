package com.google.android.gms.internal.cast;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class f4 extends f7.s5 implements r8.a {
    public static final boolean d;
    public static final Logger e;
    public static final f7.q5 f;
    public static final Object h;
    public volatile Object a;
    public volatile z3 b;
    public volatile e4 c;

    static {
        boolean z10;
        f7.q5 b4Var;
        Throwable th;
        Throwable th2;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        d = z10;
        e = Logger.getLogger(f4.class.getName());
        Throwable th3 = null;
        try {
            b4Var = new d4();
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e10) {
            try {
                th = e10;
                b4Var = new a4(AtomicReferenceFieldUpdater.newUpdater(e4.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(e4.class, e4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f4.class, e4.class, "c"), AtomicReferenceFieldUpdater.newUpdater(f4.class, z3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f4.class, Object.class, "a"));
            } catch (Error | RuntimeException e11) {
                th3 = e11;
                b4Var = new b4();
                th = e10;
            }
            th2 = th3;
        }
        f = b4Var;
        if (th2 != null) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    public static Object e(f4 f4Var) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = f4Var.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void g(f4 f4Var) {
        for (e4 b10 = f.b(f4Var); b10 != null; b10 = b10.b) {
            Thread thread = b10.a;
            if (thread != null) {
                b10.a = null;
                LockSupport.unpark(thread);
            }
        }
        f4Var.c();
        z3 a2 = f.a(f4Var);
        z3 z3Var = null;
        while (a2 != null) {
            z3 z3Var2 = a2.c;
            a2.c = z3Var;
            z3Var = a2;
            a2 = z3Var2;
        }
        while (z3Var != null) {
            af.e eVar = z3Var.a;
            z3 z3Var3 = z3Var.c;
            eVar.getClass();
            c2.f fVar = z3Var.b;
            fVar.getClass();
            try {
                fVar.execute(eVar);
            } catch (RuntimeException e10) {
                e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", j3.r0.o("RuntimeException while executing runnable ", String.valueOf(eVar), " with executor ", String.valueOf(fVar)), (Throwable) e10);
            }
            z3Var = z3Var3;
        }
    }

    public static final Object i(Object obj) {
        if (obj instanceof x3) {
            Throwable th = ((x3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof y3) {
            throw new ExecutionException(((y3) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (this instanceof ScheduledFuture) {
            return aa.d.n(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        x3 x3Var;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            x3Var = new x3(new CancellationException("Future.cancel() was called."), z10);
        } else {
            x3Var = z10 ? x3.c : x3.d;
            x3Var.getClass();
        }
        if (!f.e(this, obj, x3Var)) {
            return false;
        }
        g(this);
        return true;
    }

    public final void f(StringBuilder sb2) {
        try {
            Object e10 = e(this);
            sb2.append("SUCCESS, result=[");
            if (e10 == null) {
                sb2.append(BuildConfig.BETA_URL);
            } else if (e10 == this) {
                sb2.append("this future");
            } else {
                sb2.append(e10.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(e10)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e12) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e12.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        e4 e4Var = e4.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            return i(obj2);
        }
        e4 e4Var2 = this.c;
        if (e4Var2 != e4Var) {
            e4 e4Var3 = new e4();
            do {
                f7.q5 q5Var = f;
                q5Var.c(e4Var3, e4Var2);
                if (q5Var.f(this, e4Var2, e4Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(e4Var3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (obj == null);
                    return i(obj);
                }
                e4Var2 = this.c;
            } while (e4Var2 != e4Var);
        }
        Object obj3 = this.a;
        obj3.getClass();
        return i(obj3);
    }

    public final void h(e4 e4Var) {
        e4Var.a = null;
        while (true) {
            e4 e4Var2 = this.c;
            if (e4Var2 != e4.c) {
                e4 e4Var3 = null;
                while (e4Var2 != null) {
                    e4 e4Var4 = e4Var2.b;
                    if (e4Var2.a != null) {
                        e4Var3 = e4Var2;
                    } else if (e4Var3 != null) {
                        e4Var3.b = e4Var4;
                        if (e4Var3.a == null) {
                            break;
                        }
                    } else if (!f.f(this, e4Var2, e4Var4)) {
                        break;
                    }
                    e4Var2 = e4Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof x3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r3.isEmpty() != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.a instanceof x3) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            f(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            try {
                concat = b();
                int i9 = b0.a;
                if (concat != null) {
                }
                concat = null;
            } catch (RuntimeException | StackOverflowError e10) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (concat != null) {
                sb2.append(", info=[");
                sb2.append(concat);
                sb2.append("]");
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                f(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009e -> B:28:0x006b). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j10, TimeUnit timeUnit) {
        long j11;
        long nanoTime;
        e4 e4Var = e4.c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return i(obj);
            }
            long j12 = 0;
            long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                e4 e4Var2 = this.c;
                if (e4Var2 != e4Var) {
                    e4 e4Var3 = new e4();
                    while (true) {
                        f7.q5 q5Var = f;
                        q5Var.c(e4Var3, e4Var2);
                        if (q5Var.f(this, e4Var2, e4Var3)) {
                            j11 = j12;
                            while (true) {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return i(obj2);
                                    }
                                    nanoTime = nanoTime2 - System.nanoTime();
                                    if (nanoTime < 1000) {
                                        h(e4Var3);
                                        break;
                                    }
                                    nanos = nanoTime;
                                } else {
                                    h(e4Var3);
                                    throw new InterruptedException();
                                }
                            }
                        } else {
                            long j13 = j12;
                            e4Var2 = this.c;
                            if (e4Var2 == e4Var) {
                                break;
                            }
                            j12 = j13;
                        }
                    }
                }
                Object obj3 = this.a;
                obj3.getClass();
                return i(obj3);
            }
            j11 = 0;
            if (nanos > j11) {
                Object obj4 = this.a;
                if (obj4 != null) {
                    return i(obj4);
                }
                if (!Thread.interrupted()) {
                    nanoTime = nanoTime2 - System.nanoTime();
                    nanos = nanoTime;
                    if (nanos > j11) {
                    }
                } else {
                    throw new InterruptedException();
                }
            } else {
                String f4Var = toString();
                String obj5 = timeUnit.toString();
                Locale locale = Locale.ROOT;
                String lowerCase = obj5.toLowerCase(locale);
                String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
                if (nanos + 1000 < j11) {
                    String concat = str.concat(" (plus ");
                    long j14 = -nanos;
                    long convert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
                    long nanos2 = j14 - timeUnit.toNanos(convert);
                    boolean z10 = true;
                    if (convert != j11 && nanos2 <= 1000) {
                        z10 = false;
                    }
                    if (convert > j11) {
                        String str2 = concat + convert + " " + lowerCase;
                        if (z10) {
                            str2 = str2.concat(",");
                        }
                        concat = str2.concat(" ");
                    }
                    if (z10) {
                        concat = concat + nanos2 + " nanoseconds ";
                    }
                    str = concat.concat("delay)");
                }
                if (isDone()) {
                    throw new TimeoutException(str.concat(" but future completed as timeout expired"));
                }
                throw new TimeoutException(aa.d.z(str, " for ", f4Var));
            }
        } else {
            throw new InterruptedException();
        }
    }

    public void c() {
    }
}
