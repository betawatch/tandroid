package ld;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class v0 extends w0 implements j0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public o0 a(long j10, e2 e2Var, uc.h hVar) {
        return g0.a.a(j10, e2Var, hVar);
    }

    @Override // ld.j0
    public final void b(long j10, m mVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            r0 r0Var = new r0(this, j11 + nanoTime, mVar);
            o(nanoTime, r0Var);
            mVar.v(new j(r0Var, 2));
        }
    }

    @Override // ld.a0
    public final void c(uc.h hVar, Runnable runnable) {
        l(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cf, code lost:
    
        if ((((int) (1073741823 & r6)) == ((int) ((r6 & 1152921503533105152L) >> 30))) == false) goto L89;
     */
    @Override // ld.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i() {
        t0 b10;
        t0 d;
        if (!j()) {
            u0 u0Var = (u0) n.get(this);
            Runnable runnable = null;
            if (u0Var != null && qd.x.b.get(u0Var) != 0) {
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
                if (!(obj instanceof qd.n)) {
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
                qd.n nVar = (qd.n) obj;
                Object d10 = nVar.d();
                if (d10 != qd.n.g) {
                    runnable = (Runnable) d10;
                    break;
                }
                qd.n c3 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            tc.e eVar = this.e;
            if (((eVar == null || eVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = h.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof qd.n) {
                        long j10 = qd.n.f.get((qd.n) obj2);
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
                    if (!(obj instanceof qd.n)) {
                        if (obj != e0.c) {
                            qd.n nVar = new qd.n(8, true);
                            nVar.a((Runnable) obj);
                            nVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    qd.n nVar2 = (qd.n) obj;
                    int a2 = nVar2.a(runnable);
                    if (a2 == 0) {
                        break;
                    }
                    if (a2 == 1) {
                        qd.n c3 = nVar2.c();
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
    
        if ((qd.x.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        tc.e eVar = this.e;
        if (eVar != null ? eVar.isEmpty() : true) {
            u0 u0Var = (u0) n.get(this);
            if (u0Var != null) {
            }
            Object obj = h.get(this);
            if (obj != null) {
                if (obj instanceof qd.n) {
                    long j10 = qd.n.f.get((qd.n) obj);
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

    @Override // ld.w0
    public void shutdown() {
        t0 d;
        c2.a.set(null);
        r.set(this, 1);
        i5.c cVar = e0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof qd.n)) {
                    if (obj != cVar) {
                        qd.n nVar = new qd.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((qd.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
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
                d = qd.x.b.get(u0Var) > 0 ? u0Var.d(0) : null;
            }
            if (d == null) {
                return;
            } else {
                k(nanoTime, d);
            }
        }
    }
}
