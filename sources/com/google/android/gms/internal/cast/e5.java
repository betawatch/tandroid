package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class e5 extends t4 {
    private static final Map zzb = new ConcurrentHashMap();
    protected i6 zzc;
    private int zzd;

    public e5() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = i6.e;
    }

    public static j5 b(j5 j5Var) {
        int size = j5Var.size();
        return j5Var.zzg(size == 0 ? 10 : size + size);
    }

    public static Object c(Method method, e5 e5Var, Object... objArr) {
        try {
            return method.invoke(e5Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void e(Class cls, e5 e5Var) {
        e5Var.d();
        zzb.put(cls, e5Var);
    }

    public static e5 k(Class cls) {
        Map map = zzb;
        e5 e5Var = (e5) map.get(cls);
        if (e5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                e5Var = (e5) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (e5Var != null) {
            return e5Var;
        }
        e5 e5Var2 = (e5) ((e5) r6.g(cls)).h(6, null);
        if (e5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, e5Var2);
        return e5Var2;
    }

    @Override // com.google.android.gms.internal.cast.t4
    public final int a(g6 g6Var) {
        if (g()) {
            int g10 = g6Var.g(this);
            if (g10 >= 0) {
                return g10;
            }
            throw new IllegalStateException(kf.k0.j(g10, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int g11 = g6Var.g(this);
        if (g11 < 0) {
            throw new IllegalStateException(kf.k0.j(g11, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | g11;
        return g11;
    }

    public final void d() {
        this.zzd &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return d6.c.a(getClass()).c(this, (e5) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean g() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    public abstract Object h(int i10, e5 e5Var);

    public final int hashCode() {
        if (g()) {
            return d6.c.a(getClass()).b(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int b10 = d6.c.a(getClass()).b(this);
        this.zza = b10;
        return b10;
    }

    public final int i() {
        if (g()) {
            int g10 = d6.c.a(getClass()).g(this);
            if (g10 >= 0) {
                return g10;
            }
            throw new IllegalStateException(kf.k0.j(g10, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int g11 = d6.c.a(getClass()).g(this);
        if (g11 < 0) {
            throw new IllegalStateException(kf.k0.j(g11, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | g11;
        return g11;
    }

    public final d5 j() {
        return (d5) h(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = x5.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        x5.c(this, sb, 0);
        return sb.toString();
    }
}
