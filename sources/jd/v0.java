package jd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class v0 extends w0 implements j0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public o0 a(long j10, e2 e2Var, sc.h hVar) {
        return g0.a.a(j10, e2Var, hVar);
    }

    @Override // jd.j0
    public final void b(long j10, m mVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            r0 r0Var = new r0(this, j11 + nanoTime, mVar);
            o(nanoTime, r0Var);
            mVar.v(new j(r0Var, 2));
        }
    }

    @Override // jd.a0
    public final void c(sc.h hVar, Runnable runnable) {
        l(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cf, code lost:
    
        if ((((int) (1073741823 & r6)) == ((int) ((r6 & 1152921503533105152L) >> 30))) == false) goto L89;
     */
    @Override // jd.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i() {
        t0 b10;
        t0 d;
        if (!j()) {
            u0 u0Var = (u0) n.get(this);
            Runnable runnable = null;
            if (u0Var != null && od.y.b.get(u0Var) != 0) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (u0Var) {
                        try {
                            t0[] t0VarArr = u0Var.a;
                            t0 t0Var = t0VarArr != null ? t0VarArr[0] : null;
                            if (t0Var == null) {
                                d = null;
                            } else {
                                d = ((nanoTime - t0Var.a) > 0L ? 1 : ((nanoTime - t0Var.a) == 0L ? 0 : -1)) >= 0 ? m(t0Var) : false ? u0Var.d(0) : null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } while (d != null);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            loop1: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof od.o)) {
                    if (obj != e0.c) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop1;
                    }
                    break;
                }
                od.o oVar = (od.o) obj;
                Object d10 = oVar.d();
                if (d10 != od.o.g) {
                    runnable = (Runnable) d10;
                    break;
                }
                od.o c3 = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            rc.e eVar = this.e;
            if (((eVar == null || eVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = h.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof od.o) {
                        long j10 = od.o.f.get((od.o) obj2);
                    } else if (obj2 == e0.c) {
                        return Long.MAX_VALUE;
                    }
                }
                u0 u0Var2 = (u0) n.get(this);
                if (u0Var2 != null && (b10 = u0Var2.b()) != null) {
                    long nanoTime2 = b10.a - System.nanoTime();
                    if (nanoTime2 >= 0) {
                        return nanoTime2;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void l(Runnable runnable) {
        if (!m(runnable)) {
            f0.s.l(runnable);
            return;
        }
        Thread g10 = g();
        if (Thread.currentThread() != g10) {
            LockSupport.unpark(g10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (r.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof od.o)) {
                        if (obj != e0.c) {
                            od.o oVar = new od.o(8, true);
                            oVar.a((Runnable) obj);
                            oVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    od.o oVar2 = (od.o) obj;
                    int a2 = oVar2.a(runnable);
                    if (a2 == 0) {
                        break;
                    }
                    if (a2 == 1) {
                        od.o c3 = oVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a2 == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((od.y.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        rc.e eVar = this.e;
        if (eVar != null ? eVar.isEmpty() : true) {
            u0 u0Var = (u0) n.get(this);
            if (u0Var != null) {
            }
            Object obj = h.get(this);
            if (obj != null) {
                if (obj instanceof od.o) {
                    long j10 = od.o.f.get((od.o) obj);
                    return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
                }
                if (obj == e0.c) {
                }
            }
            return true;
        }
        return false;
    }

    public final void o(long j10, t0 t0Var) {
        int c3;
        Thread g10;
        int i10 = r.get(this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        if (i10 != 0) {
            c3 = 1;
        } else {
            u0 u0Var = (u0) atomicReferenceFieldUpdater.get(this);
            if (u0Var == null) {
                u0 u0Var2 = new u0();
                u0Var2.c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, u0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.j.b(obj);
                u0Var = (u0) obj;
            }
            c3 = t0Var.c(j10, u0Var, this);
        }
        if (c3 != 0) {
            if (c3 == 1) {
                k(j10, t0Var);
                return;
            } else {
                if (c3 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        u0 u0Var3 = (u0) atomicReferenceFieldUpdater.get(this);
        if ((u0Var3 != null ? u0Var3.b() : null) != t0Var || Thread.currentThread() == (g10 = g())) {
            return;
        }
        LockSupport.unpark(g10);
    }

    @Override // jd.w0
    public void shutdown() {
        t0 d;
        c2.a.set(null);
        r.set(this, 1);
        fc.a aVar = e0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof od.o)) {
                    if (obj != aVar) {
                        od.o oVar = new od.o(8, true);
                        oVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((od.o) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (i() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            u0 u0Var = (u0) n.get(this);
            if (u0Var == null) {
                return;
            }
            synchronized (u0Var) {
                d = od.y.b.get(u0Var) > 0 ? u0Var.d(0) : null;
            }
            if (d == null) {
                return;
            } else {
                k(nanoTime, d);
            }
        }
    }
}
