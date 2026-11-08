package ge;

import a8.p0;
import ee.p;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import org.telegram.messenger.qs;
import zd.b0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater r = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final com.google.android.gms.internal.clearcut.e w = new com.google.android.gms.internal.clearcut.e("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final f e;
    public final f f;
    public final p h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i7, long j3, String str, int i10) {
        this.a = i7;
        this.b = i10;
        this.c = j3;
        this.d = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(jg.g.k(i7, "Core pool size ", " should be at least 1").toString());
        }
        if (i10 < i7) {
            throw new IllegalArgumentException(p0.m(i10, i7, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i10 > 2097150) {
            throw new IllegalArgumentException(jg.g.k(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(rf.b.h(j3, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.e = new f();
        this.f = new f();
        this.h = new p((i7 + 1) * 2);
        this.controlState$volatile = i7 << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.h) {
            try {
                if (s.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = r;
                long j3 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j3 & 2097151);
                int i10 = i7 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.a) {
                    return 0;
                }
                if (i7 >= this.b) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.h.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i11);
                this.h.c(i11, aVar);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                aVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Runnable runnable, boolean z9) {
        i jVar;
        b bVar;
        k.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.a = nanoTime;
            jVar.b = z9;
        } else {
            jVar = new j(nanoTime, z9, runnable);
        }
        boolean z10 = jVar.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = r;
        long addAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !kotlin.jvm.internal.j.a(aVar.n, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.c) != b.e && (jVar.b || bVar != b.b)) {
            aVar.h = true;
            m mVar = aVar.a;
            mVar.getClass();
            jVar = (i) m.b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.d.get(mVar) != 127) {
                    if (jVar.b) {
                        m.e.incrementAndGet(mVar);
                    }
                    int i7 = atomicIntegerFieldUpdater.get(mVar) & qs.L1;
                    while (atomicReferenceArray.get(i7) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i7, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (!(jVar.b ? this.f.a(jVar) : this.e.a(jVar))) {
                throw new RejectedExecutionException(p0.s(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z10) {
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

    public final void c(a aVar, int i7, int i10) {
        while (true) {
            long j3 = n.get(this);
            int i11 = (int) (2097151 & j3);
            long j10 = (2097152 + j3) & (-2097152);
            if (i11 == i7) {
                if (i10 == 0) {
                    Object c10 = aVar.c();
                    while (true) {
                        if (c10 == w) {
                            i11 = -1;
                            break;
                        }
                        if (c10 == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) c10;
                        int b10 = aVar2.b();
                        if (b10 != 0) {
                            i11 = b10;
                            break;
                        }
                        c10 = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (n.compareAndSet(this, j3, i11 | j10)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i7;
        i iVar;
        if (s.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !kotlin.jvm.internal.j.a(aVar.n, this)) {
                aVar = null;
            }
            synchronized (this.h) {
                i7 = (int) (r.get(this) & 2097151);
            }
            if (1 <= i7) {
                int i10 = 1;
                while (true) {
                    Object b10 = this.h.b(i10);
                    kotlin.jvm.internal.j.b(b10);
                    a aVar2 = (a) b10;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.a;
                        f fVar = this.f;
                        mVar.getClass();
                        i iVar2 = (i) m.b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i a10 = mVar.a();
                            if (a10 == null) {
                                break;
                            } else {
                                fVar.a(a10);
                            }
                        }
                    }
                    if (i10 == i7) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.e.d();
                if (iVar == null && (iVar = (i) this.f.d()) == null) {
                    break;
                }
                try {
                    iVar.run();
                } catch (Throwable th2) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                }
            }
            if (aVar != null) {
                aVar.i(b.e);
            }
            n.set(this, 0L);
            r.set(this, 0L);
        }
    }

    public final boolean d(long j3) {
        int i7 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i10 = this.a;
        if (i7 < i10) {
            int a10 = a();
            if (a10 == 1 && i10 > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        com.google.android.gms.internal.clearcut.e eVar;
        int i7;
        while (true) {
            long j3 = n.get(this);
            a aVar = (a) this.h.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j10 = (2097152 + j3) & (-2097152);
                Object c10 = aVar.c();
                while (true) {
                    eVar = w;
                    if (c10 == eVar) {
                        i7 = -1;
                        break;
                    }
                    if (c10 == null) {
                        i7 = 0;
                        break;
                    }
                    a aVar2 = (a) c10;
                    i7 = aVar2.b();
                    if (i7 != 0) {
                        break;
                    }
                    c10 = aVar2.c();
                }
                if (i7 >= 0) {
                    if (n.compareAndSet(this, j3, i7 | j10)) {
                        aVar.h(eVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.r.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.h;
        int a10 = pVar.a();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < a10; i14++) {
            a aVar = (a) pVar.b(i14);
            if (aVar != null) {
                m mVar = aVar.a;
                mVar.getClass();
                int i15 = m.b.get(mVar) != null ? (m.c.get(mVar) - m.d.get(mVar)) + 1 : m.c.get(mVar) - m.d.get(mVar);
                int ordinal = aVar.c.ordinal();
                if (ordinal == 0) {
                    i7++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (ordinal == 2) {
                    i11++;
                } else if (ordinal == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new androidx.car.app.j();
                    }
                    i13++;
                }
            }
        }
        long j3 = r.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.d);
        sb5.append('@');
        sb5.append(b0.j(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.a;
        sb5.append(i16);
        sb5.append(", max = ");
        jg.g.x(sb5, this.b, "}, Worker States {CPU = ", i7, ", blocking = ");
        jg.g.x(sb5, i10, ", parked = ", i11, ", dormant = ");
        jg.g.x(sb5, i12, ", terminated = ", i13, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j3));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j3) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
