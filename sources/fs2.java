// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class fs2 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = fy.a;
        a = unsafe.objectFieldOffset(fs2.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(fs2.class.getDeclaredField("_prev$volatile"));
    }

    public fs2(qx9 qx9Var) {
        this._prev$volatile = qx9Var;
    }

    public final void b() {
        fy.a.putObjectVolatile(this, b, (Object) null);
    }

    public final fs2 c() {
        Object objectVolatile = fy.a.getObjectVolatile(this, a);
        if (objectVolatile == ne3.a) {
            return null;
        }
        return (fs2) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        fs2 fs2Var;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = fy.a;
            long j = b;
            fs2 fs2Var2 = (fs2) unsafe2.getObjectVolatile(this, j);
            while (fs2Var2 != null && fs2Var2.d()) {
                fs2Var2 = (fs2) fy.a.getObjectVolatile(fs2Var2, j);
            }
            fs2 c2 = c();
            c2.getClass();
            do {
                fs2Var = c2;
                if (!fs2Var.d()) {
                    break;
                } else {
                    c2 = fs2Var.c();
                }
            } while (c2 != null);
            while (true) {
                Object objectVolatile = fy.a.getObjectVolatile(fs2Var, j);
                fs2 fs2Var3 = ((fs2) objectVolatile) == null ? null : fs2Var2;
                do {
                    unsafe = fy.a;
                    if (unsafe.compareAndSwapObject(fs2Var, b, objectVolatile, fs2Var3)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(fs2Var, j) == objectVolatile);
            }
            if (fs2Var2 != null) {
                unsafe.putObjectVolatile(fs2Var2, a, fs2Var);
            }
            if (!fs2Var.d() || fs2Var.c() == null) {
                if (fs2Var2 == null || !fs2Var2.d()) {
                    return;
                }
            }
        }
    }
}
