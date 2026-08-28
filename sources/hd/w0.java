package hd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class w0 extends x0 implements k0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public p0 a(long j10, f2 f2Var, qc.h hVar) {
        return h0.a.a(j10, f2Var, hVar);
    }

    @Override // hd.k0
    public final void b(long j10, m mVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            s0 s0Var = new s0(this, j11 + nanoTime, mVar);
            o(nanoTime, s0Var);
            mVar.v(new j(s0Var, 2));
        }
    }

    @Override // hd.a0
    public final void c(qc.h hVar, Runnable runnable) {
        l(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cf, code lost:
    
        if ((((int) (1073741823 & r6)) == ((int) ((r6 & 1152921503533105152L) >> 30))) == false) goto L89;
     */
    @Override // hd.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i() {
        u0 b10;
        u0 d;
        if (!j()) {
            v0 v0Var = (v0) n.get(this);
            Runnable runnable = null;
            if (v0Var != null && md.x.b.get(v0Var) != 0) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (v0Var) {
                        try {
                            u0[] u0VarArr = v0Var.a;
                            u0 u0Var = u0VarArr != null ? u0VarArr[0] : null;
                            if (u0Var == null) {
                                d = null;
                            } else {
                                d = ((nanoTime - u0Var.a) > 0L ? 1 : ((nanoTime - u0Var.a) == 0L ? 0 : -1)) >= 0 ? m(u0Var) : false ? v0Var.d(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
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
                if (!(obj instanceof md.n)) {
                    if (obj != f0.c) {
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
                md.n nVar = (md.n) obj;
                Object d9 = nVar.d();
                if (d9 != md.n.g) {
                    runnable = (Runnable) d9;
                    break;
                }
                md.n c10 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            pc.e eVar = this.e;
            if (((eVar == null || eVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = h.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof md.n) {
                        long j10 = md.n.f.get((md.n) obj2);
                    } else if (obj2 == f0.c) {
                        return Long.MAX_VALUE;
                    }
                }
                v0 v0Var2 = (v0) n.get(this);
                if (v0Var2 != null && (b10 = v0Var2.b()) != null) {
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
            g0.s.l(runnable);
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
                    if (!(obj instanceof md.n)) {
                        if (obj != f0.c) {
                            md.n nVar = new md.n(8, true);
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
                    md.n nVar2 = (md.n) obj;
                    int a2 = nVar2.a(runnable);
                    if (a2 == 0) {
                        break;
                    }
                    if (a2 == 1) {
                        md.n c10 = nVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
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
    
        if ((md.x.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        pc.e eVar = this.e;
        if (eVar != null ? eVar.isEmpty() : true) {
            v0 v0Var = (v0) n.get(this);
            if (v0Var != null) {
            }
            Object obj = h.get(this);
            if (obj != null) {
                if (obj instanceof md.n) {
                    long j10 = md.n.f.get((md.n) obj);
                    return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
                }
                if (obj == f0.c) {
                }
            }
            return true;
        }
        return false;
    }

    public final void o(long j10, u0 u0Var) {
        int c10;
        Thread g10;
        int i9 = r.get(this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        if (i9 != 0) {
            c10 = 1;
        } else {
            v0 v0Var = (v0) atomicReferenceFieldUpdater.get(this);
            if (v0Var == null) {
                v0 v0Var2 = new v0();
                v0Var2.c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, v0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.i.b(obj);
                v0Var = (v0) obj;
            }
            c10 = u0Var.c(j10, v0Var, this);
        }
        if (c10 != 0) {
            if (c10 == 1) {
                k(j10, u0Var);
                return;
            } else {
                if (c10 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        v0 v0Var3 = (v0) atomicReferenceFieldUpdater.get(this);
        if ((v0Var3 != null ? v0Var3.b() : null) != u0Var || Thread.currentThread() == (g10 = g())) {
            return;
        }
        LockSupport.unpark(g10);
    }

    @Override // hd.x0
    public void shutdown() {
        u0 d;
        d2.a.set(null);
        r.set(this, 1);
        e5.c cVar = f0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof md.n)) {
                    if (obj != cVar) {
                        md.n nVar = new md.n(8, true);
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
                ((md.n) obj).b();
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
            v0 v0Var = (v0) n.get(this);
            if (v0Var == null) {
                return;
            }
            synchronized (v0Var) {
                d = md.x.b.get(v0Var) > 0 ? v0Var.d(0) : null;
            }
            if (d == null) {
                return;
            } else {
                k(nanoTime, d);
            }
        }
    }
}
