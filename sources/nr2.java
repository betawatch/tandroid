// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class nr2 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = fx.a;
        a = unsafe.objectFieldOffset(nr2.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(nr2.class.getDeclaredField("_prev$volatile"));
    }

    public nr2(hz9 hz9Var) {
        this._prev$volatile = hz9Var;
    }

    public final void b() {
        fx.a.putObjectVolatile(this, b, (Object) null);
    }

    public final nr2 c() {
        Object objectVolatile = fx.a.getObjectVolatile(this, a);
        if (objectVolatile == td3.a) {
            return null;
        }
        return (nr2) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        nr2 nr2Var;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = fx.a;
            long j = b;
            nr2 nr2Var2 = (nr2) unsafe2.getObjectVolatile(this, j);
            while (nr2Var2 != null && nr2Var2.d()) {
                nr2Var2 = (nr2) fx.a.getObjectVolatile(nr2Var2, j);
            }
            nr2 c2 = c();
            c2.getClass();
            do {
                nr2Var = c2;
                if (!nr2Var.d()) {
                    break;
                } else {
                    c2 = nr2Var.c();
                }
            } while (c2 != null);
            while (true) {
                Object objectVolatile = fx.a.getObjectVolatile(nr2Var, j);
                nr2 nr2Var3 = ((nr2) objectVolatile) == null ? null : nr2Var2;
                do {
                    unsafe = fx.a;
                    if (unsafe.compareAndSwapObject(nr2Var, b, objectVolatile, nr2Var3)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(nr2Var, j) == objectVolatile);
            }
            if (nr2Var2 != null) {
                unsafe.putObjectVolatile(nr2Var2, a, nr2Var);
            }
            if (!nr2Var.d() || nr2Var.c() == null) {
                if (nr2Var2 == null || !nr2Var2.d()) {
                    return;
                }
            }
        }
    }
}
