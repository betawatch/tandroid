// default package

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class e54 extends z44 implements vd3 {
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long r;
    public static final /* synthetic */ int s = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = fx.a;
        r = unsafe.objectFieldOffset(e54.class.getDeclaredField("_queue$volatile"));
        h = unsafe.objectFieldOffset(e54.class.getDeclaredField("_delayed$volatile"));
        n = unsafe.objectFieldOffset(e54.class.getDeclaredField("_isCompleted$volatile"));
    }

    public ep3 a(long j, nsb nsbVar, mx2 mx2Var) {
        return bb3.a.a(j, nsbVar, mx2Var);
    }

    @Override // vd3
    public final void b(long j, va1 va1Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a54 a54Var = new a54(this, j2 + nanoTime, va1Var);
            p(nanoTime, a54Var);
            va1Var.v(new qa1(a54Var, (byte) 2));
        }
    }

    @Override // px2
    public final void c(mx2 mx2Var, Runnable runnable) {
        j(runnable);
    }

    @Override // z44
    public final long h() {
        Unsafe unsafe;
        e54 e54Var;
        Unsafe unsafe2;
        Runnable runnable;
        c54 c54Var;
        ow5 ow5Var = sdd.b;
        long j = r;
        if (!i()) {
            k();
            loop0: while (true) {
                unsafe = fx.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile != null) {
                    if (!(objectVolatile instanceof xd6)) {
                        e54Var = this;
                        if (objectVolatile == ow5Var) {
                            break;
                        }
                        do {
                            unsafe2 = fx.a;
                            if (unsafe2.compareAndSwapObject(e54Var, r, objectVolatile, (Object) null)) {
                                runnable = (Runnable) objectVolatile;
                                unsafe = unsafe2;
                                break loop0;
                            }
                        } while (unsafe2.getObjectVolatile(e54Var, j) == objectVolatile);
                        this = e54Var;
                    } else {
                        xd6 xd6Var = (xd6) objectVolatile;
                        Object d = xd6Var.d();
                        if (d != xd6.e) {
                            Runnable runnable2 = (Runnable) d;
                            e54Var = this;
                            runnable = runnable2;
                            unsafe2 = unsafe;
                            break;
                        }
                        xd6 c = xd6Var.c();
                        while (true) {
                            Unsafe unsafe3 = fx.a;
                            e54Var = this;
                            if (!unsafe3.compareAndSwapObject(e54Var, r, objectVolatile, c) && unsafe3.getObjectVolatile(e54Var, j) == objectVolatile) {
                                this = e54Var;
                            }
                        }
                        this = e54Var;
                    }
                } else {
                    e54Var = this;
                    break;
                }
            }
            unsafe2 = unsafe;
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ls lsVar = e54Var.e;
            if (((lsVar == null || lsVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(e54Var, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof xd6) {
                        long longVolatile = unsafe2.getLongVolatile((xd6) objectVolatile2, xd6.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == ow5Var) {
                        return Long.MAX_VALUE;
                    }
                }
                d54 d54Var = (d54) unsafe.getObjectVolatile(e54Var, h);
                if (d54Var != null) {
                    synchronized (d54Var) {
                        c54[] c54VarArr = d54Var.a;
                        c54Var = c54VarArr != null ? c54VarArr[0] : null;
                    }
                    if (c54Var != null) {
                        long nanoTime = c54Var.a - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void j(Runnable runnable) {
        k();
        if (!l(runnable)) {
            ab3.w.j(runnable);
            return;
        }
        Thread m = m();
        if (Thread.currentThread() != m) {
            LockSupport.unpark(m);
        }
    }

    public final void k() {
        c54 c54Var;
        d54 d54Var = (d54) fx.a.getObjectVolatile(this, h);
        if (d54Var == null || d54Var.b() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (d54Var) {
                c54[] c54VarArr = d54Var.a;
                c54 c54Var2 = c54VarArr != null ? c54VarArr[0] : null;
                if (c54Var2 != null) {
                    c54Var = ((nanoTime - c54Var2.a) > 0L ? 1 : ((nanoTime - c54Var2.a) == 0L ? 0 : -1)) >= 0 ? l(c54Var2) : false ? d54Var.d(0) : null;
                }
            }
        } while (c54Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(Runnable runnable) {
        e54 e54Var;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        loop0: while (true) {
            Unsafe unsafe3 = fx.a;
            long j = r;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (unsafe3.getIntVolatile(this, n) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = fx.a;
                    e54 e54Var2 = this;
                    runnable2 = runnable;
                    e54Var = e54Var2;
                    if (unsafe4.compareAndSwapObject(e54Var2, r, (Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(e54Var, j) == null) {
                        this = e54Var;
                        runnable = runnable2;
                    }
                }
                this = e54Var;
                runnable = runnable2;
            } else {
                e54Var = this;
                runnable2 = runnable;
                if (objectVolatile instanceof xd6) {
                    xd6 xd6Var = (xd6) objectVolatile;
                    int a = xd6Var.a(runnable2);
                    if (a == 0) {
                        break;
                    }
                    if (a == 1) {
                        xd6 c = xd6Var.c();
                        do {
                            unsafe2 = fx.a;
                            if (!unsafe2.compareAndSwapObject(e54Var, r, objectVolatile, c)) {
                            }
                        } while (unsafe2.getObjectVolatile(e54Var, j) == objectVolatile);
                    } else if (a == 2) {
                        break;
                    }
                    this = e54Var;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == sdd.b) {
                        break;
                    }
                    xd6 xd6Var2 = new xd6(8, true);
                    xd6Var2.a((Runnable) objectVolatile);
                    xd6Var2.a(runnable2);
                    do {
                        unsafe = fx.a;
                        if (unsafe.compareAndSwapObject(e54Var, r, objectVolatile, xd6Var2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(e54Var, j) == objectVolatile);
                    this = e54Var;
                    runnable = runnable2;
                }
            }
        }
        return false;
    }

    public abstract Thread m();

    public final boolean n() {
        ls lsVar = this.e;
        if (lsVar != null ? lsVar.isEmpty() : true) {
            Unsafe unsafe = fx.a;
            d54 d54Var = (d54) unsafe.getObjectVolatile(this, h);
            if (d54Var != null && d54Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, r);
            if (objectVolatile != null) {
                if (objectVolatile instanceof xd6) {
                    long longVolatile = unsafe.getLongVolatile((xd6) objectVolatile, xd6.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == sdd.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void o(long j, c54 c54Var) {
        ab3.w.p(j, c54Var);
    }

    public final void p(long j, c54 c54Var) {
        e54 e54Var;
        int c;
        Unsafe unsafe;
        Thread m;
        long j2 = h;
        Unsafe unsafe2 = fx.a;
        if (unsafe2.getIntVolatile(this, n) != 0) {
            e54Var = this;
            c = 1;
        } else {
            d54 d54Var = (d54) unsafe2.getObjectVolatile(this, j2);
            if (d54Var == null) {
                d54 d54Var2 = new d54();
                d54Var2.c = j;
                while (true) {
                    unsafe = fx.a;
                    e54Var = this;
                    if (unsafe.compareAndSwapObject(e54Var, h, (Object) null, d54Var2) || unsafe.getObjectVolatile(e54Var, j2) != null) {
                        break;
                    } else {
                        this = e54Var;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(e54Var, j2);
                objectVolatile.getClass();
                d54Var = (d54) objectVolatile;
                unsafe2 = unsafe;
            } else {
                e54Var = this;
            }
            c = c54Var.c(j, d54Var, e54Var);
        }
        if (c != 0) {
            if (c == 1) {
                e54Var.o(j, c54Var);
                return;
            } else {
                if (c != 2) {
                    grb.i("unexpected result");
                    return;
                }
                return;
            }
        }
        d54 d54Var3 = (d54) unsafe2.getObjectVolatile(e54Var, j2);
        if (d54Var3 != null) {
            synchronized (d54Var3) {
                c54[] c54VarArr = d54Var3.a;
                r12 = c54VarArr != null ? c54VarArr[0] : null;
            }
        }
        if (r12 != c54Var || Thread.currentThread() == (m = e54Var.m())) {
            return;
        }
        LockSupport.unpark(m);
    }

    @Override // z44
    public void shutdown() {
        ow5 ow5Var;
        Unsafe unsafe;
        c54 d;
        crb.a.set(null);
        fx.a.putIntVolatile(this, n, 1);
        ow5 ow5Var2 = sdd.b;
        long j = r;
        loop0: while (true) {
            Object objectVolatile = fx.a.getObjectVolatile(this, j);
            if (objectVolatile != null) {
                ow5Var = ow5Var2;
                if (!(objectVolatile instanceof xd6)) {
                    if (objectVolatile == ow5Var) {
                        break;
                    }
                    xd6 xd6Var = new xd6(8, true);
                    xd6Var.a((Runnable) objectVolatile);
                    do {
                        unsafe = fx.a;
                        if (unsafe.compareAndSwapObject(this, r, objectVolatile, xd6Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                    ow5Var2 = ow5Var;
                } else {
                    ((xd6) objectVolatile).b();
                    break;
                }
            } else {
                while (true) {
                    Unsafe unsafe2 = fx.a;
                    ow5Var = ow5Var2;
                    if (unsafe2.compareAndSwapObject(this, r, (Object) null, ow5Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) == null) {
                        ow5Var2 = ow5Var;
                    }
                }
                ow5Var2 = ow5Var;
            }
        }
        while (h() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            d54 d54Var = (d54) fx.a.getObjectVolatile(this, h);
            if (d54Var == null) {
                return;
            }
            synchronized (d54Var) {
                d = d54Var.b() > 0 ? d54Var.d(0) : null;
            }
            if (d == null) {
                return;
            } else {
                o(nanoTime, d);
            }
        }
    }
}
