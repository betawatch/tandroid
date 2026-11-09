package m9;

import c8.r9;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class m extends r9 {
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

    @Override // c8.r9
    public final boolean a(o oVar, c cVar, c cVar2) {
        return j.a(a, oVar, b, cVar, cVar2);
    }

    @Override // c8.r9
    public final boolean b(o oVar, Object obj, Object obj2) {
        return k.a(a, oVar, d, obj, obj2);
    }

    @Override // c8.r9
    public final boolean c(o oVar, n nVar, n nVar2) {
        return i.a(a, oVar, c, nVar, nVar2);
    }

    @Override // c8.r9
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

    @Override // c8.r9
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

    @Override // c8.r9
    public final void f(n nVar, n nVar2) {
        a.putObject(nVar, f, nVar2);
    }

    @Override // c8.r9
    public final void g(n nVar, Thread thread) {
        a.putObject(nVar, e, thread);
    }
}
