package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class c5 extends q4 {
    private static final Map zzb = new ConcurrentHashMap();
    protected g6 zzc;
    private int zzd;

    public c5() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = g6.e;
    }

    public static h5 b(h5 h5Var) {
        int size = h5Var.size();
        return h5Var.zzg(size == 0 ? 10 : size + size);
    }

    public static Object c(Method method, c5 c5Var, Object... objArr) {
        try {
            return method.invoke(c5Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
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

    public static void e(Class cls, c5 c5Var) {
        c5Var.d();
        zzb.put(cls, c5Var);
    }

    public static c5 k(Class cls) {
        Map map = zzb;
        c5 c5Var = (c5) map.get(cls);
        if (c5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c5Var = (c5) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (c5Var != null) {
            return c5Var;
        }
        c5 c5Var2 = (c5) ((c5) p6.g(cls)).h(6, null);
        if (c5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, c5Var2);
        return c5Var2;
    }

    @Override // com.google.android.gms.internal.cast.q4
    public final int a(e6 e6Var) {
        if (g()) {
            int g7 = e6Var.g(this);
            if (g7 >= 0) {
                return g7;
            }
            throw new IllegalStateException(ic.a.i(g7, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int g10 = e6Var.g(this);
        if (g10 < 0) {
            throw new IllegalStateException(ic.a.i(g10, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | g10;
        return g10;
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
        return b6.c.a(getClass()).c(this, (c5) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean g() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    public abstract Object h(int i10, c5 c5Var);

    public final int hashCode() {
        if (g()) {
            return b6.c.a(getClass()).b(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int b10 = b6.c.a(getClass()).b(this);
        this.zza = b10;
        return b10;
    }

    public final int i() {
        if (g()) {
            int g7 = b6.c.a(getClass()).g(this);
            if (g7 >= 0) {
                return g7;
            }
            throw new IllegalStateException(ic.a.i(g7, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int g10 = b6.c.a(getClass()).g(this);
        if (g10 < 0) {
            throw new IllegalStateException(ic.a.i(g10, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | g10;
        return g10;
    }

    public final b5 j() {
        return (b5) h(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = v5.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        v5.c(this, sb2, 0);
        return sb2.toString();
    }
}
