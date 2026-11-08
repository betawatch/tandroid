package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class b5 extends q4 {
    private static final Map zzb = new ConcurrentHashMap();
    protected f6 zzc;
    private int zzd;

    public b5() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = f6.e;
    }

    public static g5 b(g5 g5Var) {
        int size = g5Var.size();
        return g5Var.zzg(size == 0 ? 10 : size + size);
    }

    public static Object c(Method method, b5 b5Var, Object... objArr) {
        try {
            return method.invoke(b5Var, objArr);
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

    public static void e(Class cls, b5 b5Var) {
        b5Var.d();
        zzb.put(cls, b5Var);
    }

    public static b5 k(Class cls) {
        Map map = zzb;
        b5 b5Var = (b5) map.get(cls);
        if (b5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                b5Var = (b5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (b5Var != null) {
            return b5Var;
        }
        b5 b5Var2 = (b5) ((b5) o6.g(cls)).h(6, null);
        if (b5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, b5Var2);
        return b5Var2;
    }

    @Override // com.google.android.gms.internal.cast.q4
    public final int a(d6 d6Var) {
        if (g()) {
            int g10 = d6Var.g(this);
            if (g10 >= 0) {
                return g10;
            }
            throw new IllegalStateException(jg.g.j(g10, "serialized size must be non-negative, was "));
        }
        int i7 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int g11 = d6Var.g(this);
        if (g11 < 0) {
            throw new IllegalStateException(jg.g.j(g11, "serialized size must be non-negative, was "));
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
        return a6.c.a(getClass()).c(this, (b5) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean g() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    public abstract Object h(int i7, b5 b5Var);

    public final int hashCode() {
        if (g()) {
            return a6.c.a(getClass()).b(this);
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int b10 = a6.c.a(getClass()).b(this);
        this.zza = b10;
        return b10;
    }

    public final int i() {
        if (g()) {
            int g10 = a6.c.a(getClass()).g(this);
            if (g10 >= 0) {
                return g10;
            }
            throw new IllegalStateException(jg.g.j(g10, "serialized size must be non-negative, was "));
        }
        int i7 = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int g11 = a6.c.a(getClass()).g(this);
        if (g11 < 0) {
            throw new IllegalStateException(jg.g.j(g11, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & TLObject.FLAG_31) | g11;
        return g11;
    }

    public final a5 j() {
        return (a5) h(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = u5.a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        u5.c(this, sb2, 0);
        return sb2.toString();
    }
}
