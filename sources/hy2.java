// default package

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import org.telegram.tgnet.ConnectionsManager;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hy2 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(hy2.class, "workerCtl$volatile");
    public static final /* synthetic */ long s = fy.a.objectFieldOffset(hy2.class.getDeclaredField("workerCtl$volatile"));
    public final q0d a;
    public final e79 b;
    public iy2 c;
    public long d;
    public long e;
    public int f;
    public boolean h;
    private volatile int indexInArray;
    public final /* synthetic */ jy2 n;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public hy2(jy2 jy2Var, int i) {
        this.n = jy2Var;
        setDaemon(true);
        setContextClassLoader(jy2.class.getClassLoader());
        this.a = new q0d();
        this.b = new e79();
        this.c = iy2.d;
        this.nextParkedWorker = jy2.w;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final aib a(boolean z) {
        aib e;
        aib e2;
        long j;
        Unsafe unsafe;
        Unsafe unsafe2;
        iy2 iy2Var = this.c;
        jy2 jy2Var = this.n;
        aib aibVar = null;
        q0d q0dVar = this.a;
        iy2 iy2Var2 = iy2.a;
        if (iy2Var != iy2Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = jy2.r;
            do {
                j = atomicLongFieldUpdater.get(jy2Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    q0dVar.getClass();
                    long j2 = q0d.f;
                    loop1: while (true) {
                        unsafe = fy.a;
                        aib aibVar2 = (aib) unsafe.getObjectVolatile(q0dVar, j2);
                        if (aibVar2 == null || !aibVar2.b) {
                            break;
                        }
                        do {
                            unsafe2 = fy.a;
                            if (unsafe2.compareAndSwapObject(q0dVar, q0d.f, aibVar2, (Object) null)) {
                                aibVar = aibVar2;
                                break loop1;
                            }
                        } while (unsafe2.getObjectVolatile(q0dVar, j2) == aibVar2);
                    }
                    int intVolatile = unsafe.getIntVolatile(q0dVar, q0d.e);
                    int intVolatile2 = unsafe.getIntVolatile(q0dVar, q0d.g);
                    while (true) {
                        if (intVolatile == intVolatile2 || fy.a.getIntVolatile(q0dVar, q0d.d) == 0) {
                            break;
                        }
                        intVolatile2--;
                        aib c = q0dVar.c(intVolatile2, true);
                        if (c != null) {
                            aibVar = c;
                            break;
                        }
                    }
                    if (aibVar != null) {
                        return aibVar;
                    }
                    aib aibVar3 = (aib) jy2Var.f.d();
                    return aibVar3 == null ? i(1) : aibVar3;
                }
            } while (!jy2.r.compareAndSet(jy2Var, j, j - 4398046511104L));
            this.c = iy2Var2;
        }
        if (z) {
            boolean z2 = d(jy2Var.a << 1) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            q0dVar.getClass();
            aib aibVar4 = (aib) fy.a(q0dVar, q0d.f, null);
            if (aibVar4 == null) {
                aibVar4 = q0dVar.b();
            }
            if (aibVar4 != null) {
                return aibVar4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            aib e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & ConnectionsManager.DEFAULT_DATACENTER_ID) % i;
    }

    public final aib e() {
        int d = d(2);
        jy2 jy2Var = this.n;
        yz4 yz4Var = jy2Var.f;
        yz4 yz4Var2 = jy2Var.e;
        if (d == 0) {
            aib aibVar = (aib) yz4Var2.d();
            return aibVar != null ? aibVar : (aib) yz4Var.d();
        }
        aib aibVar2 = (aib) yz4Var.d();
        return aibVar2 != null ? aibVar2 : (aib) yz4Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.n.d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(iy2 iy2Var) {
        iy2 iy2Var2 = this.c;
        boolean z = iy2Var2 == iy2.a;
        if (z) {
            jy2.r.addAndGet(this.n, 4398046511104L);
        }
        if (iy2Var2 != iy2Var) {
            this.c = iy2Var;
        }
        return z;
    }

    public final aib i(int i) {
        int i2;
        long j;
        aib aibVar;
        long j2;
        long j3;
        Unsafe unsafe;
        int i3 = i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = jy2.r;
        jy2 jy2Var = this.n;
        int i4 = (int) (atomicLongFieldUpdater.get(jy2Var) & 2097151);
        aib aibVar2 = null;
        if (i4 < 2) {
            return null;
        }
        int d = d(i4);
        int i5 = 0;
        long j4 = Long.MAX_VALUE;
        while (i5 < i4) {
            d++;
            if (d > i4) {
                d = 1;
            }
            hy2 hy2Var = (hy2) jy2Var.h.b(d);
            if (hy2Var == null || hy2Var == this) {
                i2 = i4;
            } else {
                q0d q0dVar = hy2Var.a;
                if (i3 == 3) {
                    aibVar = q0dVar.b();
                    i2 = i4;
                    j = 0;
                } else {
                    q0dVar.getClass();
                    Unsafe unsafe2 = fy.a;
                    int intVolatile = unsafe2.getIntVolatile(q0dVar, q0d.e);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(q0dVar, q0d.g);
                    boolean z = i3 == 1;
                    while (true) {
                        if (intVolatile == intVolatile2) {
                            i2 = i4;
                            break;
                        }
                        if (z) {
                            i2 = i4;
                            if (fy.a.getIntVolatile(q0dVar, q0d.d) == 0) {
                                break;
                            }
                        } else {
                            i2 = i4;
                        }
                        int i6 = intVolatile + 1;
                        aib c = q0dVar.c(intVolatile, z);
                        if (c != null) {
                            aibVar = c;
                            break;
                        }
                        intVolatile = i6;
                        i4 = i2;
                    }
                    aibVar = aibVar2;
                }
                e79 e79Var = this.b;
                if (aibVar != null) {
                    e79Var.a = aibVar;
                    j3 = -1;
                    j2 = -1;
                } else {
                    j2 = -1;
                    long j5 = q0d.f;
                    while (true) {
                        aib aibVar3 = (aib) fy.a.getObjectVolatile(q0dVar, j5);
                        if (aibVar3 == null) {
                            break;
                        }
                        if (((aibVar3.b ? 1 : 2) & i) == 0) {
                            break;
                        }
                        eib.f.getClass();
                        q0d q0dVar2 = q0dVar;
                        long nanoTime = System.nanoTime() - aibVar3.a;
                        long j6 = eib.b;
                        if (nanoTime < j6) {
                            j3 = j6 - nanoTime;
                            break;
                        }
                        do {
                            unsafe = fy.a;
                            if (unsafe.compareAndSwapObject(q0dVar2, q0d.f, aibVar3, (Object) null)) {
                                e79Var.a = aibVar3;
                                j3 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(q0dVar2, j5) == aibVar3);
                        q0dVar = q0dVar2;
                    }
                    j3 = -2;
                }
                if (j3 == j2) {
                    aib aibVar4 = (aib) e79Var.a;
                    e79Var.a = null;
                    return aibVar4;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
            aibVar2 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.e = j4;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        iy2 iy2Var;
        loop0: while (true) {
            boolean z = false;
            while (jy2.s.get(this.n) == 0) {
                iy2 iy2Var2 = this.c;
                iy2 iy2Var3 = iy2.e;
                if (iy2Var2 == iy2Var3) {
                    break loop0;
                }
                aib a = a(this.h);
                if (a != null) {
                    this.e = 0L;
                    jy2 jy2Var = this.n;
                    this.d = 0L;
                    if (this.c == iy2.c) {
                        this.c = iy2.b;
                    }
                    if (a.b) {
                        if (h(iy2.b) && !jy2Var.e() && !jy2Var.d(jy2.r.get(jy2Var))) {
                            jy2Var.e();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        jy2.r.addAndGet(jy2Var, -2097152L);
                        if (this.c != iy2Var3) {
                            this.c = iy2.d;
                        }
                    } else {
                        try {
                            a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.h = false;
                    if (this.e == 0) {
                        Object obj = this.nextParkedWorker;
                        du2 du2Var = jy2.w;
                        if (obj != du2Var) {
                            int i = -1;
                            fy.a.putIntVolatile(this, s, -1);
                            while (this.nextParkedWorker != jy2.w) {
                                Unsafe unsafe = fy.a;
                                long j = s;
                                if (unsafe.getIntVolatile(this, j) == i) {
                                    jy2 jy2Var2 = this.n;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = jy2.s;
                                    if (atomicIntegerFieldUpdater.get(jy2Var2) == 0) {
                                        iy2 iy2Var4 = this.c;
                                        iy2 iy2Var5 = iy2.e;
                                        if (iy2Var4 != iy2Var5) {
                                            h(iy2.c);
                                            Thread.interrupted();
                                            if (this.d == 0) {
                                                iy2Var = iy2Var5;
                                                this.d = System.nanoTime() + this.n.c;
                                            } else {
                                                iy2Var = iy2Var5;
                                            }
                                            LockSupport.parkNanos(this.n.c);
                                            if (System.nanoTime() - this.d >= 0) {
                                                this.d = 0L;
                                                jy2 jy2Var3 = this.n;
                                                synchronized (jy2Var3.h) {
                                                    if (!(atomicIntegerFieldUpdater.get(jy2Var3) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater = jy2.r;
                                                        if (((int) (atomicLongFieldUpdater.get(jy2Var3) & 2097151)) > jy2Var3.a) {
                                                            if (unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                                int i2 = this.indexInArray;
                                                                f(0);
                                                                jy2Var3.c(this, i2, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(jy2Var3) & 2097151);
                                                                if (andDecrement != i2) {
                                                                    Object b = jy2Var3.h.b(andDecrement);
                                                                    b.getClass();
                                                                    hy2 hy2Var = (hy2) b;
                                                                    jy2Var3.h.c(i2, hy2Var);
                                                                    hy2Var.f(i2);
                                                                    jy2Var3.c(hy2Var, andDecrement, i2);
                                                                }
                                                                jy2Var3.h.c(andDecrement, null);
                                                                this.c = iy2Var;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i = -1;
                                        }
                                    }
                                }
                            }
                        } else {
                            jy2 jy2Var4 = this.n;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = jy2.n;
                            if (this.nextParkedWorker == du2Var) {
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(jy2Var4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = jy2Var4.h.b((int) (j2 & 2097151));
                                    jy2 jy2Var5 = jy2Var4;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                    if (!atomicLongFieldUpdater3.compareAndSet(jy2Var5, j2, ((j2 + 2097152) & (-2097152)) | i3)) {
                                        atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                        jy2Var4 = jy2Var5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(iy2.c);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.e);
                        this.e = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(iy2.e);
    }
}
