// default package

import java.util.ArrayList;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lv5 implements hp5 {
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final qm7 a;

    static {
        Unsafe unsafe = fx.a;
        c = unsafe.objectFieldOffset(lv5.class.getDeclaredField("_isCompleting$volatile"));
        d = unsafe.objectFieldOffset(lv5.class.getDeclaredField("_rootCause$volatile"));
        b = unsafe.objectFieldOffset(lv5.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public lv5(qm7 qm7Var, Throwable th) {
        this.a = qm7Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            fx.a.putObjectVolatile(this, d, th);
            return;
        }
        if (th != c2) {
            Unsafe unsafe = fx.a;
            long j = b;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, th);
                return;
            }
            if (!(objectVolatile instanceof Throwable)) {
                if (objectVolatile instanceof ArrayList) {
                    ((ArrayList) objectVolatile).add(th);
                    return;
                } else {
                    lq5.i(objectVolatile, "State is ");
                    return;
                }
            }
            if (th == objectVolatile) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(objectVolatile);
            arrayList.add(th);
            unsafe.putObjectVolatile(this, j, arrayList);
        }
    }

    @Override // hp5
    public final qm7 b() {
        return this.a;
    }

    public final Throwable c() {
        return (Throwable) fx.a.getObjectVolatile(this, d);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return fx.a.getIntVolatile(this, c) != 0;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = fx.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                lq5.i(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable c2 = c();
        if (c2 != null) {
            arrayList.add(0, c2);
        }
        if (th != null && !th.equals(c2)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, yed.e);
        return arrayList;
    }

    @Override // hp5
    public final boolean isActive() {
        return c() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + fx.a.getObjectVolatile(this, b) + ", list=" + this.a + ']';
    }
}
