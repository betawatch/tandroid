package l9;

import b8.xd;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends xd {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new l());
        }
        try {
            c = unsafe.objectFieldOffset(o.class.getDeclaredField("c"));
            b = unsafe.objectFieldOffset(o.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(o.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(n.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(n.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // b8.xd
    public final boolean a(o oVar, c cVar, c cVar2) {
        return j.a(a, oVar, b, cVar, cVar2);
    }

    @Override // b8.xd
    public final boolean b(o oVar, Object obj, Object obj2) {
        return k.a(a, oVar, d, obj, obj2);
    }

    @Override // b8.xd
    public final boolean c(o oVar, n nVar, n nVar2) {
        return i.a(a, oVar, c, nVar, nVar2);
    }

    @Override // b8.xd
    public final c d(o oVar) {
        c cVar;
        c cVar2 = c.d;
        do {
            cVar = oVar.b;
            if (cVar2 == cVar) {
                break;
            }
        } while (!a(oVar, cVar, cVar2));
        return cVar;
    }

    @Override // b8.xd
    public final n e(o oVar) {
        n nVar;
        n nVar2 = n.c;
        do {
            nVar = oVar.c;
            if (nVar2 == nVar) {
                break;
            }
        } while (!c(oVar, nVar, nVar2));
        return nVar;
    }

    @Override // b8.xd
    public final void f(n nVar, n nVar2) {
        a.putObject(nVar, f, nVar2);
    }

    @Override // b8.xd
    public final void g(n nVar, Thread thread) {
        a.putObject(nVar, e, thread);
    }
}
