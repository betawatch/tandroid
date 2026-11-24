// default package

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jy2 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(jy2.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater r = AtomicLongFieldUpdater.newUpdater(jy2.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(jy2.class, "_isTerminated$volatile");
    public static final du2 w = new du2("NOT_IN_STACK", (byte) 2);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final yz4 e;
    public final yz4 f;
    public final cc9 h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public jy2(int i, long j, String str, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        if (i < 1) {
            c1b.a(td4.o(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            c1b.a(b10.g(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            c1b.a(td4.o(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            c1b.a(wi8.n(j, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.e = new yz4();
        this.f = new yz4();
        this.h = new cc9((i + 1) << 1);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.h) {
            if (s.get(this) != 0) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = r;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.a) {
                return 0;
            }
            if (i >= this.b) {
                return 0;
            }
            int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i3 <= 0 || this.h.b(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            hy2 hy2Var = new hy2(this, i3);
            this.h.c(i3, hy2Var);
            if (i3 != ((int) (atomicLongFieldUpdater.incrementAndGet(this) & 2097151))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i4 = i2 + 1;
            hy2Var.start();
            return i4;
        }
    }

    public final void b(Runnable runnable, boolean z) {
        aib dibVar;
        iy2 iy2Var;
        eib.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof aib) {
            dibVar = (aib) runnable;
            dibVar.a = nanoTime;
            dibVar.b = z;
        } else {
            dibVar = new dib(nanoTime, z, runnable);
        }
        boolean z2 = dibVar.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = r;
        long addAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        hy2 hy2Var = currentThread instanceof hy2 ? (hy2) currentThread : null;
        if (hy2Var == null || hy2Var.n != this) {
            hy2Var = null;
        }
        if (hy2Var != null && (iy2Var = hy2Var.c) != iy2.e && (dibVar.b || iy2Var != iy2.b)) {
            hy2Var.h = true;
            q0d q0dVar = hy2Var.a;
            q0dVar.getClass();
            dibVar = (aib) fy.a(q0dVar, q0d.f, dibVar);
            if (dibVar != null) {
                AtomicReferenceArray atomicReferenceArray = q0dVar.a;
                if (q0dVar.a() != 127) {
                    if (dibVar.b) {
                        q0d.c.incrementAndGet(q0dVar);
                    }
                    int intVolatile = fy.a.getIntVolatile(q0dVar, q0d.g) & nm7.K1;
                    while (atomicReferenceArray.get(intVolatile) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(intVolatile, dibVar);
                    q0d.b.incrementAndGet(q0dVar);
                }
            }
            dibVar = null;
        }
        if (dibVar != null) {
            if (!(dibVar.b ? this.f.a(dibVar) : this.e.a(dibVar))) {
                throw new RejectedExecutionException(b10.j(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z2) {
            if (e() || d(addAndGet)) {
                return;
            }
            e();
            return;
        }
        if (e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(hy2 hy2Var, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = n;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = hy2Var.c();
                    while (true) {
                        if (c == w) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        hy2 hy2Var2 = (hy2) c;
                        int b = hy2Var2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = hy2Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | i3;
                jy2 jy2Var = this;
                if (atomicLongFieldUpdater.compareAndSet(jy2Var, j, j3)) {
                    return;
                } else {
                    this = jy2Var;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r1 == null) goto L37;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        aib aibVar;
        if (s.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            hy2 hy2Var = currentThread instanceof hy2 ? (hy2) currentThread : null;
            if (hy2Var == null || hy2Var.n != this) {
                hy2Var = null;
            }
            synchronized (this.h) {
                i = (int) (r.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.h.b(i2);
                    b.getClass();
                    hy2 hy2Var2 = (hy2) b;
                    if (hy2Var2 != hy2Var) {
                        while (hy2Var2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(hy2Var2);
                            hy2Var2.join(10000L);
                        }
                        q0d q0dVar = hy2Var2.a;
                        yz4 yz4Var = this.f;
                        q0dVar.getClass();
                        aib aibVar2 = (aib) fy.a(q0dVar, q0d.f, null);
                        if (aibVar2 != null) {
                            yz4Var.a(aibVar2);
                        }
                        while (true) {
                            aib b2 = q0dVar.b();
                            if (b2 == null) {
                                break;
                            } else {
                                yz4Var.a(b2);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (hy2Var != null) {
                    aibVar = hy2Var.a(true);
                }
                aibVar = (aib) this.e.d();
                if (aibVar == null && (aibVar = (aib) this.f.d()) == null) {
                    break;
                }
                try {
                    aibVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (hy2Var != null) {
                hy2Var.h(iy2.e);
            }
            n.set(this, 0L);
            r.set(this, 0L);
        }
    }

    public final boolean d(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int a = a();
            if (a == 1 && i2 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        jy2 jy2Var;
        du2 du2Var;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = n;
            long j = atomicLongFieldUpdater.get(this);
            hy2 hy2Var = (hy2) this.h.b((int) (2097151 & j));
            if (hy2Var == null) {
                hy2Var = null;
                jy2Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = hy2Var.c();
                while (true) {
                    du2Var = w;
                    if (c == du2Var) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    hy2 hy2Var2 = (hy2) c;
                    i = hy2Var2.b();
                    if (i != 0) {
                        break;
                    }
                    c = hy2Var2.c();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (i >= 0) {
                    jy2 jy2Var2 = this;
                    boolean compareAndSet = atomicLongFieldUpdater.compareAndSet(jy2Var2, j, j2 | i);
                    jy2Var = jy2Var2;
                    if (compareAndSet) {
                        hy2Var.g(du2Var);
                    }
                    this = jy2Var;
                } else {
                    continue;
                }
            }
            if (hy2Var == null) {
                return false;
            }
            if (hy2.r.compareAndSet(hy2Var, -1, 0)) {
                LockSupport.unpark(hy2Var);
                return true;
            }
            this = jy2Var;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        cc9 cc9Var = this.h;
        int a = cc9Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            hy2 hy2Var = (hy2) cc9Var.b(i6);
            if (hy2Var != null) {
                q0d q0dVar = hy2Var.a;
                q0dVar.getClass();
                Object objectVolatile = fy.a.getObjectVolatile(q0dVar, q0d.f);
                int a2 = q0dVar.a();
                if (objectVolatile != null) {
                    a2++;
                }
                int ordinal = hy2Var.c.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(a2);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a2);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (a2 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(a2);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new rq2();
                    }
                    i5++;
                }
            }
        }
        long j = r.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(ea3.a(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.a;
        sb4.append(i7);
        sb4.append(", max = ");
        ts2.v(sb4, this.b, "}, Worker States {CPU = ", i, ", blocking = ");
        ts2.v(sb4, i2, ", parked = ", i3, ", dormant = ");
        ts2.v(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
