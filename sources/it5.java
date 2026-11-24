// default package

import java.util.ArrayList;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class it5 implements en5 {
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final rj7 a;

    static {
        Unsafe unsafe = ex.a;
        c = unsafe.objectFieldOffset(it5.class.getDeclaredField("_isCompleting$volatile"));
        d = unsafe.objectFieldOffset(it5.class.getDeclaredField("_rootCause$volatile"));
        b = unsafe.objectFieldOffset(it5.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public it5(rj7 rj7Var, Throwable th) {
        this.a = rj7Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            ex.a.putObjectVolatile(this, d, th);
            return;
        }
        if (th != c2) {
            Unsafe unsafe = ex.a;
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
                    wn4.n(objectVolatile, "State is ");
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

    @Override // en5
    public final rj7 b() {
        return this.a;
    }

    public final Throwable c() {
        return (Throwable) ex.a.getObjectVolatile(this, d);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return ex.a.getIntVolatile(this, c) != 0;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = ex.a;
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
                wn4.n(objectVolatile, "State is ");
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
        unsafe.putObjectVolatile(this, j, fad.e);
        return arrayList;
    }

    @Override // en5
    public final boolean isActive() {
        return c() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + ex.a.getObjectVolatile(this, b) + ", list=" + this.a + ']';
    }
}
