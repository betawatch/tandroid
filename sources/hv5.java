// default package

import java.util.ArrayList;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hv5 implements ep5 {
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final ul7 a;

    static {
        Unsafe unsafe = fy.a;
        c = unsafe.objectFieldOffset(hv5.class.getDeclaredField("_isCompleting$volatile"));
        d = unsafe.objectFieldOffset(hv5.class.getDeclaredField("_rootCause$volatile"));
        b = unsafe.objectFieldOffset(hv5.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public hv5(ul7 ul7Var, Throwable th) {
        this.a = ul7Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            fy.a.putObjectVolatile(this, d, th);
            return;
        }
        if (th != c2) {
            Unsafe unsafe = fy.a;
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
                    zo4.p(objectVolatile, "State is ");
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

    @Override // ep5
    public final ul7 b() {
        return this.a;
    }

    public final Throwable c() {
        return (Throwable) fy.a.getObjectVolatile(this, d);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return fy.a.getIntVolatile(this, c) != 0;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = fy.a;
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
                zo4.p(objectVolatile, "State is ");
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
        unsafe.putObjectVolatile(this, j, hcd.e);
        return arrayList;
    }

    @Override // ep5
    public final boolean isActive() {
        return c() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + fy.a.getObjectVolatile(this, b) + ", list=" + this.a + ']';
    }
}
