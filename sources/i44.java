// default package

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class i44 extends d44 implements dd3 {
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long r;
    public static final /* synthetic */ int s = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = ex.a;
        r = unsafe.objectFieldOffset(i44.class.getDeclaredField("_queue$volatile"));
        h = unsafe.objectFieldOffset(i44.class.getDeclaredField("_delayed$volatile"));
        n = unsafe.objectFieldOffset(i44.class.getDeclaredField("_isCompleted$volatile"));
    }

    public no3 a(long j, nob nobVar, sw2 sw2Var) {
        return ia3.a.a(j, nobVar, sw2Var);
    }

    @Override // dd3
    public final void b(long j, na1 na1Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            e44 e44Var = new e44(this, j2 + nanoTime, na1Var);
            p(nanoTime, e44Var);
            na1Var.v(new ia1(e44Var, (byte) 2));
        }
    }

    @Override // vw2
    public final void c(sw2 sw2Var, Runnable runnable) {
        j(runnable);
    }

    @Override // d44
    public final long h() {
        Unsafe unsafe;
        i44 i44Var;
        Unsafe unsafe2;
        Runnable runnable;
        g44 g44Var;
        lo5 lo5Var = z8d.b;
        long j = r;
        if (!i()) {
            k();
            loop0: while (true) {
                unsafe = ex.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile != null) {
                    if (!(objectVolatile instanceof tb6)) {
                        i44Var = this;
                        if (objectVolatile == lo5Var) {
                            break;
                        }
                        do {
                            unsafe2 = ex.a;
                            if (unsafe2.compareAndSwapObject(i44Var, r, objectVolatile, (Object) null)) {
                                runnable = (Runnable) objectVolatile;
                                unsafe = unsafe2;
                                break loop0;
                            }
                        } while (unsafe2.getObjectVolatile(i44Var, j) == objectVolatile);
                        this = i44Var;
                    } else {
                        tb6 tb6Var = (tb6) objectVolatile;
                        Object d = tb6Var.d();
                        if (d != tb6.e) {
                            Runnable runnable2 = (Runnable) d;
                            i44Var = this;
                            runnable = runnable2;
                            unsafe2 = unsafe;
                            break;
                        }
                        tb6 c = tb6Var.c();
                        while (true) {
                            Unsafe unsafe3 = ex.a;
                            i44Var = this;
                            if (!unsafe3.compareAndSwapObject(i44Var, r, objectVolatile, c) && unsafe3.getObjectVolatile(i44Var, j) == objectVolatile) {
                                this = i44Var;
                            }
                        }
                        this = i44Var;
                    }
                } else {
                    i44Var = this;
                    break;
                }
            }
            unsafe2 = unsafe;
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ks ksVar = i44Var.e;
            if (((ksVar == null || ksVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(i44Var, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof tb6) {
                        long longVolatile = unsafe2.getLongVolatile((tb6) objectVolatile2, tb6.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == lo5Var) {
                        return Long.MAX_VALUE;
                    }
                }
                h44 h44Var = (h44) unsafe.getObjectVolatile(i44Var, h);
                if (h44Var != null) {
                    synchronized (h44Var) {
                        g44[] g44VarArr = h44Var.a;
                        g44Var = g44VarArr != null ? g44VarArr[0] : null;
                    }
                    if (g44Var != null) {
                        long nanoTime = g44Var.a - System.nanoTime();
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
            ha3.w.j(runnable);
            return;
        }
        Thread m = m();
        if (Thread.currentThread() != m) {
            LockSupport.unpark(m);
        }
    }

    public final void k() {
        g44 g44Var;
        h44 h44Var = (h44) ex.a.getObjectVolatile(this, h);
        if (h44Var == null || h44Var.b() == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (h44Var) {
                g44[] g44VarArr = h44Var.a;
                g44 g44Var2 = g44VarArr != null ? g44VarArr[0] : null;
                if (g44Var2 != null) {
                    g44Var = ((nanoTime - g44Var2.a) > 0L ? 1 : ((nanoTime - g44Var2.a) == 0L ? 0 : -1)) >= 0 ? l(g44Var2) : false ? h44Var.d(0) : null;
                }
            }
        } while (g44Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(Runnable runnable) {
        i44 i44Var;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        loop0: while (true) {
            Unsafe unsafe3 = ex.a;
            long j = r;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (unsafe3.getIntVolatile(this, n) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = ex.a;
                    i44 i44Var2 = this;
                    runnable2 = runnable;
                    i44Var = i44Var2;
                    if (unsafe4.compareAndSwapObject(i44Var2, r, (Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(i44Var, j) == null) {
                        this = i44Var;
                        runnable = runnable2;
                    }
                }
                this = i44Var;
                runnable = runnable2;
            } else {
                i44Var = this;
                runnable2 = runnable;
                if (objectVolatile instanceof tb6) {
                    tb6 tb6Var = (tb6) objectVolatile;
                    int a = tb6Var.a(runnable2);
                    if (a == 0) {
                        break;
                    }
                    if (a == 1) {
                        tb6 c = tb6Var.c();
                        do {
                            unsafe2 = ex.a;
                            if (!unsafe2.compareAndSwapObject(i44Var, r, objectVolatile, c)) {
                            }
                        } while (unsafe2.getObjectVolatile(i44Var, j) == objectVolatile);
                    } else if (a == 2) {
                        break;
                    }
                    this = i44Var;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == z8d.b) {
                        break;
                    }
                    tb6 tb6Var2 = new tb6(8, true);
                    tb6Var2.a((Runnable) objectVolatile);
                    tb6Var2.a(runnable2);
                    do {
                        unsafe = ex.a;
                        if (unsafe.compareAndSwapObject(i44Var, r, objectVolatile, tb6Var2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(i44Var, j) == objectVolatile);
                    this = i44Var;
                    runnable = runnable2;
                }
            }
        }
        return false;
    }

    public abstract Thread m();

    public final boolean n() {
        ks ksVar = this.e;
        if (ksVar != null ? ksVar.isEmpty() : true) {
            Unsafe unsafe = ex.a;
            h44 h44Var = (h44) unsafe.getObjectVolatile(this, h);
            if (h44Var != null && h44Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, r);
            if (objectVolatile != null) {
                if (objectVolatile instanceof tb6) {
                    long longVolatile = unsafe.getLongVolatile((tb6) objectVolatile, tb6.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == z8d.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void o(long j, g44 g44Var) {
        ha3.w.p(j, g44Var);
    }

    public final void p(long j, g44 g44Var) {
        i44 i44Var;
        int c;
        Unsafe unsafe;
        Thread m;
        long j2 = h;
        Unsafe unsafe2 = ex.a;
        if (unsafe2.getIntVolatile(this, n) != 0) {
            i44Var = this;
            c = 1;
        } else {
            h44 h44Var = (h44) unsafe2.getObjectVolatile(this, j2);
            if (h44Var == null) {
                h44 h44Var2 = new h44();
                h44Var2.c = j;
                while (true) {
                    unsafe = ex.a;
                    i44Var = this;
                    if (unsafe.compareAndSwapObject(i44Var, h, (Object) null, h44Var2) || unsafe.getObjectVolatile(i44Var, j2) != null) {
                        break;
                    } else {
                        this = i44Var;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(i44Var, j2);
                objectVolatile.getClass();
                h44Var = (h44) objectVolatile;
                unsafe2 = unsafe;
            } else {
                i44Var = this;
            }
            c = g44Var.c(j, h44Var, i44Var);
        }
        if (c != 0) {
            if (c == 1) {
                i44Var.o(j, g44Var);
                return;
            } else {
                if (c != 2) {
                    sc8.j("unexpected result");
                    return;
                }
                return;
            }
        }
        h44 h44Var3 = (h44) unsafe2.getObjectVolatile(i44Var, j2);
        if (h44Var3 != null) {
            synchronized (h44Var3) {
                g44[] g44VarArr = h44Var3.a;
                r12 = g44VarArr != null ? g44VarArr[0] : null;
            }
        }
        if (r12 != g44Var || Thread.currentThread() == (m = i44Var.m())) {
            return;
        }
        LockSupport.unpark(m);
    }

    @Override // d44
    public void shutdown() {
        lo5 lo5Var;
        Unsafe unsafe;
        g44 d;
        dnb.a.set(null);
        ex.a.putIntVolatile(this, n, 1);
        lo5 lo5Var2 = z8d.b;
        long j = r;
        loop0: while (true) {
            Object objectVolatile = ex.a.getObjectVolatile(this, j);
            if (objectVolatile != null) {
                lo5Var = lo5Var2;
                if (!(objectVolatile instanceof tb6)) {
                    if (objectVolatile == lo5Var) {
                        break;
                    }
                    tb6 tb6Var = new tb6(8, true);
                    tb6Var.a((Runnable) objectVolatile);
                    do {
                        unsafe = ex.a;
                        if (unsafe.compareAndSwapObject(this, r, objectVolatile, tb6Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                    lo5Var2 = lo5Var;
                } else {
                    ((tb6) objectVolatile).b();
                    break;
                }
            } else {
                while (true) {
                    Unsafe unsafe2 = ex.a;
                    lo5Var = lo5Var2;
                    if (unsafe2.compareAndSwapObject(this, r, (Object) null, lo5Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) == null) {
                        lo5Var2 = lo5Var;
                    }
                }
                lo5Var2 = lo5Var;
            }
        }
        while (h() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            h44 h44Var = (h44) ex.a.getObjectVolatile(this, h);
            if (h44Var == null) {
                return;
            }
            synchronized (h44Var) {
                d = h44Var.b() > 0 ? h44Var.d(0) : null;
            }
            if (d == null) {
                return;
            } else {
                o(nanoTime, d);
            }
        }
    }
}
