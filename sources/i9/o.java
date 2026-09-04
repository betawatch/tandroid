package i9;

import com.google.android.gms.internal.play_billing.s0;
import j$.util.Objects;
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
import org.telegram.messenger.BuildConfig;
import org.telegram.ui.Cells.p6;
import v7.k8;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class o extends j9.a implements w {
    public static final boolean d;
    public static final s0 e;
    public static final k8 f;
    public static final Object h;
    public volatile Object a;
    public volatile c b;
    public volatile n c;

    static {
        boolean z10;
        Throwable th2;
        k8 fVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        d = z10;
        e = new s0(o.class, 1);
        Throwable th3 = null;
        try {
            fVar = new m();
            th2 = null;
        } catch (Error | Exception e7) {
            th2 = e7;
            try {
                fVar = new d(AtomicReferenceFieldUpdater.newUpdater(n.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(n.class, n.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o.class, n.class, "c"), AtomicReferenceFieldUpdater.newUpdater(o.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "a"));
            } catch (Error | Exception e10) {
                th3 = e10;
                fVar = new f();
            }
        }
        f = fVar;
        if (th3 != null) {
            s0 s0Var = e;
            Logger a2 = s0Var.a();
            Level level = Level.SEVERE;
            a2.log(level, "UnsafeAtomicHelper is broken!", th2);
            s0Var.a().log(level, "SafeAtomicHelper is broken!", th3);
        }
        h = new Object();
    }

    public static void g(o oVar, boolean z10) {
        c cVar = null;
        while (true) {
            for (n e7 = f.e(oVar); e7 != null; e7 = e7.b) {
                Thread thread = e7.a;
                if (thread != null) {
                    e7.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                z10 = false;
            }
            oVar.e();
            c cVar2 = cVar;
            c d10 = f.d(oVar);
            c cVar3 = cVar2;
            while (d10 != null) {
                c cVar4 = d10.c;
                d10.c = cVar3;
                cVar3 = d10;
                d10 = cVar4;
            }
            while (cVar3 != null) {
                cVar = cVar3.c;
                Runnable runnable = cVar3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof e) {
                    e eVar = (e) runnable;
                    oVar = eVar.a;
                    if (oVar.a == eVar) {
                        if (f.b(oVar, eVar, j(eVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = cVar3.b;
                    Objects.requireNonNull(executor);
                    h(runnable, executor);
                }
                cVar3 = cVar;
            }
            return;
        }
    }

    public static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
        }
    }

    public static Object i(Object obj) {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object j(w wVar) {
        Object obj;
        Throwable th2;
        if (wVar instanceof g) {
            Object obj2 = ((o) wVar).a;
            if (obj2 instanceof a) {
                a aVar = (a) obj2;
                if (aVar.a) {
                    obj2 = aVar.b != null ? new a(aVar.b, false) : a.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if (wVar instanceof j9.a) {
            o oVar = (o) ((j9.a) wVar);
            if (oVar instanceof g) {
                Object obj3 = oVar.a;
                if (obj3 instanceof b) {
                    th2 = ((b) obj3).a;
                    if (th2 != null) {
                        return new b(th2);
                    }
                }
            } else {
                oVar.getClass();
            }
            th2 = null;
            if (th2 != null) {
            }
        }
        boolean isCancelled = wVar.isCancelled();
        if ((!d) && isCancelled) {
            a aVar2 = a.d;
            Objects.requireNonNull(aVar2);
            return aVar2;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = wVar.get();
                        break;
                    } catch (Error e7) {
                        e = e7;
                        return new b(e);
                    }
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th3) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            } catch (Error | Exception e10) {
                e = e10;
                return new b(e);
            } catch (CancellationException e11) {
                if (isCancelled) {
                    return new a(e11, false);
                }
                return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + wVar, e11));
            } catch (ExecutionException e12) {
                if (!isCancelled) {
                    return new b(e12.getCause());
                }
                return new a(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + wVar, e12), false);
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        if (!isCancelled) {
            return obj == null ? h : obj;
        }
        return new a(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + wVar), false);
    }

    @Override // i9.w
    public void a(Runnable runnable, Executor executor) {
        c cVar;
        c cVar2 = c.d;
        if (!isDone() && (cVar = this.b) != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.c = cVar;
                if (f.a(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.b;
                }
            } while (cVar != cVar2);
        }
        h(runnable, executor);
    }

    public final void c(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (ExecutionException e7) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e7.getCause());
                sb2.append("]");
                return;
            } catch (Exception e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        f(sb2, obj);
        sb2.append("]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z10) {
        a aVar;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        if (d) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z10);
        } else {
            aVar = z10 ? a.c : a.d;
            Objects.requireNonNull(aVar);
        }
        boolean z11 = false;
        o oVar = this;
        while (true) {
            if (f.b(oVar, obj, aVar)) {
                g(oVar, z10);
                if (!(obj instanceof e)) {
                    break;
                }
                w wVar = ((e) obj).b;
                if (!(wVar instanceof g)) {
                    wVar.cancel(z10);
                    break;
                }
                oVar = (o) wVar;
                obj = oVar.a;
                if (!(obj == null) && !(obj instanceof e)) {
                    break;
                }
                z11 = true;
            } else {
                obj = oVar.a;
                if (!(obj instanceof e)) {
                    return z11;
                }
            }
        }
    }

    public final void f(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append(BuildConfig.BETA_URL);
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c4 -> B:34:0x0082). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object get(long j3, TimeUnit timeUnit) {
        long j10;
        long nanoTime;
        n nVar = n.c;
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof e))) {
            return i(obj);
        }
        long j11 = 0;
        long nanoTime2 = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            n nVar2 = this.c;
            if (nVar2 != nVar) {
                n nVar3 = new n();
                while (true) {
                    k8 k8Var = f;
                    k8Var.f(nVar3, nVar2);
                    if (k8Var.c(this, nVar2, nVar3)) {
                        j10 = j11;
                        while (true) {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                l(nVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return i(obj2);
                            }
                            nanoTime = nanoTime2 - System.nanoTime();
                            if (nanoTime < 1000) {
                                l(nVar3);
                                break;
                            }
                            nanos = nanoTime;
                        }
                    } else {
                        long j12 = j11;
                        nVar2 = this.c;
                        if (nVar2 == nVar) {
                            break;
                        }
                        j11 = j12;
                    }
                }
                nanos = nanoTime;
                if (nanos <= j10) {
                    String oVar = toString();
                    String obj3 = timeUnit.toString();
                    Locale locale = Locale.ROOT;
                    String lowerCase = obj3.toLowerCase(locale);
                    StringBuilder t10 = a4.a.t(j3, "Waited ", " ");
                    t10.append(timeUnit.toString().toLowerCase(locale));
                    String sb2 = t10.toString();
                    if (nanos + 1000 < j10) {
                        String t11 = p6.t(sb2, " (plus ");
                        long j13 = -nanos;
                        long convert = timeUnit.convert(j13, TimeUnit.NANOSECONDS);
                        long nanos2 = j13 - timeUnit.toNanos(convert);
                        boolean z10 = convert == j10 || nanos2 > 1000;
                        if (convert > j10) {
                            String str = t11 + convert + " " + lowerCase;
                            if (z10) {
                                str = p6.t(str, ",");
                            }
                            t11 = p6.t(str, " ");
                        }
                        if (z10) {
                            t11 = t11 + nanos2 + " nanoseconds ";
                        }
                        sb2 = p6.t(t11, "delay)");
                    }
                    if (isDone()) {
                        throw new TimeoutException(p6.t(sb2, " but future completed as timeout expired"));
                    }
                    throw new TimeoutException(a4.a.C(sb2, " for ", oVar));
                }
                Object obj4 = this.a;
                if ((obj4 != null) && (!(obj4 instanceof e))) {
                    return i(obj4);
                }
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                nanoTime = nanoTime2 - System.nanoTime();
                nanos = nanoTime;
                if (nanos <= j10) {
                }
            }
            Object obj5 = this.a;
            Objects.requireNonNull(obj5);
            return i(obj5);
        }
        j10 = 0;
        if (nanos <= j10) {
        }
    }

    public boolean isCancelled() {
        return this.a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof e)) & (this.a != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String k() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void l(n nVar) {
        nVar.a = null;
        while (true) {
            n nVar2 = this.c;
            if (nVar2 == n.c) {
                return;
            }
            n nVar3 = null;
            while (nVar2 != null) {
                n nVar4 = nVar2.b;
                if (nVar2.a != null) {
                    nVar3 = nVar2;
                } else if (nVar3 != null) {
                    nVar3.b = nVar4;
                    if (nVar3.a == null) {
                        break;
                    }
                } else if (!f.c(this, nVar2, nVar4)) {
                    break;
                }
                nVar2 = nVar4;
            }
            return;
        }
    }

    public boolean m(Object obj) {
        if (obj == null) {
            obj = h;
        }
        if (!f.b(this, null, obj)) {
            return false;
        }
        g(this, false);
        return true;
    }

    public boolean n(Throwable th2) {
        if (!f.b(this, null, new b(th2))) {
            return false;
        }
        g(this, false);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r3.isEmpty() != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.a;
            if (obj instanceof e) {
                sb2.append(", setFuture=[");
                w wVar = ((e) obj).b;
                try {
                    if (wVar == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(wVar);
                    }
                } catch (Exception e7) {
                    e = e7;
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e.getClass());
                    sb2.append("]");
                    if (isDone()) {
                    }
                    sb2.append("]");
                    return sb2.toString();
                } catch (StackOverflowError e10) {
                    e = e10;
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e.getClass());
                    sb2.append("]");
                    if (isDone()) {
                    }
                    sb2.append("]");
                    return sb2.toString();
                }
                sb2.append("]");
            } else {
                try {
                    str = k();
                    if (str != null) {
                    }
                    str = null;
                } catch (Exception | StackOverflowError e11) {
                    str = "Exception thrown from implementation: " + e11.getClass();
                }
                if (str != null) {
                    sb2.append(", info=[");
                    sb2.append(str);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                c(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void e() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        n nVar = n.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return i(obj2);
            }
            n nVar2 = this.c;
            if (nVar2 != nVar) {
                n nVar3 = new n();
                do {
                    k8 k8Var = f;
                    k8Var.f(nVar3, nVar2);
                    if (k8Var.c(this, nVar2, nVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                l(nVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return i(obj);
                    }
                    nVar2 = this.c;
                } while (nVar2 != nVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return i(obj3);
        }
        throw new InterruptedException();
    }
}
