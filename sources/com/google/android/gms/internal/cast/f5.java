package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class f5 extends t4 {
    private static final Map zzb = new ConcurrentHashMap();
    protected j6 zzc;
    private int zzd;

    public f5() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = j6.e;
    }

    public static k5 b(k5 k5Var) {
        int size = k5Var.size();
        return k5Var.zzg(size == 0 ? 10 : size + size);
    }

    public static Object c(Method method, f5 f5Var, Object... objArr) {
        try {
            return method.invoke(f5Var, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void e(Class cls, f5 f5Var) {
        f5Var.d();
        zzb.put(cls, f5Var);
    }

    public static f5 k(Class cls) {
        Map map = zzb;
        f5 f5Var = (f5) map.get(cls);
        if (f5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                f5Var = (f5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (f5Var != null) {
            return f5Var;
        }
        f5 f5Var2 = (f5) ((f5) s6.g(cls)).h(6, null);
        if (f5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, f5Var2);
        return f5Var2;
    }

    @Override // com.google.android.gms.internal.cast.t4
    public final int a(h6 h6Var) {
        if (g()) {
            int g10 = h6Var.g(this);
            if (g10 >= 0) {
                return g10;
            }
            throw new IllegalStateException(j7.l1.k(g10, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int g11 = h6Var.g(this);
        if (g11 < 0) {
            throw new IllegalStateException(j7.l1.k(g11, "serialized size must be non-negative, was "));
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
        return e6.c.a(getClass()).c(this, (f5) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean g() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    public abstract Object h(int i10, f5 f5Var);

    public final int hashCode() {
        if (g()) {
            return e6.c.a(getClass()).b(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int b10 = e6.c.a(getClass()).b(this);
        this.zza = b10;
        return b10;
    }

    public final int i() {
        if (g()) {
            int g10 = e6.c.a(getClass()).g(this);
            if (g10 >= 0) {
                return g10;
            }
            throw new IllegalStateException(j7.l1.k(g10, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int g11 = e6.c.a(getClass()).g(this);
        if (g11 < 0) {
            throw new IllegalStateException(j7.l1.k(g11, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | g11;
        return g11;
    }

    public final e5 j() {
        return (e5) h(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = y5.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        y5.c(this, sb2, 0);
        return sb2.toString();
    }
}
