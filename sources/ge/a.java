package ge;

import ee.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.p;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final m a;
    public final p b;
    public b c;
    public long d;
    public long e;
    public int f;
    public boolean h;
    private volatile int indexInArray;
    public final /* synthetic */ c n;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i10) {
        this.n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.a = new m();
        this.b = new p();
        this.c = b.d;
        this.nextParkedWorker = c.v;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        g(i10);
    }

    public final i a(boolean z10) {
        i f7;
        i f10;
        long j3;
        b bVar = this.c;
        b bVar2 = b.a;
        c cVar = this.n;
        i iVar = null;
        m mVar = this.a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.r;
            do {
                j3 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.b.a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i10 = m.d.get(mVar);
                    int i11 = m.c.get(mVar);
                    while (true) {
                        if (i10 == i11 || m.e.get(mVar) == 0) {
                            break;
                        }
                        i11--;
                        i b10 = mVar.b(i11, true);
                        if (b10 != null) {
                            iVar = b10;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f.d();
                    return iVar3 == null ? j(1) : iVar3;
                }
            } while (!c.r.compareAndSet(cVar, j3, j3 - 4398046511104L));
            this.c = b.a;
        }
        if (z10) {
            boolean z11 = e(cVar.a * 2) == 0;
            if (z11 && (f10 = f()) != null) {
                return f10;
            }
            mVar.getClass();
            i iVar4 = (i) m.b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.a();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z11 && (f7 = f()) != null) {
                return f7;
            }
        } else {
            i f11 = f();
            if (f11 != null) {
                return f11;
            }
        }
        return j(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int e(int i10) {
        int i11 = this.f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & ConnectionsManager.DEFAULT_DATACENTER_ID) % i10;
    }

    public final i f() {
        int e = e(2);
        c cVar = this.n;
        if (e == 0) {
            i iVar = (i) cVar.e.d();
            return iVar != null ? iVar : (i) cVar.f.d();
        }
        i iVar2 = (i) cVar.f.d();
        return iVar2 != null ? iVar2 : (i) cVar.e.d();
    }

    public final void g(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.n.d);
        sb2.append("-worker-");
        sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb2.toString());
        this.indexInArray = i10;
    }

    public final void h(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean i(b bVar) {
        b bVar2 = this.c;
        boolean z10 = bVar2 == b.a;
        if (z10) {
            c.r.addAndGet(this.n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.c = bVar;
        }
        return z10;
    }

    public final i j(int i10) {
        long j3;
        i iVar;
        long j10;
        long j11;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.r;
        c cVar = this.n;
        int i11 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i11 < 2) {
            return null;
        }
        int e = e(i11);
        int i12 = 0;
        long j12 = Long.MAX_VALUE;
        while (i12 < i11) {
            e++;
            if (e > i11) {
                e = 1;
            }
            a aVar = (a) cVar.h.b(e);
            if (aVar != null && aVar != this) {
                m mVar = aVar.a;
                if (i10 == 3) {
                    iVar = mVar.a();
                    j3 = 0;
                } else {
                    mVar.getClass();
                    int i13 = m.d.get(mVar);
                    int i14 = m.c.get(mVar);
                    boolean z10 = i10 == 1;
                    while (true) {
                        if (i13 == i14) {
                            j3 = 0;
                            break;
                        }
                        j3 = 0;
                        if (!z10 || m.e.get(mVar) != 0) {
                            int i15 = i13 + 1;
                            iVar = mVar.b(i13, z10);
                            if (iVar != null) {
                                break;
                            }
                            i13 = i15;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                p pVar = this.b;
                if (iVar != null) {
                    pVar.a = iVar;
                    iVar2 = iVar3;
                    j11 = -1;
                    j10 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j10 = -1;
                            break;
                        }
                        j10 = -1;
                        if (((iVar4.b.a == 1 ? 1 : 2) & i10) == 0) {
                            break;
                        }
                        k.f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.a;
                        long j13 = k.b;
                        if (nanoTime < j13) {
                            j11 = j13 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                pVar.a = iVar4;
                                j11 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j11 = -2;
                    iVar2 = iVar3;
                }
                if (j11 == j10) {
                    i iVar5 = (i) pVar.a;
                    pVar.a = iVar2;
                    return iVar5;
                }
                if (j11 > j3) {
                    j12 = Math.min(j12, j11);
                }
            }
            i12++;
            iVar3 = null;
        }
        if (j12 == Long.MAX_VALUE) {
            j12 = 0;
        }
        this.e = j12;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j3;
        loop0: while (true) {
            boolean z10 = false;
            while (c.s.get(this.n) == 0) {
                b bVar = this.c;
                b bVar2 = b.e;
                if (bVar == bVar2) {
                    break loop0;
                }
                i a2 = a(this.h);
                if (a2 != null) {
                    this.e = 0L;
                    c cVar = this.n;
                    int i10 = a2.b.a;
                    this.d = 0L;
                    if (this.c == b.c) {
                        this.c = b.b;
                    }
                    if (i10 != 0 && i(b.b) && !cVar.e() && !cVar.d(c.r.get(cVar))) {
                        cVar.e();
                    }
                    try {
                        a2.run();
                    } catch (Throwable th2) {
                        Thread currentThread = Thread.currentThread();
                        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                    }
                    if (i10 != 0) {
                        c.r.addAndGet(cVar, -2097152L);
                        if (this.c != bVar2) {
                            this.c = b.d;
                        }
                    }
                } else {
                    this.h = false;
                    if (this.e == 0) {
                        Object obj = this.nextParkedWorker;
                        v vVar = c.v;
                        if (obj != vVar) {
                            r.set(this, -1);
                            while (this.nextParkedWorker != c.v) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    c cVar2 = this.n;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.s;
                                    if (atomicIntegerFieldUpdater2.get(cVar2) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.c;
                                    b bVar4 = b.e;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    i(b.c);
                                    Thread.interrupted();
                                    if (this.d == 0) {
                                        j3 = 2097151;
                                        this.d = System.nanoTime() + this.n.c;
                                    } else {
                                        j3 = 2097151;
                                    }
                                    LockSupport.parkNanos(this.n.c);
                                    if (System.nanoTime() - this.d >= 0) {
                                        this.d = 0L;
                                        c cVar3 = this.n;
                                        synchronized (cVar3.h) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(cVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.r;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar3) & j3)) > cVar3.a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i11 = this.indexInArray;
                                                            g(0);
                                                            cVar3.c(this, i11, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j3);
                                                            if (andDecrement != i11) {
                                                                Object b10 = cVar3.h.b(andDecrement);
                                                                kotlin.jvm.internal.i.b(b10);
                                                                a aVar = (a) b10;
                                                                cVar3.h.c(i11, aVar);
                                                                aVar.g(i11);
                                                                cVar3.c(aVar, andDecrement, i11);
                                                            }
                                                            cVar3.h.c(andDecrement, null);
                                                            this.c = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.n;
                            if (this.nextParkedWorker == vVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.n;
                                while (true) {
                                    long j10 = atomicLongFieldUpdater2.get(cVar4);
                                    int i12 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.h.b((int) (j10 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.n.compareAndSet(cVar5, j10, ((j10 + 2097152) & (-2097152)) | i12)) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else if (z10) {
                        i(b.c);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.e);
                        this.e = 0L;
                    } else {
                        z10 = true;
                    }
                }
            }
            break loop0;
        }
        i(b.e);
    }
}
