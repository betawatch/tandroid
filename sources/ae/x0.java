package ae;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class x0 extends y0 implements l0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(x0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public q0 a(long j3, g2 g2Var, jd.h hVar) {
        return i0.a.a(j3, g2Var, hVar);
    }

    @Override // ae.l0
    public final void b(long j3, m mVar) {
        long j10 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j10 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            t0 t0Var = new t0(this, j10 + nanoTime, mVar);
            o(nanoTime, t0Var);
            mVar.v(new j(t0Var, 2));
        }
    }

    @Override // ae.b0
    public final void c(jd.h hVar, Runnable runnable) {
        l(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cf, code lost:
    
        if ((((int) (1073741823 & r6)) == ((int) ((r6 & 1152921503533105152L) >> 30))) == false) goto L89;
     */
    @Override // ae.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i() {
        v0 b10;
        v0 d;
        if (!j()) {
            w0 w0Var = (w0) n.get(this);
            Runnable runnable = null;
            if (w0Var != null && fe.x.b.get(w0Var) != 0) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (w0Var) {
                        try {
                            v0[] v0VarArr = w0Var.a;
                            v0 v0Var = v0VarArr != null ? v0VarArr[0] : null;
                            if (v0Var == null) {
                                d = null;
                            } else {
                                d = ((nanoTime - v0Var.a) > 0L ? 1 : ((nanoTime - v0Var.a) == 0L ? 0 : -1)) >= 0 ? m(v0Var) : false ? w0Var.d(0) : null;
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
                if (!(obj instanceof fe.n)) {
                    if (obj != g0.c) {
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
                fe.n nVar = (fe.n) obj;
                Object d10 = nVar.d();
                if (d10 != fe.n.g) {
                    runnable = (Runnable) d10;
                    break;
                }
                fe.n c10 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            id.e eVar = this.e;
            if (((eVar == null || eVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = h.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof fe.n) {
                        long j3 = fe.n.f.get((fe.n) obj2);
                    } else if (obj2 == g0.c) {
                        return Long.MAX_VALUE;
                    }
                }
                w0 w0Var2 = (w0) n.get(this);
                if (w0Var2 != null && (b10 = w0Var2.b()) != null) {
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
            h0.s.l(runnable);
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
                    if (!(obj instanceof fe.n)) {
                        if (obj != g0.c) {
                            fe.n nVar = new fe.n(8, true);
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
                    fe.n nVar2 = (fe.n) obj;
                    int a2 = nVar2.a(runnable);
                    if (a2 == 0) {
                        break;
                    }
                    if (a2 == 1) {
                        fe.n c10 = nVar2.c();
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
    
        if ((fe.x.b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        id.e eVar = this.e;
        if (eVar != null ? eVar.isEmpty() : true) {
            w0 w0Var = (w0) n.get(this);
            if (w0Var != null) {
            }
            Object obj = h.get(this);
            if (obj != null) {
                if (obj instanceof fe.n) {
                    long j3 = fe.n.f.get((fe.n) obj);
                    return ((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30));
                }
                if (obj == g0.c) {
                }
            }
            return true;
        }
        return false;
    }

    public final void o(long j3, v0 v0Var) {
        int c10;
        Thread g10;
        int i10 = r.get(this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        if (i10 != 0) {
            c10 = 1;
        } else {
            w0 w0Var = (w0) atomicReferenceFieldUpdater.get(this);
            if (w0Var == null) {
                w0 w0Var2 = new w0();
                w0Var2.c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, w0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.i.b(obj);
                w0Var = (w0) obj;
            }
            c10 = v0Var.c(j3, w0Var, this);
        }
        if (c10 != 0) {
            if (c10 == 1) {
                k(j3, v0Var);
                return;
            } else {
                if (c10 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        w0 w0Var3 = (w0) atomicReferenceFieldUpdater.get(this);
        if ((w0Var3 != null ? w0Var3.b() : null) != v0Var || Thread.currentThread() == (g10 = g())) {
            return;
        }
        LockSupport.unpark(g10);
    }

    @Override // ae.y0
    public void shutdown() {
        v0 d;
        e2.a.set(null);
        r.set(this, 1);
        da.a aVar = g0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof fe.n)) {
                    if (obj != aVar) {
                        fe.n nVar = new fe.n(8, true);
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
                ((fe.n) obj).b();
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
            w0 w0Var = (w0) n.get(this);
            if (w0Var == null) {
                return;
            }
            synchronized (w0Var) {
                d = fe.x.b.get(w0Var) > 0 ? w0Var.d(0) : null;
            }
            if (d == null) {
                return;
            } else {
                k(nanoTime, d);
            }
        }
    }
}
