package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class w0 extends x0 implements k0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // be.k0
    public final void a(long j10, m mVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            s0 s0Var = new s0(this, j11 + nanoTime, mVar);
            o(nanoTime, s0Var);
            mVar.v(new j(s0Var, 2));
        }
    }

    public p0 b(long j10, f2 f2Var, kd.h hVar) {
        return h0.a.b(j10, f2Var, hVar);
    }

    @Override // be.a0
    public final void c(kd.h hVar, Runnable runnable) {
        l(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cf, code lost:
    
        if ((((int) (1073741823 & r6)) == ((int) ((r6 & 1152921503533105152L) >> 30))) == false) goto L89;
     */
    @Override // be.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i() {
        u0 b10;
        u0 d;
        if (!j()) {
            v0 v0Var = (v0) n.get(this);
            Runnable runnable = null;
            if (v0Var != null && ge.x.b.get(v0Var) != 0) {
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
                if (!(obj instanceof ge.n)) {
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
                ge.n nVar = (ge.n) obj;
                Object d10 = nVar.d();
                if (d10 != ge.n.g) {
                    runnable = (Runnable) d10;
                    break;
                }
                ge.n c10 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            jd.e eVar = this.e;
            if (((eVar == null || eVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = h.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof ge.n) {
                        long j10 = ge.n.f.get((ge.n) obj2);
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
                    if (!(obj instanceof ge.n)) {
                        if (obj != f0.c) {
                            ge.n nVar = new ge.n(8, true);
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
                    ge.n nVar2 = (ge.n) obj;
                    int a2 = nVar2.a(runnable);
                    if (a2 == 0) {
                        break;
                    }
                    if (a2 == 1) {
                        ge.n c10 = nVar2.c();
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
    
        if ((ge.x.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        jd.e eVar = this.e;
        if (eVar != null ? eVar.isEmpty() : true) {
            v0 v0Var = (v0) n.get(this);
            if (v0Var != null) {
            }
            Object obj = h.get(this);
            if (obj != null) {
                if (obj instanceof ge.n) {
                    long j10 = ge.n.f.get((ge.n) obj);
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
        int i10 = r.get(this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        if (i10 != 0) {
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

    @Override // be.x0
    public void shutdown() {
        u0 d;
        d2.a.set(null);
        r.set(this, 1);
        com.google.android.gms.internal.clearcut.e eVar = f0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof ge.n)) {
                    if (obj != eVar) {
                        ge.n nVar = new ge.n(8, true);
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
                ((ge.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, eVar)) {
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
                d = ge.x.b.get(v0Var) > 0 ? v0Var.d(0) : null;
            }
            if (d == null) {
                return;
            } else {
                k(nanoTime, d);
            }
        }
    }
}
