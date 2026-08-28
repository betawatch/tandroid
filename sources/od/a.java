package od;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.p;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public a(c cVar, int i9) {
        this.n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.a = new m();
        this.b = new p();
        this.c = b.d;
        this.nextParkedWorker = c.v;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        g(i9);
    }

    public final i a(boolean z10) {
        i f10;
        i f11;
        long j10;
        b bVar = this.c;
        b bVar2 = b.a;
        c cVar = this.n;
        i iVar = null;
        m mVar = this.a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.r;
            do {
                j10 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
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
                    int i9 = m.d.get(mVar);
                    int i10 = m.c.get(mVar);
                    while (true) {
                        if (i9 == i10 || m.e.get(mVar) == 0) {
                            break;
                        }
                        i10--;
                        i b10 = mVar.b(i10, true);
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
            } while (!c.r.compareAndSet(cVar, j10, j10 - 4398046511104L));
            this.c = b.a;
        }
        if (z10) {
            boolean z11 = e(cVar.a * 2) == 0;
            if (z11 && (f11 = f()) != null) {
                return f11;
            }
            mVar.getClass();
            i iVar4 = (i) m.b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.a();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z11 && (f10 = f()) != null) {
                return f10;
            }
        } else {
            i f12 = f();
            if (f12 != null) {
                return f12;
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

    public final int e(int i9) {
        int i10 = this.f;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f = i13;
        int i14 = i9 - 1;
        return (i14 & i9) == 0 ? i13 & i14 : (i13 & ConnectionsManager.DEFAULT_DATACENTER_ID) % i9;
    }

    public final i f() {
        int e10 = e(2);
        c cVar = this.n;
        if (e10 == 0) {
            i iVar = (i) cVar.e.d();
            return iVar != null ? iVar : (i) cVar.f.d();
        }
        i iVar2 = (i) cVar.f.d();
        return iVar2 != null ? iVar2 : (i) cVar.e.d();
    }

    public final void g(int i9) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.n.d);
        sb2.append("-worker-");
        sb2.append(i9 == 0 ? "TERMINATED" : String.valueOf(i9));
        setName(sb2.toString());
        this.indexInArray = i9;
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

    public final i j(int i9) {
        long j10;
        i iVar;
        long j11;
        long j12;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.r;
        c cVar = this.n;
        int i10 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i10 < 2) {
            return null;
        }
        int e10 = e(i10);
        int i11 = 0;
        long j13 = Long.MAX_VALUE;
        while (i11 < i10) {
            e10++;
            if (e10 > i10) {
                e10 = 1;
            }
            a aVar = (a) cVar.h.b(e10);
            if (aVar != null && aVar != this) {
                m mVar = aVar.a;
                if (i9 == 3) {
                    iVar = mVar.a();
                    j10 = 0;
                } else {
                    mVar.getClass();
                    int i12 = m.d.get(mVar);
                    int i13 = m.c.get(mVar);
                    boolean z10 = i9 == 1;
                    while (true) {
                        if (i12 == i13) {
                            j10 = 0;
                            break;
                        }
                        j10 = 0;
                        if (!z10 || m.e.get(mVar) != 0) {
                            int i14 = i12 + 1;
                            iVar = mVar.b(i12, z10);
                            if (iVar != null) {
                                break;
                            }
                            i12 = i14;
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
                    j12 = -1;
                    j11 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j11 = -1;
                            break;
                        }
                        j11 = -1;
                        if (((iVar4.b.a == 1 ? 1 : 2) & i9) == 0) {
                            break;
                        }
                        k.f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.a;
                        long j14 = k.b;
                        if (nanoTime < j14) {
                            j12 = j14 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                pVar.a = iVar4;
                                j12 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j12 = -2;
                    iVar2 = iVar3;
                }
                if (j12 == j11) {
                    i iVar5 = (i) pVar.a;
                    pVar.a = iVar2;
                    return iVar5;
                }
                if (j12 > j10) {
                    j13 = Math.min(j13, j12);
                }
            }
            i11++;
            iVar3 = null;
        }
        if (j13 == Long.MAX_VALUE) {
            j13 = 0;
        }
        this.e = j13;
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
        long j10;
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
                    int i9 = a2.b.a;
                    this.d = 0L;
                    if (this.c == b.c) {
                        this.c = b.b;
                    }
                    if (i9 != 0 && i(b.b) && !cVar.e() && !cVar.d(c.r.get(cVar))) {
                        cVar.e();
                    }
                    try {
                        a2.run();
                    } catch (Throwable th) {
                        Thread currentThread = Thread.currentThread();
                        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                    }
                    if (i9 != 0) {
                        c.r.addAndGet(cVar, -2097152L);
                        if (this.c != bVar2) {
                            this.c = b.d;
                        }
                    }
                } else {
                    this.h = false;
                    if (this.e == 0) {
                        Object obj = this.nextParkedWorker;
                        e5.c cVar2 = c.v;
                        if (obj != cVar2) {
                            r.set(this, -1);
                            while (this.nextParkedWorker != c.v) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    c cVar3 = this.n;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.s;
                                    if (atomicIntegerFieldUpdater2.get(cVar3) != 0) {
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
                                        j10 = 2097151;
                                        this.d = System.nanoTime() + this.n.c;
                                    } else {
                                        j10 = 2097151;
                                    }
                                    LockSupport.parkNanos(this.n.c);
                                    if (System.nanoTime() - this.d >= 0) {
                                        this.d = 0L;
                                        c cVar4 = this.n;
                                        synchronized (cVar4.h) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(cVar4) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.r;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar4) & j10)) > cVar4.a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i10 = this.indexInArray;
                                                            g(0);
                                                            cVar4.c(this, i10, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar4) & j10);
                                                            if (andDecrement != i10) {
                                                                Object b10 = cVar4.h.b(andDecrement);
                                                                kotlin.jvm.internal.i.b(b10);
                                                                a aVar = (a) b10;
                                                                cVar4.h.c(i10, aVar);
                                                                aVar.g(i10);
                                                                cVar4.c(aVar, andDecrement, i10);
                                                            }
                                                            cVar4.h.c(andDecrement, null);
                                                            this.c = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar5 = this.n;
                            if (this.nextParkedWorker == cVar2) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.n;
                                while (true) {
                                    long j11 = atomicLongFieldUpdater2.get(cVar5);
                                    int i11 = this.indexInArray;
                                    this.nextParkedWorker = cVar5.h.b((int) (j11 & 2097151));
                                    c cVar6 = cVar5;
                                    if (c.n.compareAndSet(cVar6, j11, ((j11 + 2097152) & (-2097152)) | i11)) {
                                        break;
                                    } else {
                                        cVar5 = cVar6;
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
