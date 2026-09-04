package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class h5 extends v4 {
    private static final Map zzb = new ConcurrentHashMap();
    protected l6 zzc;
    private int zzd;

    public h5() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = l6.e;
    }

    public static m5 b(m5 m5Var) {
        int size = m5Var.size();
        return m5Var.zzg(size == 0 ? 10 : size + size);
    }

    public static Object c(Method method, h5 h5Var, Object... objArr) {
        try {
            return method.invoke(h5Var, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void e(Class cls, h5 h5Var) {
        h5Var.d();
        zzb.put(cls, h5Var);
    }

    public static h5 k(Class cls) {
        Map map = zzb;
        h5 h5Var = (h5) map.get(cls);
        if (h5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                h5Var = (h5) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (h5Var != null) {
            return h5Var;
        }
        h5 h5Var2 = (h5) ((h5) u6.g(cls)).h(6, null);
        if (h5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, h5Var2);
        return h5Var2;
    }

    @Override // com.google.android.gms.internal.cast.v4
    public final int a(j6 j6Var) {
        if (g()) {
            int g10 = j6Var.g(this);
            if (g10 >= 0) {
                return g10;
            }
            throw new IllegalStateException(i2.g.i(g10, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int g11 = j6Var.g(this);
        if (g11 < 0) {
            throw new IllegalStateException(i2.g.i(g11, "serialized size must be non-negative, was "));
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
        return g6.c.a(getClass()).c(this, (h5) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean g() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    public abstract Object h(int i10, h5 h5Var);

    public final int hashCode() {
        if (g()) {
            return g6.c.a(getClass()).b(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int b10 = g6.c.a(getClass()).b(this);
        this.zza = b10;
        return b10;
    }

    public final int i() {
        if (g()) {
            int g10 = g6.c.a(getClass()).g(this);
            if (g10 >= 0) {
                return g10;
            }
            throw new IllegalStateException(i2.g.i(g10, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int g11 = g6.c.a(getClass()).g(this);
        if (g11 < 0) {
            throw new IllegalStateException(i2.g.i(g11, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | g11;
        return g11;
    }

    public final g5 j() {
        return (g5) h(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = a6.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        a6.c(this, sb2, 0);
        return sb2.toString();
    }
}
