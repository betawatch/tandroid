package i9;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;
import v7.k8;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class m extends k8 {
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
            } catch (PrivilegedActionException e7) {
                throw new RuntimeException("Could not initialize intrinsics", e7.getCause());
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
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // v7.k8
    public final boolean a(o oVar, c cVar, c cVar2) {
        return j.a(a, oVar, b, cVar, cVar2);
    }

    @Override // v7.k8
    public final boolean b(o oVar, Object obj, Object obj2) {
        return k.a(a, oVar, d, obj, obj2);
    }

    @Override // v7.k8
    public final boolean c(o oVar, n nVar, n nVar2) {
        return i.a(a, oVar, c, nVar, nVar2);
    }

    @Override // v7.k8
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

    @Override // v7.k8
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

    @Override // v7.k8
    public final void f(n nVar, n nVar2) {
        a.putObject(nVar, f, nVar2);
    }

    @Override // v7.k8
    public final void g(n nVar, Thread thread) {
        a.putObject(nVar, e, thread);
    }
}
